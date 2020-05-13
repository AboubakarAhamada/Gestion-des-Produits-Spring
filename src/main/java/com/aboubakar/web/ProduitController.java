/**
 * 
 */
package com.aboubakar.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aboubakar.dao.ProduitRepository;
import com.aboubakar.dao.UserRepository;
import com.aboubakar.entities.Produit;
import com.aboubakar.entities.User;

/**
 * @author Aboubakar
 *
 */
@Controller
public class ProduitController {
	@Autowired
	private ProduitRepository produitRepository;
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value= {"/","/index","/login"})
	public String index() {
		return "login";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "redirect:/chercher";
	}
	
	@RequestMapping(value="/sigin")
	public String login(User user, HttpServletRequest request) {
		//System.out.println(user.toString());
		List<User> users = userRepository.findAll();
		//users.forEach((u)->System.out.println(u.toString()));
		for(User u : users) {
			if(u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword())) {
				
				HttpSession session = request.getSession();
				session.setAttribute("username", u.getName());
				session.setMaxInactiveInterval(300);

				return "redirect:/chercher";
			}
		}
		return "login";
	}
	
	@RequestMapping(value="/logout")
	public String logout( HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("username");
		return "redirect:/login";
	}
	
	@RequestMapping("/chercher")
	public String home( Model model,
			@RequestParam(name="page",defaultValue="0")int p,
			@RequestParam(name="size",defaultValue="5")int s,
			@RequestParam(name="motCle",defaultValue="")String motCle) {
		
		Pageable paging = PageRequest.of(p, s);
		
		Page<Produit>pageProduits = produitRepository.chercher("%"+motCle+"%",paging);
		
		//Page<Produit>pageProduits = produitRepository.findAll(paging);
		
		// Note : la méthode getContent() var retourner une liste de Produits de taille s.
		
		model.addAttribute("pageProduits",pageProduits.getContent());
		int[] pages = new int[pageProduits.getTotalPages()];
		model.addAttribute("pages",pages);
		model.addAttribute("size",s);
		model.addAttribute("pageCourante",p);
		model.addAttribute("motCle", motCle);
		return "produits";
	}
	
	// Cette méthode renvoie la vue pour saisir un nouveau produit
	
	@RequestMapping("/nouveau")
	public String formCreate(Model model) {
		model.addAttribute("produit",new Produit());
		return "ajouterProduit";
	}
	
	// Cette méthode enregistre un nouveau produit dans la base de données
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(Model model, @Valid Produit produit, BindingResult bindingResult) {
		
		// S'il y a des erreurs de validation on reste sur la même page
		
		if(bindingResult.hasErrors()) {
			return "ajouterProduit";
		}
		
		// Sinon on enregistre les données et on redirige l'utilisateur vers la page de confirmation
		
		produitRepository.save(produit);
		model.addAttribute("produit",produit);
		return "produit-info";
	}
	
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public String formEdit(Model model, Long id) {
		Produit produit = produitRepository.getOne(id);
		model.addAttribute("produit", produit);
		return "editerProduit";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id,int page,int size) {
		produitRepository.deleteById(id);
		return "redirect:/chercher?page="+page+"&size="+size;
	}
	
}

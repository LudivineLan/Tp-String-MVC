package com.infotel.TpSpringMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infotel.TpSpringMVC.metier.Personne;
import com.infotel.TpSpringMVC.service.IService;

@Controller
public class PersonneController {
	
	@Autowired
    private IService service;
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String lister(Model model) {
        model.addAttribute("personne", new Personne());
        model.addAttribute("personnes", service.findAllPErsonne());
        return "personnes";
    }
    @RequestMapping(value = "/savePersonne")
    public String save(Personne personne,  Model model) {
        if (personne.getIdPersonne() == 0) {
            service.ajouterPersonne(personne);
            model.addAttribute("personne", new Personne());
            model.addAttribute("personnes", service.findAllPErsonne());
            return "personnes";
        } else {
			service.modifierPersonne2(personne);
            model.addAttribute("personne", new Personne());
            model.addAttribute("personnes", service.findAllPErsonne());
            return "personnes";
        }
    }
    
    @RequestMapping(value = "/deletePersonne")
    public String delete(@RequestParam int idPersonne, Model model) {
        service.supprimerPersonneById(idPersonne);
        model.addAttribute("personne", new Personne());
        model.addAttribute("personnes", service.findAllPErsonne());
        return "personnes";
    }
    @RequestMapping(value = "/editPersonne")
    public String edit(@RequestParam int idPersonne, Model model) {
		model.addAttribute("personne", service.getPersonne(idPersonne));
        model.addAttribute("personnes", service.findAllPErsonne());
        return "personnes";
    }

}

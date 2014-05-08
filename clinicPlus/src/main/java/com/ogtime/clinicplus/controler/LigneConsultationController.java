package com.ogtime.clinicplus.controler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ogtime.clinicplus.metier.implement.LigneConsultationMetier;

@Controller
@RequestMapping(value="/ligneConsultation")
public class LigneConsultationController {

	@SuppressWarnings("unused")
	private LigneConsultationMetier ligneConsultationMetier;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView ajouterLigneConsultation() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("ligneConsultation", new LigneConsultationMetier());
		return modelAndView;
	}

}

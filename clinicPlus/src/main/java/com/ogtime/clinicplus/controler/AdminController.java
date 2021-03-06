package com.ogtime.clinicplus.controler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ogtime.clinicplus.metier.implement.AdminMetier;

@Controller
@RequestMapping(value="/admin")
public class AdminController {

	@SuppressWarnings("unused")
	private AdminMetier adminMetier;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView ajouterAdmin() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("admin", new AdminMetier());
		return modelAndView;
	}

}


package com.ogtime.clinicplus.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ogtime.clinicplus.metier.implement.RendezvousMetier;

@Controller
@RequestMapping(value="/rendezvous")
public class RendezvousController {
	
	@Autowired
	private RendezvousMetier rendezvousMetier;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView ajouterRendezvous() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("rendezvous", new RendezvousMetier());
		return modelAndView;
	}

}

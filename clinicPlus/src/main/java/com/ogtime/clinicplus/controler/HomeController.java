package com.ogtime.clinicplus.controler;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
				
		return "index";
	}
	
	
	//Login
	@RequestMapping(value = "/redirectLogin", method = RequestMethod.GET)
	public String redirectLogin() {
	     
	    return "redirect:adminLogin";
	}
	   
	@RequestMapping(value = "/adminLogin", method = RequestMethod.GET)
	public String adminLogin() {
	     
	    return "admin/pages/connection/login";
	}
	
	
	//Admin
	@RequestMapping(value = "/redirectAdmin", method = RequestMethod.POST)
	public String redirectAdmin() {
	     
	    return "redirect:admin";
	}
	   
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admin() {
	     
	    return "admin/admin";
	}
	
	
	//Calendar
	@RequestMapping(value = "/redirectCalendar", method = RequestMethod.GET)
	public String redirectCalendar() {
	     
	    return "redirect:calendar";
	}
	   
	@RequestMapping(value = "/calendar", method = RequestMethod.GET)
	public String calendar() {
	     
	    return "admin/pages/calendar";
	}
	
	//Admin Part
	//Liste Patients
	@RequestMapping(value = "/redirectPatientsListe", method = RequestMethod.GET)
	public String redirectPatientsListe() {
		     
		return "redirect:patientsListe";
	}
		   
	@RequestMapping(value = "/patientsListe", method = RequestMethod.GET)
	public String patientsListe() {
		     
		return "admin/pages/patientsListe";
	}
	

	//Enregistrer Patients
	@RequestMapping(value = "/redirectPatientsEnregistrer", method = RequestMethod.GET)
	public String redirectPatientsEnregistrer() {
			     
		return "redirect:patientsEnregistrer";
	}
			   
	@RequestMapping(value = "/patientsEnregistrer", method = RequestMethod.GET)
	public String patientsEnregistrer() {
			     
		return "admin/pages/patientsEnregistrer";
	}
	

	//Dossier Patients
	@RequestMapping(value = "/redirectPatientsDossier", method = RequestMethod.GET)
	public String redirectPatientsDossier() {
				     
		return "redirect:patientsDossier";
	}
				   
	@RequestMapping(value = "/patientsDossier", method = RequestMethod.GET)
	public String patientsDossier() {
				     
		return "admin/pages/patientsDossier";
	}
	
	//Notification Patients
		@RequestMapping(value = "/redirectPatientsNotification", method = RequestMethod.GET)
		public String redirectPatientsNotification() {
					     
			return "redirect:patientsNotification";
		}
					   
		@RequestMapping(value = "/patientsNotification", method = RequestMethod.GET)
		public String patientsNotification() {
					     
			return "admin/pages/patientsNotification";
		}
	
	//Rendez-vous Liste
	@RequestMapping(value = "/redirectRendezVousListe", method = RequestMethod.GET)
	public String redirectRendezVousListe() {
					     
		return "redirect:rendezVousListe";
	}
					   
	@RequestMapping(value = "/rendezVousListe", method = RequestMethod.GET)
	public String rendezVousListe() {
					     
		return "admin/pages/rendezVousListe";
	}
	
	//Rendez-vous Ceduler
	@RequestMapping(value = "/redirectRendezVousCeduler", method = RequestMethod.GET)
	public String redirectRendezVousCeduler() {
						     
		return "redirect:rendezVousCeduler";
	}
						   
	@RequestMapping(value = "/rendezVousCeduler", method = RequestMethod.GET)
	public String rendezVousCeduler() {
						     
		return "admin/pages/rendezVousCeduler";
	}
	
	//Rendez-vous Ceduler
		@RequestMapping(value = "/redirectRendezVousConsultation", method = RequestMethod.GET)
		public String redirectRendezVousConsultation() {
							     
			return "redirect:rendezVousConsultation";
		}
							   
		@RequestMapping(value = "/rendezVousConsultation", method = RequestMethod.GET)
		public String rendezVousConsultation() {
							     
			return "admin/pages/rendezVousConsultation";
		}
	
}

package com.ogtime.clinicplus;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ogtime.clinicplus.entities.Clinique;
import com.ogtime.clinicplus.entities.Patient;
import com.ogtime.clinicplus.metier.IPatientMetier;

public class TestJPA {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test1() {
		try{
			ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
			assertTrue(true);
		}catch(Exception ex){
			assertTrue(ex.getMessage(),false);
		}
	}
	
	@Test
	public void test2() {
		try{
			ClassPathXmlApplicationContext context=
					new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
					IPatientMetier metier=(IPatientMetier) context.getBean("metier");
					List<Clinique> listClinique1=metier.listCliniques();
					metier.ajouterClinique(new Clinique("pat1", "pat1", "pat1", "pat1", "pat1", "pat1", "pat1", "pat1"));
					metier.ajouterClinique(new Clinique("pat1", "pat1", "pat1", "pat1", "pat1", "pat1", "pat1", "pat1"));
					
					
					List<Clinique> listClinique2=metier.listCliniques();
					assertTrue(listClinique2.size()==listClinique1.size()+2);			
			
		}catch(Exception ex){
			assertTrue(ex.getMessage(),false);
		}
	}

}

package com.starter.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.starter.model.Person;
import com.starter.repository.PersonRepo;
 

  
@Controller
public class StarterHelloWorld {
	@Autowired
	private PersonRepo r;
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		System.out.println();
		List<Person> people = getAllPeople(); 
		return new ModelAndView("welcome", "people", people);
	}
	
	private List<Person> getAllPeople() {
		List<Person> myPeople = r.findAllPersons();	
		return myPeople;
	}
}
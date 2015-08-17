package com.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.starter.controller.beans.PersonBean;
import com.starter.model.Person;
import com.starter.repository.PersonRepo;

@Controller
public class InsertData {
	
	@Autowired
	private PersonRepo r;
	
	@RequestMapping("/insert")
	public ModelAndView addData(@ModelAttribute PersonBean p) {

		String message = "passed through insert";
		addToDB();
		
		return new ModelAndView("welcome", "message", message);
	}
	
	//TODO-01: make this work with welcome.jsp
	private void addToDB(){
		r.addPerson("inserted");
	}

}

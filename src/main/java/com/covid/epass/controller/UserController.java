package com.covid.epass.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.covid.epass.model.UserPojo;
import com.covid.epass.repository.Userrepo;

@Controller
public class UserController {
	@Autowired
	Userrepo repo;
	//Adds the applied user to database
	@RequestMapping("/addUser")
	public String addUser(UserPojo userPojo) {
		repo.save(userPojo);
		return "frontpage.jsp";
	}

	//Allows user to track their application
	@RequestMapping("/check")
	public ModelAndView trackApplication(@RequestParam("proofno") String aadhar) {
		List<UserPojo> list=new ArrayList<UserPojo>();
		list.addAll(repo.findByProofno(aadhar));
		ModelAndView mv = new ModelAndView("displaytouser.jsp");
		mv.addObject("lists",list);
		return mv;
	}
	
}

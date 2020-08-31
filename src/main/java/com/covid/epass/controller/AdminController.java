package com.covid.epass.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.covid.epass.model.Api;
import com.covid.epass.model.UserPojo;
import com.covid.epass.repository.Userrepo;

@Controller
public class AdminController {
@Autowired
	Userrepo repo;

    //Front page 
	@RequestMapping("/")
	public String showHomePage() {
		return "frontpage.jsp";
	}

	//Login for admin
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String adminLogin() {
		return "home.jsp";
	}
	
	//Provides the details of selected user
	@RequestMapping(value="/go/{aid}",method=RequestMethod.GET)
	public ModelAndView showDetailsOfSelectedUser(@PathVariable("aid") int aid) throws IOException, ParseException, org.json.simple.parser.ParseException, InterruptedException {
		UserPojo userPojo=repo.findById(aid).orElse(new UserPojo());
		ModelAndView mv=new ModelAndView("/showdetails.jsp");
		List list=Api.getCovidCount(userPojo.getDistrict(),userPojo.getDestination());
		mv.addObject("alien",userPojo);
		//mv.addObject(result);
		mv.addObject("List",list);
		return mv;
	}

	//Allows admin to select the choice to sort user
	@RequestMapping("/adminVerify")
	public String sortUsersBy() {
		return "Adminref.jsp";
	}
	
	//Lists the details of user by providing aadhar number
	@RequestMapping("/aadhar")
	public ModelAndView selectUserByAadhar(@RequestParam String aadhar) {
		List<UserPojo> list=new ArrayList<UserPojo>();
		list.addAll(repo.findByProofno(aadhar));
		ModelAndView mv = new ModelAndView("displayAlien.jsp");
		mv.addObject("lists",list);
		return mv;
	}
	
	//List the users based on status of application
	@RequestMapping("/status")
	public ModelAndView sortUsersByStatus(@RequestParam String status) {
		List<UserPojo> list=new ArrayList<UserPojo>();
		list.addAll(repo.findByStatus(status));
		ModelAndView mv = new ModelAndView("displayAlien.jsp");
		mv.addObject("lists",list);
		return mv;
	}
	
	//logs out admin
	 @RequestMapping(value="/logout", method=RequestMethod.GET)  
	    public String adminLogout(HttpServletRequest request, HttpServletResponse response) {  
	        Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
	        if (auth != null){      
	           new SecurityContextLogoutHandler().logout(request, response, auth);  
	        }  
	         return "redirect:/adminVerify";  
	     }  
}

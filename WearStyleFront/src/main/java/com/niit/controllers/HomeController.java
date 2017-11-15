package com.niit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.WearStyleBackend.DAO.UserDao;
import com.niit.WearStyleBackend.model.User;

@Controller
public class HomeController
{
	@Autowired
	UserDao userdao;
	
	@RequestMapping("/reg")
	String registerPage(Model m)
	{
		m.addAttribute("msg", "This is Registration Page..............");
		
		return "register";
	}
	@RequestMapping("/mdemo")
	ModelAndView modelandView()
	{
		ModelAndView m=new ModelAndView("register");
		m.addObject("msg", "This is Registration Page...with ModelAndView Class...........");
		
		return m;
	}
	@RequestMapping("/path/{name}")
	ModelAndView pathvariable(@PathVariable("name") String name)
	{
		ModelAndView m=new ModelAndView("NewFile");
		m.addObject("msg","Hai..."+name+ "This is Registration Page...with ModelAndView Class...........");
		
		return m;
	}
	@RequestMapping("/save")
	ModelAndView save(@RequestParam("mail") String mail,@RequestParam("password") String password)
	{
		ModelAndView m=new ModelAndView("register");
		
		
		User u=new User();
		u.setEmail(mail);
		u.setPassword(password);
		
		userdao.saveUser(u);
		
		m.addObject("msg","Hai..."+mail+ " and Your Age is "+password+" ...This is Registration Page...with ModelAndView Class...........");
		
		return m;
	}
	

}

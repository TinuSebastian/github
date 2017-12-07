package com.niit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.WearStyleBackend.DAO.CategoryDao;
import com.niit.WearStyleBackend.DAO.SupplierDao;
import com.niit.WearStyleBackend.model.Category;
import com.niit.WearStyleBackend.model.Supplier;
@Controller
public class SupplierController
{
	@Autowired
	SupplierDao sdao;

	@RequestMapping(value="/supplier")
	String category(Model m)
	{
		List<Supplier> slist=sdao.getSuppliers();
		System.out.println("Supplier List :"+slist);
		m.addAttribute("slist", slist);
		return "supplier";
	}
	@RequestMapping(value="/saveS")
	String saveSupplier(@RequestParam("sname")String name,@RequestParam("saddress")String address)
	{
		Supplier s=new Supplier();
		s.setSuppliername(name);
		s.setSupplieraddress(address);
		
		sdao.saveSupplier(s);
		return "redirect:/supplier";
	}
	@RequestMapping(value="/deleteS")
	String deletes(@RequestParam("sid")int sid)
	{
		Supplier s=sdao.getSupplier(sid);
		sdao.deleteSupplier(s);
		
		return "redirect:/supplier";
	}
	@RequestMapping(value="/updateS")
	String update(@RequestParam("sid")int sid,Model m)
	{
		Supplier s=sdao.getSupplier(sid);
		
		m.addAttribute("supplier", s);
		return "supplierup";
	}

}
	
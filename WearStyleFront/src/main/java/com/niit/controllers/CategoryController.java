package com.niit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.WearStyleBackend.DAO.CategoryDao;
import com.niit.WearStyleBackend.model.Category;

@Controller
public class CategoryController
{
	@Autowired
	CategoryDao cdao;
	@RequestMapping(value="/adminAd")
	String category(Model m)
	{
		List<Category> clist=cdao.getCategorys();
		System.out.println("Category List :"+clist);
		m.addAttribute("clist", clist);
		return "adminpage";
	}
	
	@RequestMapping(value="/saveC")
	String saveCategory(@RequestParam("cname")String name,@RequestParam("cdesc")String desc)
	{
		Category c=new Category();
		c.setCategoryname(name);
		c.setCategorydescription(desc);
		
		cdao.saveCategory(c);
		return "redirect:/adminAd";
	}
	@RequestMapping(value="/deleteC")
	String deletec(@RequestParam("cid")int cid)
	{
		Category c=cdao.getCategory(cid);
		cdao.deleteCategory(c);
		
		return "redirect:/adminAd";
	}
	@RequestMapping(value="/updateC")
	String update(@RequestParam("cid")int cid,Model m)
	{
		Category c=cdao.getCategory(cid);
		
		m.addAttribute("category", c);
		return "categoryup";
	}

	@RequestMapping(value="/editC")
	String edit(@RequestParam("cid")String cid,@RequestParam("cname")String cname,@RequestParam("cdesc") String cdesc)
	{
		Category category=new Category();
		category.setCid(Integer.parseInt(cid));
		category.setCategoryname(cname);
		category.setCategorydescription(cdesc);
		cdao.updateCategory(category);
		return "categoryup";
	}

}

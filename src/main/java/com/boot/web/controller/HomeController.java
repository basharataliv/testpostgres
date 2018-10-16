package com.boot.web.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.boot.web.dao.Dao;

import com.boot.web.model.Model;

@RestController
public class HomeController 
{
@Autowired
Dao dao;

@RequestMapping("/")
public String home()
	{
		
	return "home";
}
@RequestMapping(value="/add/post",method = RequestMethod.POST)
public Model home(Model model )
{
	dao.save(model);	
	return model;
}
@ResponseBody 
@RequestMapping(path="/alian",produces= {"application/json"}) 
	public /*String*/ List<Model>Show() 
		{
	return dao.findAll();
		}
			
		
//@ResponseBody 
//@RequestMapping(value="/delete",method = RequestMethod.POST)
//	public String Delete(@RequestParam("aid") int aid)
//		{
//	Model mp=dao.getOne(aid);
//	dao.delete(mp);
//	 return "Successfully deleted";
//		}
}

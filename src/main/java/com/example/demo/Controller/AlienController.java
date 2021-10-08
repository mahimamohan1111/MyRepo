package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienDao;
import com.example.demo.model.Alien;

@Controller
public class AlienController {

	@Autowired
	AlienDao dao;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		//dao.save(alien);
		System.out.println("I am here"+alien.getName());
		dao.save(alien);
		return "home.jsp";
	}

	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid)
	{
		//dao.save(alien);
		ModelAndView mv=new ModelAndView("ShowAlien.jsp");
		Alien alien=dao.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		System.out.println("I am here");
		System.out.println(dao.findByLang("jabva"));
		return mv;
	}
//Working on REST APIs
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens()
	{
		
	//	System.out.println(dao.findByLang("jabva"));
		return dao.findAll();
	}

}

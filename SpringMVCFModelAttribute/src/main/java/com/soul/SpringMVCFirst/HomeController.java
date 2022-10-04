package com.soul.SpringMVCFirst;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@ModelAttribute
	public void modelData(Model m) {

		m.addAttribute("name", "Aliens");
	}
	
	@RequestMapping("/")
	public String Home() {
		return "index";
	}

	@RequestMapping("/add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m) {

		
		/*
		 * ModelAndView mv= new ModelAndView(); mv.setViewName("result");
		 */
		 
		//mv.setViewName("result");
		
		int num3 = i + j;
		//mv.addObject("num3", num3);

		m.addAttribute("num3", num3);
		return "result";
	}
	
	@PostMapping(value="addalien")
	public String addAlien(@ModelAttribute("alien") Alien al,Model m) {
		/*
		 * Alien alien= new Alien();
		 * 
		 * alien.setAid(100); alien.setAname("Navin");
		 * 
		 * 
		 * m.addAttribute("shraddha", al);
		 */
		return "result";
		
	}
	
	@GetMapping("getaliens")
	public String getAliens(Model m) {
		
		List<Alien> list=new ArrayList<Alien>();
		list.add(new Alien(1,"kiyara"));
		list.add(new Alien(2,"pini"));
		
		m.addAttribute("getaliens",list);
		
		return "showaliens";
	}
	
	

}

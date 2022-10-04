package com.soul.SpringMVCFirst;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@ModelAttribute
	public void modelData(Model m) {

		m.addAttribute("name","Aliens");
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

		// mv.setViewName("result");

		int num3 = i + j;
		// mv.addObject("num3", num3);

		m.addAttribute("num3", num3);
		return "result";
	}
	
	  @RequestMapping("addalien") 
	  public String addAlien(@ModelAttribute("result") Alien a) {
	
		
		return "result";
	 
	 }
	

}

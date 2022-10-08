package com.soul.SpringMVCFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@Autowired
	 AlienRepo repo;
	
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
	public String addAlien(@ModelAttribute Alien al,Model m) {
		/*
		 * Alien alien= new Alien();
		 * 
		 * alien.setAid(100); alien.setAname("Navin");
		 * 
		 * 
		 * m.addAttribute("shraddha", al);
		 */
	    repo.save(al); //add alien to database 
	    m.addAttribute("addalien",al);//show added alien the result page 
		return "result";
		
	}
	
	@GetMapping("getalience")
	public String getAliens(@RequestParam int aid,Model m) {
		
		/*
		 * List<Alien> list=new ArrayList<Alien>(); list.add(new Alien(1,"kiyara"));
		 * list.add(new Alien(2,"pini"));
		 */
		
		m.addAttribute("getalience", repo.getOne(aid)); // to get one record based on the id from database 
		m.addAttribute("getalience",repo.findAll());//it will fetch all the elements from datavbase
		
		return "showaliens";
	}
	
	@GetMapping("rmalien")
	public String removeAlien(@ModelAttribute Alien al,Model m) {
		
		repo.deleteById(al.getAid());//remove alien by id 
		m.addAttribute("rmalien",al);
		return "showaliens";
	}

	@GetMapping("getAlienByName")
	public String getAlienceByName(@RequestParam String aname,Model m) {
		
	//m.addAttribute("getAlienByName",repo.findByAname(aname)); Fetch the record based on the name 
		//m.addAttribute("getAlienByName",repo.findByAnameOrderByAidAsc(aname));//find alience by nameof alien from database
		
		//m.addAttribute("getAlienByName",repo.findByAnameOrderByAidDesc(aname));
		                    
		m.addAttribute("getAlienByName",repo.find(aname)); // find records by using HQL
		return "showaliens";
	}
	
	
	
}

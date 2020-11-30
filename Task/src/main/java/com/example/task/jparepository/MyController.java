package com.example.task.jparepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.task.jparepository.model.Customer;
import com.example.task.jparepository.repository.CustomerRepository;


@Controller
public class MyController {
	@Autowired
	CustomerRepository cr;
	@RequestMapping("/")
	public String index() {
		return "index";
		
	}
	
	@PostMapping("/index")
	public String register(@ModelAttribute("register") Customer Customer,Model m) {
		cr.save(Customer);
		
		m.addAttribute("alert","Insertion is Done");
		return "index";
		
	}

}

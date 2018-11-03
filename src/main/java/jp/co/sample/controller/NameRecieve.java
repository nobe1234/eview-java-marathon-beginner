package jp.co.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nameRecieve")
public class NameRecieve {

	@RequestMapping("/index")
	public String index() {
		return "/name/inputName";
	}
	
	@RequestMapping("/output")
	public String toOutput(String name,Model model) {
		model.addAttribute("name", name);
		return "/name/outputname";
	}

}

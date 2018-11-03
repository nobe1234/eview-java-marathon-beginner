package jp.co.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userinfo")
public class Userinfo {

	@RequestMapping("/index")
	public String index() {
		return "/info/inputUserInfo";		
	}
	
	@RequestMapping("/output")
	public String output(String name,Integer age,String address,Model model) {
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		model.addAttribute("address",address);
		return "/info/outputuserinfo";
	}
}

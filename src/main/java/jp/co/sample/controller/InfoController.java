package jp.co.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Info;
import jp.co.sample.form.InfoForm;
import jp.co.sample.repository.InfoRepository;

@Controller
@RequestMapping("/infouser")
public class InfoController {

	@ModelAttribute
	public InfoForm setUpForm() {
		return new InfoForm();
	}
	
	@Autowired
	private InfoRepository repository;
	
	@RequestMapping("/index")
	public String index() {
		return "/search/userinfosearch";
	}
	
	@RequestMapping("/infoview")
	public String userInfoView(Model model,Integer id) {
		Info info = repository.load(id);
		model.addAttribute("info", info);
		
		return "/search/userinfoview";
	}
}

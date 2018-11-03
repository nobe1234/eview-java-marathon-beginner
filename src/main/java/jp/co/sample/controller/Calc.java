package jp.co.sample.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calc")
public class Calc {

	@Autowired
	private HttpSession session;
	
	@RequestMapping("/index")
	public String index() {
		
		return  "/calc/inputvalue";
		
	}
	
	
	@RequestMapping("/output1")
	public String output1(Integer num1,Integer num2) {
		int answer = num1 + num2;
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("answer", answer);
		return "/calc/outputvalue";
	}
	
	@RequestMapping("/output2")
	public String output2() {
		return "/calc/output2";
	}
	
}

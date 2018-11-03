package jp.co.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class Register {

	@RequestMapping("/index")
	public String index() {
		return "/goods/buygoods";
	}

	@RequestMapping("/totalprice")
	public String showTotalPrice(Model model, Integer price1, Integer price2, Integer price3) {
		Integer totalprice = price1 + price2 + price3;
		Integer taxTotalprice = (int) (totalprice * 1.08);

		model.addAttribute("totalprice", totalprice);
		model.addAttribute("taxTotalprice", taxTotalprice);
		return "/goods/totalprice";
	}
}

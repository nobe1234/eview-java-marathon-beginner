package jp.co.sample.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Item;
import jp.co.sample.form.ItemForm;

@Controller
@RequestMapping("/startApp")
public class StartAppController {

	@Autowired
	private ServletContext application;

	@Autowired
	private HttpSession session;

	@ModelAttribute
	public ItemForm setUpCart() {
		return new ItemForm();
	}

	@RequestMapping("/index")
	public String index(Model model) {
		List<Item> itemList = new LinkedList<>();
		itemList.add(new Item("手帳ノート", 1000));
		itemList.add(new Item("文房具セット", 1500));
		itemList.add(new Item("ファイル", 2000));

		List<Item> cartList = new LinkedList<>();

		application.setAttribute("itemList", itemList);
		session.setAttribute("cartList", cartList);
		int totalPrice = 0;
		model.addAttribute("toralPrice",totalPrice);

		return "/item/itemAndCart";
	}

	@SuppressWarnings("unchecked")
	public String viewItemCart(Model model) {
		List<Item> cartList = (List<Item>) session.getAttribute("cartList");
		int totalPrice = 0;
		for(Item item : cartList) {
			totalPrice += item.getPrice();
		}
		
		model.addAttribute("totalPrice", totalPrice);
		
		return "/item/itemAndCart";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/itemAndCart")
	public String insertCart(Model model,ItemForm itemForm) {
		List<Item> itemList = (List<Item>) application.getAttribute("itemList");
		List<Item> cartList = (List<Item>) session.getAttribute("cartList");
		
		cartList.add(itemList.get(itemForm.getIndex()));
		return viewItemCart(model);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/deleteCart")
	public String deleteCart(Model model,int index) {
		List<Item> cartList = (List<Item>) session.getAttribute("cartList");
		
		cartList.remove(index);
		
		return viewItemCart(model);
	}

}

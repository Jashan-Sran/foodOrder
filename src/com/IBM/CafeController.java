package com.IBM;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class CafeController {
	
	@RequestMapping("/cafe")
	public String showWelcomePageOfCafe() {
		
		return "orderList";
	}
	
	@RequestMapping("/processOrder")
	public String process(HttpServletRequest request,Model theModel) {
	
		String userOrder = request.getParameter("list");
		
		theModel.addAttribute("yourOrder", userOrder);
		
		return "processOrder";
	}

}

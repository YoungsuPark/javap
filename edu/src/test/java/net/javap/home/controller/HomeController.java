package net.javap.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value="/home/openHome.do")
	public String home(){
		return "/home/mainHome";
	}
}

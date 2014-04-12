package com.hongil.www;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = "/")
	public ModelAndView main(Model model){
		ModelAndView mv = new ModelAndView();

		mv.setViewName("/main/index");
		return mv;
	}
	
}

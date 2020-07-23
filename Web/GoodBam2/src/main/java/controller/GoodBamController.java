package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GoodBamController {
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	

}

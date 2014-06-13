package kduraj.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	String message = "Welcome to your 1st Maven Spring project !";

	@RequestMapping("/hello")
	public String showMessage(Model model) {
		System.out.println("from controller");
        
        List<String> array = new ArrayList<>();
        array.add("Kevin");
        
        model.addAttribute("array", array);
        model.addAttribute("message", "Kevin Duraj");
        
        //return new ModelAndView("hello", "message", message);
        return "hello";        
	}
}

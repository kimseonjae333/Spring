package com.springMVC.chap11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example01Controller {
	public static Logger Logger = 
			LoggerFactory.getLogger(Example01Controller.class);
	@GetMapping("/exam01")
	public String requestMethod(Model model) {
		Logger.trace("Trace 메세지!");
		Logger.debug("Debug 메세지!");
		Logger.info("Info 메세지!");
		Logger.warn("Warn 메세지!");
		Logger.error("Error 메세지!");
		return "webpage11_01";
	}
}

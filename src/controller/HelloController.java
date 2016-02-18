package controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "hello")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}
}

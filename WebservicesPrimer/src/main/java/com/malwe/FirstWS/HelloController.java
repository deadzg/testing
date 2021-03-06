package com.malwe.FirstWS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/service/greeting")
public class HelloController {
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	 public @ResponseBody String getGreeting(@PathVariable String name) {
	  String result="Hello "+name;  
	  return result;

	}
	
	@RequestMapping(value = "/master", method = RequestMethod.GET)
	public String masterGreeting(){
		return "Hello All!!";
	}
}

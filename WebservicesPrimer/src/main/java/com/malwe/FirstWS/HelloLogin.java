package com.malwe.FirstWS;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
@RequestMapping("/login")
public class HelloLogin {
	
	@RequestMapping(value = "/{user}/{pass}", method = RequestMethod.GET)
	public String executeLogin(HttpServletRequest request, HttpServletResponse response, 
			@PathVariable String user, @PathVariable String pass) {
		if("sunny".equals(user)) {
			return "Login Success";
		}
		return "Invalid Creds";
	}
	
}

package gov.gp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class BaseActionController {

	//Second Commit..
	@RequestMapping(value = "/home.html", method = RequestMethod.GET)
	public String goHome(HttpServletRequest request) {
		return "index";
	}
}

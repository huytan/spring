package org.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public class HelloWorldController implements org.springframework.web.servlet.mvc.Controller {
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		String aMessage="Hello world";
		ModelAndView modelView = new ModelAndView("hello_world");
		modelView.addObject("message",aMessage);
		return modelView;
	}
}

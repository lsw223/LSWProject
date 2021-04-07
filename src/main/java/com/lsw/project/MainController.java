package com.lsw.project;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		logger.info("home");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "/test/main.do";
	}
	
	@RequestMapping(value = "/loginView.do", method = RequestMethod.GET)
	public String loginView() {
		logger.info("loginView");
		return "loginView";
	}
	
	@RequestMapping(value = /login.do)
	
}

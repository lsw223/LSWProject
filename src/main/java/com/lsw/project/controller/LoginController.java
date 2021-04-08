package com.lsw.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lsw.project.service.LoginService;
import com.lsw.project.vo.UserVO;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value = "/loginView.do", method = RequestMethod.GET)
	public String loginView() {
		logger.info("loginView");
		return "loginView";
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(HttpServletRequest request, Model model, HttpSession session) {
		String id = request.getParameter("id");
		
		UserVO userInfo = service.selectuser(id);
		
		model.addAttribute("id",id);
		model.addAttribute("userInfo",userInfo);
		session.setAttribute("userInfo",userInfo);
		
		logger.info("userInfo : {}, {}" + userInfo.getId()+ userInfo.getPass());
		
		return "redirect:/"; 
	}
}

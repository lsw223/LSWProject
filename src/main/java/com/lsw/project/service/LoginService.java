package com.lsw.project.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lsw.project.controller.MainController;
import com.lsw.project.dao.LoginDao;
import com.lsw.project.vo.UserVO;

@Service
public class LoginService {
	
	@Autowired
	LoginDao dao;
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	public UserVO selectuser(String id) {
		return dao.selectuser(id);
	}


}

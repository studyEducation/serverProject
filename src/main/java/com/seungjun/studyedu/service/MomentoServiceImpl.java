package com.seungjun.studyedu.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.seungjun.studyedu.dao.user.UserDAO;


@Service("momentoService")
public class MomentoServiceImpl implements MomentoService{
	
	@Autowired
	UserDAO userDAO;

	@Override
	public HashMap<String, Object> checkLoginInfo(String user_key) throws Exception {
		// TODO Auto-generated method stub
		return userDAO.checkLoginInfo(user_key);
		
	}

}

package com.seungjun.studyedu.dao.user;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seungjun.studyedu.mapper.MainDbDataMapper;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO{

	@Autowired
	private MainDbDataMapper dm;
	
	
	@Override
	public HashMap<String, Object> checkLoginInfo(String user_id) throws Exception {
		// TODO Auto-generated method stub
		return dm.checkLoginInfo(user_id);
	}
}

package com.seungjun.studyedu.service;

import java.util.HashMap;


public interface MomentoService {

	
	/**
	 * 로그인 정보 확인 
	 * @param user_id
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> checkLoginInfo(String user_key) throws Exception;
	
	
}

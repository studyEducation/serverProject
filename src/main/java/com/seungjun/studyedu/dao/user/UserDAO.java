package com.seungjun.studyedu.dao.user;

import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

/**
 * 회원 정보 관련된 DAO
 * @author SeungJun
 *
 */
public interface UserDAO {

	/**
	 * 로그인 정보 확인 
	 * @param user_id
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> checkLoginInfo(String user_id) throws Exception;	
	
}

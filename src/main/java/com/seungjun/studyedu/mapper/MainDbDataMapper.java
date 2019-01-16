package com.seungjun.studyedu.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

/**
 * DB 조회용 함수를 전체 관리 하는 인터페이스 
 * @author SeungJun
 *
 */
public interface MainDbDataMapper {

	/**
	 * 로그인 정보 확인 
	 * @param user_id
	 * @return
	 * @throws Exception
	 */
	public HashMap<String, Object> checkLoginInfo(@Param("user_id") String user_id) throws Exception;
	
	
}

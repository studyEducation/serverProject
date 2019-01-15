package com.seungjun.studyedu.vo.result;

import lombok.Data;


/**
 * 로그인 결과값 주는 VO
 * @author SeungJun
 *
 */
@Data
public class LoginResultVO extends HeaderInfoVO{

	private String user_key = "";
	
	private int user_mode = -1;
	
}

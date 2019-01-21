package com.seungjun.studyedu.vo.result;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/**
 * 로그인 결과값 주는 VO
 * @author SeungJun
 *
 */
@Data
@Getter @Setter
public class LoginResultVO extends HeaderInfoVO{
  
	private String user_key = "";

	private int user_mode = -1;
	
}

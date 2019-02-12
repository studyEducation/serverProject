package com.seungjun.studyedu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seungjun.studyedu.service.MomentoService;
import com.seungjun.studyedu.utils.ResponseCode;
import com.seungjun.studyedu.vo.result.LoginResultVO;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

/**
 * 공통적으로 유저 정보 관련해서 쓰이는 api 관리하는 컨트롤러
 * 로그인 / 회원가입 / 아디 비번찾기 등등
 * @author SeungJun
 *
 */
@RestController
public class UserController {


	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private MomentoService momentoService;
	

	/**
	 * 로그인 확인 api 
	 * @param json
	 * @return
	 */
	@ApiOperation(value="로그인 요청")
	@RequestMapping(value="/login", method= RequestMethod.POST, consumes="application/json")
	public @ResponseBody LoginResultVO userLogin(@RequestBody Map<String, Object> json) {
		
		int code = ResponseCode.SUCCESS.getCode();
		String msg = ResponseCode.SUCCESS.getMsg();

		
		String user_key = (String)json.get("user_key");
		
		
		LoginResultVO result = new LoginResultVO();
		//
		try { 
			
			HashMap<String, Object> loginInfo = momentoService.checkLoginInfo(user_key);
			
			if(loginInfo != null && loginInfo.size() > 0) {
				
				result.setUser_key((String)loginInfo.get("user_key"));
				result.setUser_nickname((String)loginInfo.get("user_nickname"));
				result.setUser_login_type((int)loginInfo.get("user_login_type"));
				result.setUser_image_url((String)loginInfo.get("user_image_url"));
				result.setUser_email((String)loginInfo.get("user_email"));
				result.setLevel_type((int)loginInfo.get("level_type"));
				result.setUser_step_percent((int)loginInfo.get("user_step_percent"));
				
			}else {
				
				code = ResponseCode.FAIL_LOGIN_NOTFOUND_ID.getCode();
				msg = ResponseCode.FAIL_LOGIN_NOTFOUND_ID.getMsg();
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();

			code = ResponseCode.FAIL_EXCEPTION.getCode();
			msg = ResponseCode.FAIL_EXCEPTION.getMsg();
			
		}
		
		result.setReqCode(code);
		result.setReqMsg(msg);
		
		return result;
		
	}
	
}

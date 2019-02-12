package com.seungjun.studyedu.vo.result;

/**
 * 로그인 결과값 주는 VO
 * @author SeungJun
 *
 */
public class LoginResultVO extends HeaderInfoVO{
  
	//유저 키(각 sns 계정에서 준 키값)
	private String user_key = "";

	//유저 닉네임(랜덤으로 지정)
	private String user_nickname ="";
	
	//1- facebook /  2 - kakao
	private int user_login_type = 1;
	
	//유저 이미지 url
	private String user_image_url ="";
	
	//유저 이메일
	private String user_email ="";
	
	//유저가 현재 진행중인 난이도 값 ( 1 - 초 / 2 - 중 / 3 - 고)
	private int level_type = 1;
	
	//유저가 현재 난이도에서 진행중인 step 진행상황
	private int user_step_percent = 0;
	

	public String getUser_key() {
		return user_key;
	}

	public void setUser_key(String user_key) {
		this.user_key = user_key;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public int getUser_login_type() {
		return user_login_type;
	}

	public void setUser_login_type(int user_login_type) {
		this.user_login_type = user_login_type;
	}

	public String getUser_image_url() {
		return user_image_url;
	}

	public void setUser_image_url(String user_image_url) {
		this.user_image_url = user_image_url;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public int getLevel_type() {
		return level_type;
	}

	public void setLevel_type(int level_type) {
		this.level_type = level_type;
	}

	public int getUser_step_percent() {
		return user_step_percent;
	}

	public void setUser_step_percent(int user_step_percent) {
		this.user_step_percent = user_step_percent;
	}
	
	
}

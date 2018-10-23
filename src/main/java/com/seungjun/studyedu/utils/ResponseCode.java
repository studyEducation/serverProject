package com.seungjun.studyedu.utils;

public enum ResponseCode {

	/**
	 * 일반 성공 0 
	 * 기타 에러 9999
	 * 공통 유저 관련 정보는 5000
	 * 멘티 관련 정보는 6000
	 */
	
	SUCCESS(0, ""),
	
	FAIL_EXCEPTION(9999, "기타 오류가 발생하였습니다. 관리자에게 문의해주세요."),
	
	FAIL_LOGIN_NOTFOUND_ID(5000, "입력하신 아이디는 없는 아이디 입니다. 아이디를 확인해주세요."),
	FAIL_LOGIN_NOMATCHING_PW(5100, "입력하신 비밀번호가 틀렸습니다. 비밀번호를 확인해주세요."),
	FAIL_ID_OVERLAP(5200, "이미 사용 중인 아이디 입니다. 다른 아이디를 사용해주세요."),
	FAIL_FINDID_NOTFOUND_ID(5300, "일치하는 정보의 아이디가 없습니다. 가입 시 입력했던 이메일과 동일한 이메일을 입력 해주세요."),
	FAIL_FINDPW_NOTFOUND_INFO(5400, "입력하신 정보는 없는 정보입니다. 아이디와 이메일을 확인해주세요."),
	FAIL_CHANGEPW(5500, "비밀번호 변경에 실패하였습니다. 다시 시도해주시기 바랍니다."),
	FAIL_UPDATE_FCM_KEY(5600, "FCM 키 변경에 실패하였습니다. 다시 시도해주시기 바랍니다.");
	
	
	
	private int code = 0;
	
	private String msg = "";
	
	
	ResponseCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}


	public int getCode() {
		return code;
	}


	public String getMsg() {
		return msg;
	}
	
	
	
	
}

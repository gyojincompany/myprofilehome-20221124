package com.gyojincompany.home.dao;

import com.gyojincompany.home.dto.MemberDto;

public interface IDao {
	
	public int memberJoin(String mid, String mpw, String mname, String memail);//회원 가입 insert
	public int checkId(String mid);//아이디 존재여부 확인 select
	public int checkIdAndPW(String mid, String mpw);//아이디와 비밀번호의 존재 및 일치 여부 select
	
	
}

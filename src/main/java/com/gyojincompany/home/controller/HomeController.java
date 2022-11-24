package com.gyojincompany.home.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.home.dao.IDao;
import com.gyojincompany.home.dto.MemberDto;

@Controller
public class HomeController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/")
	public String home() {
		
		return "index";
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value = "/profile")
	public String profile() {
		
		return "profile";
	}
	
	@RequestMapping(value = "/contact")
	public String contact() {
		
		return "contact";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value = "/join")
	public String join() {
		
		return "join";
	}
	
	@RequestMapping(value = "/question")
	public String question() {
		
		return "question";
	}
	
	@RequestMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request, HttpSession session, Model model) {
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		String mname = request.getParameter("mname");
		String memail = request.getParameter("memail");
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		int joinFlag = dao.memberJoin(mid, mpw, mname, memail);
		//joinFlag가 1이면 회원가입 성공, 아니면 실패
		//System.out.println("가입성공여부:"+joinFlag);
		
		//가입하려는 아이디가 존재하는지 여부를 체크하는 메서드 삽입 예정
		
		if(joinFlag == 1) {//회원가입 성공시 바로 로그인 진행
			session.setAttribute("memberId", mid);
			session.setAttribute("memberName", mname);
			
			model.addAttribute("mname", mname);
			model.addAttribute("mid", mid);
			
			return "joinOk";
		} else { //회원가입 실패
			return "joinFail";
		}	
		
	}
	
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "login";
	}
	
	@RequestMapping(value = "/loginOk")
	public String loginOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("mid");
		String mpw = request.getParameter("mpw");
		
		IDao dao = sqlSession.getMapper(IDao.class);
		
		int checkIdFlag =  dao.checkId(mid);
		//가입하려는 아이디 존재시 1, 가입하려는 존재하지 않으면 0이 반환
		if(checkIdFlag == 0) {
			model.addAttribute("checkIdFlag", checkIdFlag);
		}
		return "loginOk";
	}
	
	
	
	
	
	
	
}

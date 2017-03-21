package microcredit.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import microcredit.domain.Member;
import microcredit.service.MemberService;
import microcredit.service.logic.MemberServiceLogic;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String memberid = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println(memberid);
		System.out.println(pw);
		
		MemberService service = new MemberServiceLogic();
		
		Member member = service.findMemberById(memberid);
		
		if(member.getId().equals(memberid)){
			System.out.println("야스로그인");
			
		}
	}

}

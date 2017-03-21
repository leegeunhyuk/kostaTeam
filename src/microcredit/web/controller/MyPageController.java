package microcredit.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import microcredit.domain.Loan;
import microcredit.domain.LoanApply;
import microcredit.domain.Member;
import microcredit.service.LoanApplyService;
import microcredit.service.LoanService;
import microcredit.service.MemberService;
import microcredit.service.logic.LoanApplyServiceLogic;
import microcredit.service.logic.LoanServiceLogic;
import microcredit.service.logic.MemberServiceLogic;


@WebServlet("/myPage.do")
public class MyPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
//		HttpSession session = request.getSession();
//		String memberId = (String)session.getAttribute("MemberId");
//		double cash = Double.parseDouble((String)session.getAttribute("cash"));
		
		String memberId = "kim";
		double cash = 2000;
		MemberService memberService = new MemberServiceLogic();
		LoanService loanService = new LoanServiceLogic();
		LoanApplyService loanApplyService = new LoanApplyServiceLogic();
		
		Member member = memberService.findMemberById(memberId);
		request.setAttribute("member", member);
		request.setAttribute("cash", cash);
		
		if(member.getStatus().equals("1")){
//			lender이면
			List<Loan> list = loanService.findLoanByMemberId(memberId);
			List<LoanApply> applyList = new ArrayList<>();
			
			for(int i = 0; i<list.size(); i++){
				applyList.add(loanApplyService.findLoanApplyById(list.get(i).getLoanApply().getId()));
			}
			request.setAttribute("loans", list);
		}else{
			LoanApply loanApply = loanApplyService.findLoanApplyByMemberId(memberId);
			request.setAttribute("loanApply", loanApply);
		}
		
		
		request.getRequestDispatcher("/view/MyPage.jsp").forward(request, response);
		
		
	}

}

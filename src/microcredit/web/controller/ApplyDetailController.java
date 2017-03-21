package microcredit.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import microcredit.domain.LoanApply;
import microcredit.service.LoanApplyService;
import microcredit.service.logic.LoanApplyServiceLogic;

@WebServlet("/apply/detail.do")
public class ApplyDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoanApplyService service = new LoanApplyServiceLogic(); 
		
		int loanApplyId = Integer.parseInt(request.getParameter("applyId"));
		
		LoanApply loanApply = service.findLoanApplyById(loanApplyId);
		
		request.setAttribute("loanApply" , loanApply );
		request.getRequestDispatcher("loanApplyDetail.jsp").forward(request, response);

	}

}

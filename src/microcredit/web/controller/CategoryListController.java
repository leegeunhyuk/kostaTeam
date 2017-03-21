package microcredit.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import microcredit.domain.Category;
import microcredit.domain.LoanApply;
import microcredit.service.LoanApplyService;
import microcredit.service.logic.LoanApplyServiceLogic;

@WebServlet("/view/detailList.do")
public class CategoryListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String category = request.getParameter("category");
		LoanApplyService service = new LoanApplyServiceLogic();
		List<LoanApply> list = service.findLoanApplyByCategory(category);
		System.out.println(list.size());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}

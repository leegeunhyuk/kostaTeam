package microcredit.web.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import microcredit.domain.File;
import microcredit.domain.LoanApply;

@WebServlet("/loanapply/register.do")
public class RegistApplyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int maxSize = 1024 * 1024 * 10;
		// 파일 저장 경로(ex : /home/tour/web/ROOT/upload)
		String savePath = getServletContext().getInitParameter("imgPath");
		// 업로드 파일명

		MultipartRequest multi = new MultipartRequest(request, savePath, maxSize, "UTF-8",
				new DefaultFileRenamePolicy());

		String title = multi.getParameter("title");
		String contents = multi.getParameter("contents");
		String id = multi.getParameter("id");
		String category = multi.getParameter("category");
		String endDay = multi.getParameter("endDate");
		double targetMoney = Double.parseDouble(multi.getParameter("targetMoney"));
		
		//파일
		List<File> files = new ArrayList<>();
		
		Enumeration e = multi.getFileNames();
		String formName;
		String fileName;
		
		while(e.hasMoreElements()){
			formName=(String)e.nextElement();
			fileName=multi.getFilesystemName(formName);
			
			if(fileName != null){
				File file = new File();
				file.setName(multi.getFilesystemName(fileName));
				file.setType(multi.getContentType(fileName));
				files.add(file);
			}
		}
		//파일
		
		String startDay = new SimpleDateFormat("yyyy-MM-dd").format(
                 new java.sql.Date(System.currentTimeMillis()));
		LoanApply loanApply = new LoanApply();
		
		loanApply.setCategory(category);
		loanApply.setContents(contents);
		loanApply.setTitle(title); 
		loanApply.setFiles(files);
		loanApply.setStartDate(java.sql.Date.valueOf(startDay));
		loanApply.setEndDate(java.sql.Date.valueOf(endDay));
		loanApply.setCurrentMoney(0);
		loanApply.setStatus("0");
		
		request.getRequestDispatcher("view/LoanapplicationDetail.jsp").forward(request, response);
	}

}

package kr.co.javaspecialist.mot.controller;

import java.awt.print.Printable;
import java.util.Enumeration;





import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;

import kr.co.javaspecialist.mot.model.SearchConditionVO;

public class WordAnalysisController extends MotController {


	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		String startdate=request.getParameter("startdate");
		String enddate=request.getParameter("enddate");
		String[] category =(request.getParameterValues("category"));
		int mincomm=Integer.parseInt(request.getParameter("mincomm"));
		int maxcomm=Integer.parseInt(request.getParameter("maxcomm"));

		String view = "/";
//		if(request != null) {
			try {
				//출력용코드
				request.setAttribute("startdate", startdate);
				request.setAttribute("enddate", enddate);
				request.setAttribute("category", category);
				request.setAttribute("mincomm", mincomm);
				request.setAttribute("maxcomm", maxcomm);
				System.out.println("테스트");
				
				//R분석 코드가 필요
				view = "/mot/word_anal.jsp";
			}catch(Exception e) {
				request.setAttribute("message", "EMPNO_IS_NOT_VALID");
				view = "/error/error.jsp";
			}
//		}else {
//			request.setAttribute("message", "EMPNO_NOT_FOUND");
//			view = "/error/error.jsp";
//		}
		return view;
	}

}

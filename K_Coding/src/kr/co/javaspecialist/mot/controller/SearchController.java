package kr.co.javaspecialist.mot.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.javaspecialist.mot.model.ArticleDAO;
import kr.co.javaspecialist.mot.model.ArticleVO;

import kr.co.javaspecialist.mot.model.CommentVO;

import kr.co.javaspecialist.mot.model.SearchConditionVO;

public class SearchController extends MotController {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
//		<%request.setCharacterEncoding("utf-8");%>
		String method = request.getMethod();
		String view = "/";
		if(method.equalsIgnoreCase("get")) {
			try {
				view = "/mot/word_anal.jsp";
			}catch(Exception e) {				
				request.setAttribute("message", "INSERT_ERROR");
				view = "";
			}
		}else if(method.equalsIgnoreCase("post")) {
			try {
				String strdate1 =request.getParameter("startdate");
				String strdate2 = "";
				for (String i : strdate1.split("-")){
					strdate2 = strdate2 + i;
				}
				int startdate=Integer.parseInt(strdate2);
				System.out.println(strdate2);
				
				String strdate3 =request.getParameter("enddate");
				String strdate4 = "";
				for (String i : strdate3.split("-")){
					strdate4 = strdate4 + i;
				}
				int enddate=Integer.parseInt(strdate4);
				System.out.println(strdate4);

				
//				VO 객체
				SearchConditionVO vo = new SearchConditionVO();
				vo.setStartdate(startdate);
				vo.setEnddate(enddate);
				request.setAttribute("vo", vo);
				
				//Dao 호출
				ArticleDAO artdao = new ArticleDAO();
				ArrayList<ArticleVO> articleList = artdao.getMatchingArticles(vo);
				request.setAttribute("articleList", articleList);
				
						
				
				//comment dao, vo 추가 
//				CommentDAO commdao = new CommentDAO();
//				ArrayList<CommentVO> comms = commdao.getAllComments(100);
//				request.setAttribute("comms", comms);
				//CommentDAO commdao= new CommentDAO();
				
//				//FreqWordDAO, FreqWordVO 여기서 사용안함
//				FreqWordDAO frqdao = new FreqWordDAO();
//				ArrayList<FreqWordVO> words = frqdao.getFreqWord(100);
//				request.setAttribute("frqword", words);

				System.out.println(articleList.toString());
				System.out.println("s");
				view = "/mot/word_anal.jsp";
			}catch(Exception e) {
//				logger.error(e.getMessage());
				request.setAttribute("message", "INSERT_ERROR");
				view="/error/error.jsp";
			}
		}
		return view;
	}

}

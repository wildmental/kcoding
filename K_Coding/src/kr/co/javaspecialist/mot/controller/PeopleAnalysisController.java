package kr.co.javaspecialist.mot.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.co.javaspecialist.mot.model.AvgSalChartVO;

public class PeopleAnalysisController extends MotController {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<AvgSalChartVO> salList = empDao.getAvgSalByDeptno();
		Gson gson = new Gson();
		String salData = gson.toJson(salList);
		request.setAttribute("salData", salData);
		String view = "/mot/people_anal.jsp";
		return view;
	}

}

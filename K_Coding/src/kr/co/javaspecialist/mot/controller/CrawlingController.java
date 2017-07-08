package kr.co.javaspecialist.mot.controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

// /emp/list.do
public class CrawlingController extends MotController {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {

		return "/emp/list.jsp";
	}

}

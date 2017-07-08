package kr.co.javaspecialist.mot.model;

import java.util.ArrayList;

public interface IArticleDAO {
	
	public ArrayList<ArticleVO> getAllArticles();
	public ArrayList<ArticleVO> getMatchingArticles(SearchConditionVO vo);
	public ArrayList<AvgSalChartVO> getAvgSalByDeptno();
}

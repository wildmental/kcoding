package kr.co.javaspecialist.mot.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import kr.co.javaspecialist.common.db.DBConn;


public class ArticleDAO implements IArticleDAO {
	static final Logger logger = Logger.getLogger(ArticleDAO.class);
	
	public ArrayList<ArticleVO> getAllArticles() {
	      ArrayList<ArticleVO> lists = new ArrayList<ArticleVO>();
	      String sql = "select * from articles1";
	      Connection con = DBConn.getConnection();
	      try {
	         PreparedStatement stmt = con.prepareStatement(sql);
	         ResultSet rs = stmt.executeQuery();
	         while(rs.next()) {
	        	ArticleVO vo = new ArticleVO();
	        	vo.setArticleno(rs.getInt("articleno"));
	            vo.setDate(rs.getInt("date_"));
	            vo.setTitle(rs.getString("title"));
	            vo.setUrl(rs.getString("url_"));
	            vo.setImg(rs.getString("img"));
	            lists.add(vo);
	         }
	      } catch (SQLException e) {
	         throw new RuntimeException(e);
	      } finally { 
	         DBConn.closeConnection(con); 
	      }
	      return lists;
	   }
	
	@Override
	public ArrayList<ArticleVO> getMatchingArticles(SearchConditionVO vo) {
		ArrayList<ArticleVO> article = new ArrayList<ArticleVO>();
//		ArrayList<FreqWordVO> word = new ArrayList<FreqWordVO>();
		String sql = "select a.articleid, a.date_, a.title, a.url_, a.img, f.freqword1, f.freqword2, f.freqword3, f.freqword4, f.freqword5 from articles1 a join freqword1 f on a.articleid=f.articleid where date_>=? and date_<=?";
		Connection con = null;
		try {
			con = DBConn.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			if(vo.getStartdate() == 0)
				stmt.setNull(1, java.sql.Types.DECIMAL);
			else 
				stmt.setInt(1, vo.getStartdate());
			if(vo.getEnddate() == 0)
				stmt.setNull(2, java.sql.Types.DECIMAL);
			else 
				stmt.setInt(2, vo.getEnddate());
//			카테고리 조건 구현 안함
//			if(vo.indexof(getCategory())== 0)
//				stmt.setNull(3, java.sql.Types.DECIMAL);
//			else 
//				stmt.setInt(2, vo.getXxx());
//			댓글 개수 기준 구현 안함
//			if(vo.getMincomm()== 0)
//				stmt.setNull(3, java.sql.Types.DECIMAL);
//			else 
//				stmt.setInt(3, vo.getMincomm());
//			if(vo.getMaxcomm()== 0)
//				stmt.setNull(4, java.sql.Types.DECIMAL);
//			else 
//				stmt.setInt(4, vo.getMaxcomm());

//			String[] categories = vo.getCategory();
//			String category = "";
//			for (String i : categories) {
//				 category = category + i + ",";
//			}
//			category = category.substring(0,-1);
//			stmt.setString(5, category);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				ArticleVO artivo = new ArticleVO();
				int artiID=rs.getInt("ARTICLEID");
				artivo.setArticleno(artiID);
				artivo.setDate(rs.getInt("DATE_"));
				artivo.setTitle(rs.getString("TITLE"));
				artivo.setUrl(rs.getString("URL_"));
				artivo.setImg(rs.getString("img"));
				artivo.setFreqWord1(rs.getString("freqword1"));
				System.out.println(rs.getString("freqword1"));
				System.out.println(artivo.getFreqWord1());
				artivo.setFreqWord2(rs.getString("freqword2"));
				artivo.setFreqWord3(rs.getString("freqword3"));
				artivo.setFreqWord4(rs.getString("freqword4"));
				artivo.setFreqWord5(rs.getString("freqword5"));
				System.out.println(artivo.toString());
				article.add(artivo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally { 
			DBConn.closeConnection(con); 
		}
		
		return article;
	}
//차트 코드/일단 남겨두세요
	@Override
	public ArrayList<AvgSalChartVO> getAvgSalByDeptno() {
		ArrayList<AvgSalChartVO> salList = new ArrayList<AvgSalChartVO>();
		String sql = "select deptno, avg(sal) as avg_sal, max(sal) as max_sal from emp group by deptno order by deptno";
		Connection con = null;
		try {
			con = DBConn.getConnection();

			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				AvgSalChartVO salVO = new AvgSalChartVO();
				salVO.setDeptno(rs.getInt("deptno"));
				salVO.setAvgSal(rs.getDouble("avg_sal"));
				salVO.setMaxSal(rs.getDouble("max_sal"));
				salList.add(salVO);
			}
			salList.get(salList.size()-1).setDashLengthLine(5);
			AvgSalChartVO sal40 = new AvgSalChartVO();
			double avgSum = 0;
			double maxSum = 0;
			for(AvgSalChartVO vo : salList) {
				avgSum = avgSum + vo.getAvgSal();
				maxSum = maxSum + vo.getMaxSal();
			}
			sal40.setDeptno(40);
			sal40.setAvgSal(avgSum/salList.size());
			sal40.setMaxSal(maxSum/salList.size());
			sal40.setDashLengthColumn(5);
			sal40.setAlpha(0.2);
			sal40.setAdditional("(projection)");
			salList.add(sal40);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			DBConn.closeConnection(con);
		}
		return salList;
	}

}

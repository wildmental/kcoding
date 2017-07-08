package kr.co.javaspecialist.mot.model;

import java.net.URI;
import java.util.Date;


public class ArticleVO {
	private int articleno;
	private int date  ;
	private String title;
	private String url;
	private String img;
	private String freqWord1;
	private String freqWord2;
	private String freqWord3;
	private String freqWord4;
	private String freqWord5;
	
	public ArticleVO() {
		super();
	}

	public ArticleVO(int articleno, int date, String title, String url,
			String img, String freqWord5, String freqWord1, String freqWord2,
			String freqWord3, String freqWord4) {
		super();
		this.articleno = articleno;
		this.date = date;
		this.title = title;
		this.url = url;
		this.img = img;
		this.freqWord5 = freqWord5;
		this.freqWord1 = freqWord1;
		this.freqWord2 = freqWord2;
		this.freqWord3 = freqWord3;
		this.freqWord4 = freqWord4;
	}

	public int getArticleno() {
		return articleno;
	}

	public void setArticleno(int articleno) {
		this.articleno = articleno;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getFreqWord5() {
		return freqWord5;
	}

	public void setFreqWord5(String freqWord5) {
		this.freqWord5 = freqWord5;
	}

	public String getFreqWord1() {
		return freqWord1;
	}

	public void setFreqWord1(String freqWord1) {
		this.freqWord1 = freqWord1;
	}

	public String getFreqWord2() {
		return freqWord2;
	}

	public void setFreqWord2(String freqWord2) {
		this.freqWord2 = freqWord2;
	}

	public String getFreqWord3() {
		return freqWord3;
	}

	public void setFreqWord3(String freqWord3) {
		this.freqWord3 = freqWord3;
	}

	public String getFreqWord4() {
		return freqWord4;
	}

	public void setFreqWord4(String freqWord4) {
		this.freqWord4 = freqWord4;
	}

	
	

	

	
}

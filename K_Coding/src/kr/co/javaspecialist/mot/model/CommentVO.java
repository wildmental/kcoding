package kr.co.javaspecialist.mot.model;

public class CommentVO {
	private int articleno;
	private int commentno;
	private String comment;
	
	
	
	public CommentVO(int articleno, int commentno, String comment) {
		super();
		this.articleno = articleno;
		this.commentno = commentno;
		this.comment = comment;
	}
	public CommentVO() {
		super();
	}
	
	
	public int getArticleno() {
		return articleno;
	}
	public void setArticleno(int articleno) {
		this.articleno = articleno;
	}
	public int getCommentno() {
		return commentno;
	}
	public void setCommentno(int commentno) {
		this.commentno = commentno;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "CommentVO [articleno=" + articleno + ", commentno=" + commentno
				+ ", comment=" + comment + "]";
	}

}

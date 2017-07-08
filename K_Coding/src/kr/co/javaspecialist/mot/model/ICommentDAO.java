package kr.co.javaspecialist.mot.model;

import java.util.ArrayList;

public interface ICommentDAO {
	ArrayList<CommentVO> getAllComments(int ArticleID);
}

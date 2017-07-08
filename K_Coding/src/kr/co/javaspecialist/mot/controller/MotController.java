package kr.co.javaspecialist.mot.controller;

import java.util.ArrayList;


import org.apache.log4j.Logger;

import kr.co.javaspecialist.common.controller.CommandHandler;
import kr.co.javaspecialist.mot.model.CommentVO;
import kr.co.javaspecialist.mot.model.ArticleDAO;
import kr.co.javaspecialist.mot.model.ICommentDAO;
import kr.co.javaspecialist.mot.model.IArticleDAO;

public abstract class MotController implements CommandHandler{
	static final Logger logger = Logger.getLogger(MotController.class);

	IArticleDAO empDao = new ArticleDAO();
}

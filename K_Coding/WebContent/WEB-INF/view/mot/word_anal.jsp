<%@page isELIgnored="false" %>

<%@page import="java.util.ArrayList"%>
<%@ page contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setBundle basename="i18n/emp" />
<%@ taglib prefix="datatables"
	uri="http://github.com/dandelion/datatables"%>
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/view/include/staticFiles.jsp" />
<body>
	<jsp:include page="/WEB-INF/view/include/bodyHeader2.jsp" />
	<div class="container">
		<div class="pg-opt">
			<div class="row">
				<div class="col-md-6 pc">
					<h2>
						<fmt:message key="ANAL1" />
					</h2>
				</div>
				<div class="col-md-6">
					<ol class="breadcrumb">
						<li><fmt:message key="ANAL1_INFO" /></li>
					</ol>
				</div>
			</div>
		</div>
		<div class="content">
			<div>
				<br>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h2 class="panel-title"> 빈출단어 and 워드클라우드</h2>
				</div>
				<div class="panel-body">
				<!--<%=request.getAttribute("articleList")%>-->
				
			
		
			
				<table border=1>
	            <c:forEach var="article" items="${articleList}">
	            <tr>
	            <td>
		            <div>
			            <h2><a href="${article.url}"> ▶ ${article.title}</a></h2>
				            <br> 
				                  <h4> ◈ 빈출 단어 : ${article.freqWord1},${article.freqWord2},${article.freqWord3},${article.freqWord4},${article.freqWord5}</h4>
				            <br>
			            
		            </div>
	            </td>
	            <td>
	            <h2><a href='<c:url value="/mot/img/${article.img}.jpeg"/>'><img src='<c:url value="/mot/img/${article.img}.jpeg"/>' width=200></a></h2>
	            </td>
	            </tr>
				</c:forEach>
	            
	            </table>
				
			
				
					
				</div>
			</div>
			
		</div>
	</div>
	<jsp:include page="/WEB-INF/view/include/footer.jsp" />
</body>
</html>

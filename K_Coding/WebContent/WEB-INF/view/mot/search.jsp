<%@ page contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n/emp" />
<%@ taglib prefix="datatables" uri="http://github.com/dandelion/datatables" %>
<!DOCTYPE html>
<html>
<jsp:include page="/WEB-INF/view/include/staticFiles.jsp"/>
<body>
<jsp:include page="/WEB-INF/view/include/bodyHeader.jsp"/>
<div class="container">
   <div class="pg-opt">
        <div class="row">
            <div class="col-md-6 pc">
                <h2><fmt:message key="SEARCH"/></h2>
            </div>
            <div class="col-md-6">
                <ol class="breadcrumb">
                    <li><fmt:message key="SEARCH"/></li>
          
                </ol>
            </div>
        </div>
    </div>
   <div class="content">
   <form action="<c:url value='/mot/search.do'/>" method="post" class="form-horizontal">
   <!--  <div class="alert alert-dismissible alert-info">-->
   <fieldset>
    <legend>검색 설정</legend>
     
    <div class="form-group">
      <label class="control-label col-sm-2" for="hiredate"><fmt:message key="SEARCH_DATE"/><br>(YYYY-MM-DD)</label>
      <div class="col-sm-2">
        <input type="date" name="startdate" id="hiredate"  placeholder="2015-01-01" pattern="^\(?\d{4}\)?[-]\d{2}[-]\d{2}$" required>
        <input type="date" name="enddate" id="hiredate" placeholder="2016-01-01" pattern="^\(?\d{4}\)?[-]\d{2}[-]\d{2}$" required>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="site"><fmt:message key="SITE"/><br>(복수선택가능)</label>
      <div class="col-sm-3">
      <span><input name="category" type="checkbox" value="전체">전체</span><br>
        <span><input name="category" type="checkbox" value="네이버">Naver</span><br>
        <span><input name="category" type="checkbox" onclick="return false" >Daum</span><br>
        <span><input type="checkbox" onclick="return false" >Nate</span><br>
        <span><input type="checkbox" onclick="return false">YouTube</span>
    
      </div>
    </div>  

    

    
    <div class="form-group">
      <label class="control-label col-sm-2" for="site"><fmt:message key="CATEGORY"/><br>(복수선택가능)</label>
      <div class="col-sm-3">
        <span><input name="category1" type="checkbox" value="종합">종합</span><br>
        <span><input name="category2" type="checkbox" value="정치">정치</span><br>
        <span><input type="checkbox" onclick="return false" >경제</span><br>
        <span><input type="checkbox" onclick="return false">사회</span><br>
        <span><input type="checkbox" onclick="return false">생활/문화</span><br>
        <span><input type="checkbox" onclick="return false">세계</span><br>
        <span><input type="checkbox" onclick="return false">IT/과학</span><br>
        <span><input type="checkbox" onclick="return false">스포츠</span><br>
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="hiredate"><fmt:message key="COMMENT_NUM"/></label>
      <div class="col-sm-2">
        <input type="number" name="mincomm" id="hiredate"  required>
        <br>
        <input type="number" name="maxcomm" id="hiredate"  required>
      </div>
    </div>
    

  
    <div class="form-group">

       <div class="col-sm-offset-2 col-sm-8">
      <input type="submit" class="btn btn-primary" value="<fmt:message key="SAVE"/>">
      <input type="reset" class="btn btn-default" value="<fmt:message key="CANCEL"/>">
      </div>
   </div>
    </fieldset>

   </form>
   </div>
</div>
<jsp:include page="/WEB-INF/view/include/footer.jsp"/>
</body>
</html>
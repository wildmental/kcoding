<%@ page contentType="text/html; charset=utf-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- FOOTER -->
<footer class="footer">
 <section id="contact" style="padding-bottom:0px">
    <div class="container" style="background:black; height:250px; color:#AAAAAA;">
        <div class="row">
            <div class="col-md-5">
                <div class="col">
                   <h3>Contact us</h3>
                   <ul>
                        <li>서울특별시 강남구 SamePage</li>
                        <li>Phone: <%= application.getInitParameter("phone")%> </li>
                        <li>Email: <a href="mailto:${initParam.email}" title="Email Us">${initParam.email}</a></li>
                   </ul>
                 </div>
            </div>
            
            
            
            <div class="col-md-4">
                <div class="col col-social-icons">
                    <h3>Follow us</h3>
                    <a href="#"><i class="fa fa-facebook"></i></a>
                    <a href="#"><i class="fa fa-google-plus"></i></a>
                    <a href="#"><i class="fa fa-linkedin"></i></a>
                    <a href="#"><i class="fa fa-twitter"></i></a>
                
                </div>
			</div>

			<div class="col-md-3">
                <div class="col">
                    <h3>About us</h3>
                    <p class="no-margin">
                    Data scientist group community. 
                    It something special for your.
               <!--      <a href="#" class="btn btn-block btn-base btn-icon fa-check"><span>Try it now</span></a> -->
                    </p>
                </div>
            </div>
        </div>
	</div>
	</section>
</footer>
<%
	application.log(new java.util.Date().toString() + " : " + 
					request.getRemoteAddr() + " : " +
					request.getRequestURI());
%>
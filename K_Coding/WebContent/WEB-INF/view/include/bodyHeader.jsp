
<%@ page contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setBundle basename="i18n/header"/>
<!-- HEADER -->
 
<div class="container">
<div id="divHeaderWrapper">
	<header class="header-standard-2">     
    <!-- MAIN NAV -->
    <div class="navbar navbar-wp navbar-arrow mega-nav" role="navigation" style="background:#000000;">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <i class="fa fa-bars icon-custom"></i>
            </button>
            <a class="navbar-brand" href="<c:url value="/"/>" title=""><span class="glyphicon glyphicon-align-justify" aria-hidden="true" style="color:white;"></span>
            	<span style="color:white;"><fmt:message key="TITLE"/></span>
            </a><div style="padding-left:15px; width:200px"></div>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="hidden-md hidden-lg">
                    <div class="bg-light-gray">
                        <form class="form-horizontal form-light p-15" role="form">
                            <div class="input-group input-group-lg">
                               

                            </div>
                        </form>
                    </div>
                </li>
                   <li class="dropdown">
					
                    <a href='<c:url value="/"/>' class="dropdown-toggle"><span style="color:white;"><fmt:message key="DASHBOARD"/></span></a>
                    <!-- ul class="dropdown-menu">
                        <li><a href='<c:url value="/"/>'><fmt:message key="menu_dashboard"/></a></li>
                    </ul-->
                </li>
                <li class="dropdown">
                    <a href='<c:url value="/forward.do?url=/mot/search.jsp"/>'class="dropdown-toggle"><span style="color:white;"><fmt:message key="SEARCH"/></span></a>
                    <!-- ul class="dropdown-menu">
                        <li><a href='<c:url value="/"/>'><fmt:message key="menu_dashboard"/></a></li>
                    </ul-->
                </li>         
                <li class="dropdown">
                    <a href='<c:url value="/forward.do?url=/mot/word_anal.jsp"/>'class="dropdown-toggle"><span style="color:white;"><fmt:message key="ANAL1"/></span></a>
                </li>
                 <li class="dropdown" >
                	<li><a href='<c:url value="/forward.do?url=/mot/people_anal.jsp"/>' class="dropdown-toggle"><span style="color:white;"><fmt:message key="ANAL2"/></span></a></li>
            </ul>
            
        </div><!--/.nav-collapse -->
    </div>
	</header>
</div>
</div>          
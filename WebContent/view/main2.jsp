<%@page import="microcredit.domain.Category"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="./header.jsp"%>
	<div class="row">
                <div class="col-lg-3 col-md-6">
                <% pageContext.setAttribute("categories", Category.values()); %>
                <c:forEach items="${categories }" var="category">
                	<div class="panel panel-primary">
<%--                         <div class="panel-heading" style="background-image:url(../file/${category.name}.jpg);background-size:auto;"> --%>
<!--                           <br><br><br><br><br> -->
<!--                         </div> -->
							<div class="panel-heading" >
                          		${category }<br><br><br><br><br>
                        	</div>
                        <a href="detailList.do?category=${category }">
                            <div class="panel-footer">
                                <span class="pull-left">Learn More</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                        <a href="#">
                            <div class="panel-footer">
                                <span class="pull-left">Category Loan</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </c:forEach>
                    <div class="panel panel-primary">
                        <div class="panel-heading" style="background-image:url(../file/img1.jpg);background-size:auto;">
                          <br><br><br><br><br>
                        </div>
                        <a href="#">
                            <div class="panel-footer">
                                <span class="pull-left">Learn More</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                        <a href="#">
                            <div class="panel-footer">
                                <span class="pull-left">Category Loan</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>
<!--                 <div class="col-lg-3 col-md-6"> -->
<!--                     <div class="panel panel-green"> -->
<!--                         <div class="panel-heading"> -->
<!--                             <div class="row"> -->
<!--                                 <div class="col-xs-3"> -->
<!--                                     <i class="fa fa-tasks fa-5x"></i> -->
<!--                                 </div> -->
<!--                                 <div class="col-xs-9 text-right"> -->
<!--                                     <div class="huge">12</div> -->
<!--                                     <div>New Tasks!</div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                         <a href="#"> -->
<!--                             <div class="panel-footer"> -->
<!--                                 <span class="pull-left">View Details</span> -->
<!--                                 <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span> -->
<!--                                 <div class="clearfix"></div> -->
<!--                             </div> -->
<!--                         </a> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 <div class="col-lg-3 col-md-6"> -->
<!--                     <div class="panel panel-yellow"> -->
<!--                         <div class="panel-heading"> -->
<!--                             <div class="row"> -->
<!--                                 <div class="col-xs-3"> -->
<!--                                     <i class="fa fa-shopping-cart fa-5x"></i> -->
<!--                                 </div> -->
<!--                                 <div class="col-xs-9 text-right"> -->
<!--                                     <div class="huge">124</div> -->
<!--                                     <div>New Orders!</div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                         <a href="#"> -->
<!--                             <div class="panel-footer"> -->
<!--                                 <span class="pull-left">View Details</span> -->
<!--                                 <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span> -->
<!--                                 <div class="clearfix"></div> -->
<!--                             </div> -->
<!--                         </a> -->
<!--                     </div> -->
<!--                 </div> -->
<!--                 <div class="col-lg-3 col-md-6"> -->
<!--                     <div class="panel panel-red"> -->
<!--                         <div class="panel-heading"> -->
<!--                             <div class="row"> -->
<!--                                 <div class="col-xs-3"> -->
<!--                                     <i class="fa fa-support fa-5x"></i> -->
<!--                                 </div> -->
<!--                                 <div class="col-xs-9 text-right"> -->
<!--                                     <div class="huge">13</div> -->
<!--                                     <div>Support Tickets!</div> -->
<!--                                 </div> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                         <a href="#"> -->
<!--                             <div class="panel-footer"> -->
<!--                                 <span class="pull-left">View Details</span> -->
<!--                                 <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span> -->
<!--                                 <div class="clearfix"></div> -->
<!--                             </div> -->
<!--                         </a> -->
<!--                     </div> -->
<!--                 </div> -->
            </div>
</body>
</html>
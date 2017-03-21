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
	<div class="rowlist">
	
			<div class="col-lg-4">
				<div class="panel panel-default">
					<div class="panel-bodyimg">
						<img style="width: 100%" src="../file/img1.jpg">
					</div>
					<div class="panel-heading">
						<span class="caption">목표금액: 1000,000원</span>
					</div>
					
					<span class="meter" style="width: 20%"></span>
					<div class="panel-footer">
					<span class="caption">목표금액: 1000,000원</span>
					</div>
					
				</div>
			</div>
			<!-- /.col-lg-4 -->
			<div class="col-lg-4">
				<div class="panel panel-primary">
					<div class="panel-heading">Primary Panel</div>
					<div class="panel-body">
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
							lacus adipiscing, posuere lectus et, fringilla augue.</p>
					</div>
					<div class="panel-footer">Panel Footer</div>
				</div>
			</div>
			<!-- /.col-lg-4 -->
			<div class="col-lg-4">
				<div class="panel panel-success">
					<div class="panel-heading">Success Panel</div>
					<div class="panel-body">
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Vestibulum tincidunt est vitae ultrices accumsan. Aliquam ornare
							lacus adipiscing, posuere lectus et, fringilla augue.</p>
					</div>
					<div class="panel-footer">Panel Footer</div>
				</div>
			</div>
			<!-- /.col-lg-4 -->
	</div>

	

</body>
</html>
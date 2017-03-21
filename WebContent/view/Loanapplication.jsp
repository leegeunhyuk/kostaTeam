<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="microcredit.domain.Category" %>	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<c:set var="ctx" value="${pageContext.request.contextPath }"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- Bootstrap Core CSS -->
<link href="../vendor/bootstrap/css/bootstrap.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="../vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="../dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="../vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<% pageContext.setAttribute("categorys", Category.values()); %>
	<form action="${ctx }/loanapply/register.do" enctype="multipart/form-data" method="post">
	<div class="panel-body">
		<div class="row">
			<div class="col-lg-6">
				<h1>대출신청</h1>
					
					<div class="form-group">
						<label>제목</label> 
						<input class="form-control" name="title">
					</div>
					
					
					<label>필요금액</label>
					<div class="form-group input-group">
						<span class="input-group-addon">금액</span> 
						<input type="text" class="form-control" name="targetMoney">
						<span class="input-group-addon">원</span>
					</div>
					
					<div class="form-group"  style="float:right;">
						<label>신청만료일</label>
						<input type="date" name="endDate" id="endDate">						
						
					</div>
					
					<div class="form-group">
						<label>신청사유</label>
						<textarea class="form-control" rows="10" cols="50" name="contents"></textarea>
					</div>
					
				
			</div>
			<!-- /.col-lg-6 (nested) -->
			<div class="col-lg-6">
				<div class="form-group">
						<label>작성자</label> 
						<input type="text" class="form-control" value="myemailaddr@mydomain.com" name="id" disabled>
				</div>
				<div class="form-group">
						<label>카테고리</label>
						 <select class="form-control" name="category">
						 <c:set var="doneLoop" value="false"/>
						 	<c:forEach items="${categorys}" var="category" varStatus="status">
						 		<c:if test="${not doneLoop}"> 
									<option value="${category }">${category }</option>
									<c:if test="${status.count == 8}"> 
										<c:set var="doneLoop" value="true"/> 
									</c:if> 
								</c:if>	
							</c:forEach>
						</select>
				</div>
				<div class="form-group">
					<label>File input</label> 
					<input multiple="multiple" type="file" name="filename[]">
				</div>
			
				<button type="submit" class="btn btn-default">Submit
					Button</button>
				<button type="reset" class="btn btn-default">Reset Button</button>
			</div>
			
			<!-- /.col-lg-6 (nested) -->
		</div>
		<!-- /.row (nested) -->
	</div>
	<!-- /.panel-body -->
	</form>

	<!-- jQuery -->
	<script src="../vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../vendor/bootstrap/js/bootstrap.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="../vendor/metisMenu/metisMenu.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="../dist/js/sb-admin-2.js"></script>
	<script type="text/javascript">
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth()+1; //January is 0!
	var yyyy = today.getFullYear();
	 if(dd<10){
	        dd='0'+dd
	    } 
	    if(mm<10){
	        mm='0'+mm
	    } 
	
	today = yyyy+'-'+mm+'-'+dd;
	
	var maxday = new Date();
	var dd = maxday.getDate();
	var mm = maxday.getMonth()+2; //January is 0!
	var yyyy = maxday.getFullYear();
	 if(dd<10){
	        dd='0'+dd
	    } 
	    if(mm<10){
	        mm='0'+mm
	    } 
	
    maxday = yyyy+'-'+mm+'-'+dd;
	
	document.getElementById("endDate").min=today;
	document.getElementById("endDate").max=maxday;

</script>

</body>
</html>
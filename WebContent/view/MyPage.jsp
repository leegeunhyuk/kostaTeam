<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="euc-kr">
<title>마이페이지</title>

</head>
<body>
	<div class="mypage">
		<h2>cash</h2>
		<form action="order.do" method="post">
			<table class="table table-bordered">
				<colgroup>
					<col width="60" />
					<col width="100" />
					<col width="*" />
					<col width="150" />
					<col width="120" />
				</colgroup>
				<thead>
					<tr>
						<th class="text-center">잔액</th>
					</tr>
				</thead>
				<tbody>

					<tr>
						<td class="text-center">${member.cash}원</td>
					</tr>
				</tbody>
			</table>
			<div class="btn-wrap">
				<button class="btn btn-primary" type="submit">충전</button>
				<button class="btn btn-primary" type="submit">출금</button>
			</div>

		</form>
		<c:choose>
			<c:when test="${member.status == '2'}">
				<h2>Borrower</h2>
				<form action="order.do" method="post">
					<table class="table table-bordered">
						<colgroup>
							<col width="60" />
							<col width="100" />
							<col width="*" />
							<col width="150" />
							<col width="120" />
						</colgroup>
						<thead>
							<tr>
								<th class="text-center">모금 진행중</th>
							</tr>
						</thead>
						<tbody>

							<tr>
								<td class="text-center">${loanApply.currentMoney}</td>
							</tr>
						</tbody>
					</table>
					<div class="btn-wrap">
						<button class="btn btn-primary" type="submit">대출받기</button>
						<button class="btn btn-primary" type="submit">대출취소</button>
					</div>
				</form>
			</c:when>
			<c:otherwise>
				<h2>Lender</h2>
				<form action="order.do" method="post">
					<table class="table table-bordered">
						<colgroup>
							<col width="60" />
							<col width="100" />
							<col width="*" />
							<col width="150" />
							<col width="120" />
						</colgroup>
						<thead>
							<tr>
								<th class="text-center">대출현황</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${loans }" var="loan" varStatus="sts">
								<tr>
									<td class="text-center">${loan.lendMoney}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>

				</form>
			</c:otherwise>
		</c:choose>

	</div>
</body>
</html>
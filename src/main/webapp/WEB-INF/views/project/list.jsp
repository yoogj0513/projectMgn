<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp" %>
<style>
	.container {
		padding: 30px;
	}

	.btnbox {
		text-align: right;
		padding: 20px;
	}
	
	table {
		width: 100%;
		border-collapse: collapse;
	}
	
	th, td {
		border: 1px solid #aaa;
		padding: 10px;
	}
</style>

<section class="container">
	<div class="btnbox">
		<a href="${pageContext.request.contextPath}/project/register">[새 프로젝트 등록]</a>
	</div>
	<div class="list">
		<table>
			<tr>
				<th>프로젝트 이름</th>
				<th>시작날짜</th>
				<th>종료날짜</th>
				<th>상태</th>
			</tr>
			<c:forEach var="item" items="${list }">
				<tr>
					<td><a href="${pageContext.request.contextPath }/project/read?pno=${item.pno}">${item.pname }</a></td>
					<td><fmt:formatDate value="${item.pstartdate }" pattern="yyyy-MM-dd"/> </td>
					<td><fmt:formatDate value="${item.penddate }" pattern="yyyy-MM-dd"/> </td>
					<td>
						<c:if test="${item.pcdt == 'READY'}">준비</c:if>
						<c:if test="${item.pcdt == 'ONGOING'}">진행중</c:if>
						<c:if test="${item.pcdt == 'END'}">종료</c:if>
						<c:if test="${item.pcdt == 'PENDING'}">보류</c:if>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</section>
	
<%@ include file="../include/footer.jsp" %>
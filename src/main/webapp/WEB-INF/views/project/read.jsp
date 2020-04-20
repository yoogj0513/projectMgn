<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>

<style>
	.container {
		padding: 30px;
	}

	.btnbox {
		text-align: center;
		padding: 20px;
	}
	
	table {
		width: 100%;
		border-collapse: collapse;
	}
	
	th {
		width: 30%;
	}
	
	th, td {
		border: 1px solid #aaa;
		padding: 10px;
	}
</style>

<section class="container">
	<div class="list">
		<table>
			<tr>
				<th>프로젝트 이름</th>
				<td>${item.pname }</td>
			</tr>
			<tr>
				<th>프로젝트 내용</th>
				<td>${item.pcontent }</td>
			</tr>
			<tr>
				<th>시작날짜</th>
				<td><fmt:formatDate value="${item.pstartdate }" pattern="yyyy-MM-dd"/> </td>
			</tr>
			<tr>
				<th>종료날짜</th>
				<td><fmt:formatDate value="${item.penddate }" pattern="yyyy-MM-dd"/> </td>
			</tr>
			<tr>
				<th>상태</th>
				<td>
					<c:if test="${item.pcdt == 'READY'}">준비</c:if>
					<c:if test="${item.pcdt == 'ONGOING'}">진행중</c:if>
					<c:if test="${item.pcdt == 'END'}">종료</c:if>
					<c:if test="${item.pcdt == 'PENDING'}">보류</c:if>
				</td>
			</tr>
		</table>
	</div>
	<div class="btnbox">
		<a href="#" id="modity">[수정]</a>
		<a href="#" id="remove">[삭제]</a>
		<a href="#" id="list">[돌아가기]</a>
	</div>
</section>
<script>
	$(function(){
		$("#modity").click(function() {
			location.href = "${pageContext.request.contextPath}/project/modity?pno=${item.pno}";
		})
		
		$("#remove").click(function() {
			var res = confirm("삭제하시겠습니까?");
			if(res == false){
				return false;
			}
			location.href = "${pageContext.request.contextPath}/project/remove?pno=${item.pno}";
		})
		
		$("#list").click(function() {
			location.href = "${pageContext.request.contextPath}/project/list";
		})
	})
</script>
<%@ include file="../include/footer.jsp" %>
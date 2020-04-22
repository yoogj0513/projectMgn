<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<style>
	.container {
		padding: 30px;
	}

	p {
		padding: 10px;
	}
	
	label {
		width: 150px;
		display: block;
		float: left;
	}
	
	input[name='pname'] {
		width: 500px;
	}
	
	.btn {
		padding-left: 160px;
	}
	
	.btn input {
		padding: 5px 20px;
		background-color: navy;
		color: #fff;
		border: none;
	}
</style>

<section class="container">
	<form action="register" method="post">
		<p>
			<label>프로젝트 이름</label>
			<input type="text" name="pname"/>
		</p>
		<p>
			<label>프로젝트 내용</label>
			<textarea rows="10" cols="80" name="pcontent"></textarea>
		</p>
		<p>
			<label>시작날짜</label>
			<input type="date" name="pstartdate" />
		</p>
		<p>
			<label>마감날짜</label>
			<input type="date" name="penddate" />
		</p>
		<p>
			<label>상태</label>
			<select name="pcdt">
				<option value="READY">준비</option>
				<option value="ONGOING">진행중</option>
				<option value="END">종료</option>
				<option value="PENDING">보류</option>
			</select>
		</p>
		<p class="btn">
			<input type="submit" value="저장"/>
			<input type="button" value="취소" id="cencal"/>
		</p>
	</form>
</section>

<script>
	$(function(){
		$("#cencal").click(function() {
			location.href = "${pageContext.request.contextPath}/project/list";
		})
	})
</script>
<%@ include file="../include/footer.jsp" %>
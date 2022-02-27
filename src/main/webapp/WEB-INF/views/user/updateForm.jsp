<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form>
		<div class="form-group">
			<label for="username">아이디:</label>
			 <input type="text" value="${principal.user.username}" class="form-control" id="username" readonly>
		</div>

		<div class="form-group">
			<label for="password">비밀번호:</label>
			 <input type="password"  value="${principal.user.password}" class="form-control" id="password">
		</div>

		<div class="form-group">
			<label for="email">Email:</label>
			 <input type="email"  value="${principal.user.email}" class="form-control"  id="email">
		</div>
	</form>

	<button id="btn-update" class="btn btn-primary">회원수정완료</button>
</div>

<script src="/js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>


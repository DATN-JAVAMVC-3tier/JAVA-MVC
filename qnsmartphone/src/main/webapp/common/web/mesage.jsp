<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<c:if test="${not empty mesage && ismesage == 'true' && not empty color}">
	<div class="card-header" style="position: absolute;right:0;top:100px;z-index: 10000;">
		<div class="alert <c:out value= "${color}"/> alert-dismissible text-center"
			role="alert">
			<button type="button" class="close" data-dismiss="alert"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			<strong>Oop!</strong>
			<c:out value="${mesage}" />
		</div>
	</div>
</c:if>
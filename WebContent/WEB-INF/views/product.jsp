<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color:red;
	}
</style>
<script type="text/javascript">
	function historyBack(){
		history.back(-1);
	}
</script>
</head>
<body>
	<h1>회원가입!</h1>
	<table>
	
	<sf:form method="post" modelAttribute="product">
	<tr>
			<td>
				<label>상품id</label>
			</td>
			<td>
				<sf:input path="pid"/><sf:errors path="pid" cssClass="error"/>
			</td>
	</tr>	
	<tr>
			<td>
				<label>상품명</label>
			</td>
			<td>
				<sf:input path="pname"/><sf:errors path="pname" cssClass="error"/>
			</td>
	</tr>
	<tr>
			<td>
				<label>가격</label>
			</td>
			<td>
				<sf:input path="price"/><sf:errors path="price" cssClass="error"/>
			</td>
	</tr>
	<tr>
			<td>
				<label>제조일자</label>
			</td>
			<td>
				<sf:input path="pdate"/><sf:errors path="pdate" cssClass="error"/>
			</td>
	</tr>
	<tr>
			<td>
				<label>설명</label>
			</td>
			<td>
				<sf:input path="content"/><sf:errors path="content" cssClass="error"/>
			</td>
	</tr>
	<tr align="center">
			<td>
			<input type="submit" id="sm">
			<input type="reset" value="칸비우기">
			<input type="button" value="돌아가기" onclick="historyBack()">
			</td>
	</tr>
	</sf:form>
	
	</table>

</body>
</html>
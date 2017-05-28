<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${member!=null }">
	<%=request.getParameter("id") %>
	<%=request.getParameter("password") %>
	<%=request.getParameter("email") %>
	
	${member.id}
	${member.password}
	${member.email}
	</c:if>
	
	<c:if test="${product!=null }">
	축하 드립니다. 입력하신 정보가 등록되었습니다.<br><br>
	입력하신 결과는<br>
	상품id : ${product.pid}<br>
	상품명 : ${product.pname}<br>
	상품가격 : ${product.price}<br>
	상품등록일 : ${product.pdate}<br>
	상세정보 : ${product.content}<br>
	</c:if>	
</body>
</html>
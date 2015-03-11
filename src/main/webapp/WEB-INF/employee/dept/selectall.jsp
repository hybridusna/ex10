<%@ page language="java" contentType="text/html; charset=UTF-8"
	trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>selectall.jsp</title>
</head>
<body>
	<hr>

	<c:set var="col" value="5"/>

		<table border="1" style="border-collapse: collapse">
			<c:forEach var="tzs" items="${requestScope.tzs }" varStatus="status">
				<c:if test="${status.index % col =0}">
					<tr>
				</c:if>
				<td>${pageScope.tzs }</td>
				<td>${status.index }</td>
				<c:if test="${status.index % col =(col-1)}">
					</tr>
				</c:if>

			</c:forEach>
		</table>
		<hr>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>显示所有学生信息</h3>
	<s:if test="#request.students==null||#request.students.size()==0">
	没有任何学生信息
	</s:if>
	<s:else>
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Gender</td>
				<td>Email</td>
				<td>Phone</td>
				<td>Birth</td>
				<td>RegTime</td>
				<td>Major</td>
			</tr>
			<s:iterator value="request.students">
				<tr>
					<td>${id}</td>
					<td>${name}</td>
					<td>${gender}</td>
					<td>${email}</td>
					<td>${phone}</td>
					<td>${birth}</td>
					<td>${regtime}</td>
					<td>${major.majorName}</td>
				</tr>
			</s:iterator>
		</table>
	</s:else>
</body>
</html>
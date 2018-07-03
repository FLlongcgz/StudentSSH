<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="scripts/jquery-3.3.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	$(function() {
		$(".delete").click(function() {
			var name=$(this).next(":hidden").val();
			var flag=confirm("确定要删除"+name+"吗?");
			if(flag){
				var $tr=$(this).parent().parent();
				var url=this.href;
				var args={"time":new Date()};
				$.post(url,args,function(data){
					if(data=="1")
					{
						alert("delete success");
						$tr.remove();
					}
					else
					{
						alert("delete failed");
					}
				})	
			}
			return false;
		});
	});
</script>
<title>Students</title>
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
				<td>DELETE</td>
			</tr>
			<s:iterator value="#request.students">
				<tr>
					<td>${id}</td>
					<td>${name}</td>
					<td>${gender}</td>
					<td>${email}</td>
					<td>${phone}</td>
					<td>
						<s:date name="birth" format="yyyy-MM-dd" />
					</td>
					<td>
						<s:date name="regTime" format="yyyy-MM-dd" />
					</td>
					<td>${major.majorName}</td>
					<td>
						<a  class="delete" href="stu-delete?id=${id}">Delete</a>
						<input type="hidden" value="${name}" />
					</td>
				</tr>
			</s:iterator>
		</table>
	</s:else>
</body>
</html>
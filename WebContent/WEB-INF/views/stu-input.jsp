<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="scripts/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$(":input[name]").change(function(){
		var val=$(this).val();
		val=$.trim(val);
		var $this=$(this)
		if(val!=""){
			var url="stu-validateName";
			var args={"name":val,"time":new Date()};
			$.post(url,args,function(data){
				if(data=="1"){
					$this.after("<font color='#0F0'>Name可用</font>");
				}else if(data=="0"){
					$this.after("<font color='#F00'>Name不可用</font>");
				}else{
					alert("SERVICE WRONG");
				}
			})
		}
		else{
			alert("Name is null");
			$(this).val("")
		}
			
	})
})
</script>
<title>Insert title here</title>
</head>
<body>
	<s:form action="stu-save" method="post">
		<s:textfield name="name" label="Name"></s:textfield>
		<s:textfield name="gender" label="Gender"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:textfield name="phone" label="Phone"></s:textfield>
		<s:textfield name="birth" label="Birth"></s:textfield>
		<s:select list="#request.majors" listKey="id" listValue="majorName" name="major.id" label="Major"></s:select>
		<s:submit></s:submit>
	</s:form>
</body>
</html>
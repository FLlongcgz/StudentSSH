package com.mycom.ssh.action;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.mycom.ssh.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport implements RequestAware
{
	private static final long serialVersionUID=1347008311237126343L;
	private StudentService studentService;
	private Map<String,Object>request;
	public StudentService getStudentService()
	{
		return studentService;
	}
	public void setStudentService(StudentService studentService)
	{
		this.studentService = studentService;
	}
	public String list()
	{
		request.put("student", studentService.getAll());
		return "list";
	}
	@Override
	public void setRequest(Map<String, Object> arg0)
	{
		// TODO Auto-generated method stub
		this.request=arg0;
	}
	
}

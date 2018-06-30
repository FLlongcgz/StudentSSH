package com.mycom.ssh.action;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.mycom.ssh.entities.Student;
import com.mycom.ssh.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport implements RequestAware
{
	private static final long serialVersionUID = 2599317854694442575L;
	private StudentService studentService;
	private Map<String,Object>request;
	public void setStudentService(StudentService studentService)
	{
		this.studentService = studentService;
	}
	public String list()
	{
		List<Student> s=studentService.getAll();
		request.put("students", s);
		for(Student a:s)
		{
			System.out.println(a.toString());
		}
		return "list";
	}
	@Override
	public void setRequest(Map<String, Object> arg0)
	{
		// TODO Auto-generated method stub
		this.request=arg0;
	}
}

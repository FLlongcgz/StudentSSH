package com.mycom.ssh.action;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.mycom.ssh.entities.Major;
import com.mycom.ssh.entities.Student;
import com.mycom.ssh.service.MajorService;
import com.mycom.ssh.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class StudentAction extends ActionSupport implements RequestAware,ModelDriven<Student>,Preparable
{
	private static final long serialVersionUID = 2599317854694442575L;
	private StudentService studentService;
	private Integer id;
	private Student model;
	private MajorService majorService;
	private InputStream inputStream;
	private String name;
	public void setName(String name)
	{
		this.name = name;
	}
	public void setMajorService(MajorService majorService)
	{
		this.majorService = majorService;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public InputStream getInputStream()
	{
		return inputStream;
	}
	public String delete()
	{
		studentService.delete(id);
		try
		{
			inputStream=new ByteArrayInputStream("1".getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e)
		{
			// TODO Auto-generated catch block
			try
			{
				inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		return "ajax-success";
	}
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
	public String input()
	{
		request.put("majors", majorService.getAll());
		return INPUT;
	}
	public String save()
	{
		model.setRegTime(new Date());
		studentService.saveOrUpdate(model);
		return SUCCESS;
	}
	@Override
	public void setRequest(Map<String, Object> arg0)
	{
		// TODO Auto-generated method stub
		this.request=arg0;
	}
	@Override
	public Student getModel()
	{
		// TODO Auto-generated method stub
		return model;
	}
	public void prepareSave()
	{
		model=new Student();
	}
	public String validateName() throws UnsupportedEncodingException
	{
		if(studentService.isNameVaild(name))
		{
				inputStream=new ByteArrayInputStream("1".getBytes("UTF-8"));
		}
		else 
		{
				inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));	
		}
		return "ajax-success";
	}
	@Override
	public void prepare() throws Exception
	{
	}
}

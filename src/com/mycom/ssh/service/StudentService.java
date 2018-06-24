package com.mycom.ssh.service;

import java.util.List;

import com.mycom.ssh.dao.StudentDao;
import com.mycom.ssh.entities.Student;

public class StudentService
{
	private StudentDao studentDao;
	public void setStudentDao(StudentDao studentDao)
	{
		this.studentDao = studentDao;
	}
	public List<Student> getAll()
	{
		return studentDao.getAll();
	}
	public Student get(Integer id)
	{
		return studentDao.get(id);
	}
	public boolean isNameVaild(String name)
	{
		return studentDao.getByName(name)==null;
	}
	public void delete(Integer id)
	{
		studentDao.delete(id);
	}
	public void saveOrUpdate(Student student)
	{
		studentDao.saveOrUpdate(student);
	}
}

package com.mycom.ssh.entities;

import java.sql.Date;

public class Student
{
	private Integer id;
	private String name;
	private String gender;
	private String email;
	public Student()
	{
		super();
	}
	public Student(Integer id, String name, String gender, String email, String phone, Date regTime, Major major)
	{
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.regTime = regTime;
		this.major = major;
	}
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", phone=" + phone
				+ ", regTime=" + regTime + ", major=" + major + "]";
	}
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public Date getRegTime()
	{
		return regTime;
	}
	public void setRegTime(Date regTime)
	{
		this.regTime = regTime;
	}
	public Major getMajor()
	{
		return major;
	}
	public void setMajor(Major major)
	{
		this.major = major;
	}
	private String phone;
	private Date regTime;
	private Major major;
}

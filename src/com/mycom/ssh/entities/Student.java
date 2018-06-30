package com.mycom.ssh.entities;

import java.util.Date;

public class Student
{
	private Integer id;
	private String name;
	private String gender;
	private String email;
	private Date birth;
	private Date regTime;
	private String phone;
	private Major major;
	
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", birth=" + birth
				+ ", regTime=" + regTime + ", phone=" + phone + ", major=" + major + "]";
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
	public Date getBirth()
	{
		return birth;
	}
	public void setBirth(Date birth)
	{
		this.birth = birth;
	}
	public Date getRegTime()
	{
		return regTime;
	}
	public void setRegTime(Date regTime)
	{
		this.regTime = regTime;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public Major getMajor()
	{
		return major;
	}
	public void setMajor(Major major)
	{
		this.major = major;
	}
	
}

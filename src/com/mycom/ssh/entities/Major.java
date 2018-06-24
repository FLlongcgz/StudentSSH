package com.mycom.ssh.entities;

public class Major
{
	private Integer id;
	private String majorName;
	public Major(Integer id, String majorName)
	{
		super();
		this.id = id;
		this.majorName = majorName;
	}
	public Major()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getMajorName()
	{
		return majorName;
	}
	public void setMajorName(String majorName)
	{
		this.majorName = majorName;
	}
}

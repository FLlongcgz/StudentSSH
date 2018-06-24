package com.mycom.ssh.service;

import java.util.List;

import com.mycom.ssh.dao.MajorDao;
import com.mycom.ssh.entities.Major;

public class MajorService
{
	private MajorDao majorDao;
	public void setMajorDao(MajorDao majorDao)
	{
		this.majorDao = majorDao;
	}
	public List<Major> getAll()
	{
		return majorDao.getAll();
	}
	
}

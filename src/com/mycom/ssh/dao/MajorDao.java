package com.mycom.ssh.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mycom.ssh.entities.Major;


public class MajorDao extends BaseDao
{

	public List<Major> getAll()
	{
		String hql="FROM Major";
		return getSession().createQuery(hql).list();
	}
}

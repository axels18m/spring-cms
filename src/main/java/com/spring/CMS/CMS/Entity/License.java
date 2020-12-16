package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "license")
public class License 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_license;
	
	private String name_license;
	
	public License(int id_license, String name_license) 
	{
		this.id_license = id_license;
		this.name_license = name_license;
	}
	
	public License() {}

	public int getId_license() 
	{
		return id_license;
	}

	public void setId_license(int id_license) 
	{
		this.id_license = id_license;
	}

	public String getName_license() 
	{
		return name_license;
	}

	public void setName_license(String name_license) 
	{
		this.name_license = name_license;
	}

	@Override
	public String toString() 
	{
		return "License [id_license=" + id_license + ", name_license=" + name_license + "]";
	}
}

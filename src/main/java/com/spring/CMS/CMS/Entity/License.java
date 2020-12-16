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
	private int idLicense;
	
	private String nameLicense;
	
	public License(int id, String name)
	{
		this.idLicense = id;
		this.nameLicense = name;
	}
	
	public License() {}

	public int getIdLicense() 
	{
		return idLicense;
	}

	public void setIdLicense(int idLicense) 
	{
		this.idLicense = idLicense;
	}

	public String getNameLicense() 
	{
		return nameLicense;
	}

	public void setNameLicense(String nameLicense) 
	{
		this.nameLicense = nameLicense;
	}

	@Override
	public String toString() 
	{
		return "License [idLicense=" + idLicense + ", nameLicense=" + nameLicense + "]";
	}
}

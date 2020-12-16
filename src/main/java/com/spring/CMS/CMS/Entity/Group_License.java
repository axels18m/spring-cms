package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "group_license")
public class Group_License
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGpolic;
	
	private int idLicenseGpolic;
	
	public Group_License(int group, int license)
	{
		this.idGpolic = group;
		this.idLicenseGpolic = license;
	}
	
	public Group_License() {}

	public int getIdGpolic() 
	{
		return idGpolic;
	}

	public void setIdGpolic(int idGpolic) 
	{
		this.idGpolic = idGpolic;
	}

	public int getIdLicenseGpolic() 
	{
		return idLicenseGpolic;
	}

	public void setIdLicenseGpolic(int idLicenseGpolic) 
	{
		this.idLicenseGpolic = idLicenseGpolic;
	}

	@Override
	public String toString() 
	{
		return "Group_License [idGpolic=" + idGpolic + ", idLicenseGpolic=" + idLicenseGpolic + "]";
	}	
	
}

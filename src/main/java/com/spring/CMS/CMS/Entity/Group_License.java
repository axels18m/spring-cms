package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Group_License
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_gpolic;
	
	private int idLicense_gpolic;
	
	public Group_License(int group, int license)
	{
		this.id_gpolic = group;
		this.idLicense_gpolic = license;
	}
	
	public Group_License() {}

	public int getId_Gpolic() 
	{
		return id_gpolic;
	}

	public void setId_Gpolic(int id_gpolic) 
	{
		this.id_gpolic = id_gpolic;
	}

	public int getIdLicense_Gpolic() 
	{
		return idLicense_gpolic;
	}

	public void setIdLicense_Gpolic(int idLicense_gpolic) 
	{
		this.idLicense_gpolic = idLicense_gpolic;
	}

	@Override
	public String toString() {
		return "Group_License [id_gpolic=" + id_gpolic + ", idLicense_gpolic=" + idLicense_gpolic + "]";
	}
	
}

package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user_metadata")
public class User_Metadata 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMetadata;
	
	private int idUserMetadata;
	private String keyMetadata;
	private String valueMetada;
	private String typeMetada;
	
	public User_Metadata(int metadata, int user, String key, String value, String type)
	{
		this.idMetadata = metadata;
		this.idUserMetadata = user;
		this.keyMetadata = key;
		this.valueMetada = value;
		this.typeMetada = type;
	}
	
	public User_Metadata() {}

	public int getIdMetadata() 
	{
		return idMetadata;
	}

	public void setIdMetadata(int idMetadata) 
	{
		this.idMetadata = idMetadata;
	}

	public int getIdUserMetadata() 
	{
		return idUserMetadata;
	}

	public void setIdUserMetadata(int idUserMetadata) 
	{
		this.idUserMetadata = idUserMetadata;
	}

	public String getKeyMetadata() 
	{
		return keyMetadata;
	}

	public void setKeyMetadata(String keyMetadata) 
	{
		this.keyMetadata = keyMetadata;
	}

	public String getValueMetada() 
	{
		return valueMetada;
	}

	public void setValueMetada(String valueMetada) 
	{
		this.valueMetada = valueMetada;
	}

	public String getTypeMetada() 
	{
		return typeMetada;
	}

	public void setTypeMetada(String typeMetada) 
	{
		this.typeMetada = typeMetada;
	}

	@Override
	public String toString() 
	{
		return "User_Metadata [idMetadata=" + idMetadata + ", idUserMetadata=" + idUserMetadata + ", keyMetadata="
				+ keyMetadata + ", valueMetada=" + valueMetada + ", typeMetada=" + typeMetada + "]";
	}
}

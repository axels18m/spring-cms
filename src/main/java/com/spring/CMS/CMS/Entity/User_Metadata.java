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
	private int id_metadata;
	
	private int id_user_metadata;
	private String key_metadata;
	private String value_metada;
	private String type_metada;
	
	public User_Metadata(int id_metadata, int id_user_metadata, String key_metadata, String value_metada,
			String type_metada) 
	{
		this.id_metadata = id_metadata;
		this.id_user_metadata = id_user_metadata;
		this.key_metadata = key_metadata;
		this.value_metada = value_metada;
		this.type_metada = type_metada;
	}

	public User_Metadata() {}

	public int getId_metadata() 
	{
		return id_metadata;
	}

	public void setId_metadata(int id_metadata) 
	{
		this.id_metadata = id_metadata;
	}

	public int getId_user_metadata() 
	{
		return id_user_metadata;
	}

	public void setId_user_metadata(int id_user_metadata) 
	{
		this.id_user_metadata = id_user_metadata;
	}

	public String getKey_metadata() 
	{
		return key_metadata;
	}

	public void setKey_metadata(String key_metadata) 
	{
		this.key_metadata = key_metadata;
	}

	public String getValue_metada() 
	{
		return value_metada;
	}

	public void setValue_metada(String value_metada) 
	{
		this.value_metada = value_metada;
	}

	public String getType_metada() 
	{
		return type_metada;
	}

	public void setType_metada(String type_metada) 
	{
		this.type_metada = type_metada;
	}

	@Override
	public String toString() 
	{
		return "User_Metadata [id_metadata=" + id_metadata + ", id_user_metadata=" + id_user_metadata
				+ ", key_metadata=" + key_metadata + ", value_metada=" + value_metada + ", type_metada=" + type_metada
				+ "]";
	}
	
}

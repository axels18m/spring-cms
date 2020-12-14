package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User_Metadata 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_metadata;
	
	private int idUser_metadata;
	private String key_metadata;
	private String value_metada;
	private String type_metada;
	
	public User_Metadata(int metadata, int user, String key, String value, String type)
	{
		this.id_metadata = metadata;
		this.idUser_metadata = user;
		this.key_metadata = key;
		this.value_metada = value;
		this.type_metada = type;
	}
	
	public User_Metadata() {}

	public int getId_Metadata() 
	{
		return id_metadata;
	}

	public void setId_Metadata(int id_metadata) 
	{
		this.id_metadata = id_metadata;
	}

	public int getIdUser_Metadata() 
	{
		return idUser_metadata;
	}

	public void setIdUser_Metadata(int idUser_metadata) 
	{
		this.idUser_metadata = idUser_metadata;
	}

	public String getKey_Metadata() 
	{
		return key_metadata;
	}

	public void setKey_Metadata(String key_metadata) 
	{
		this.key_metadata = key_metadata;
	}

	public String getValue_Metadata() 
	{
		return value_metada;
	}

	public void setValue_Metadata(String value_metada) 
	{
		this.value_metada = value_metada;
	}

	public String getType_Metadata() 
	{
		return type_metada;
	}

	public void setType_Metadata(String type_metada) 
	{
		this.type_metada = type_metada;
	}

	@Override
	public String toString() {
		return "User_Metadata [id_metadata=" + id_metadata + ", idUser_metadata=" + idUser_metadata + ", key_metadata="
				+ key_metadata + ", value_metada=" + value_metada + ", type_metada=" + type_metada + "]";
	}
	
}

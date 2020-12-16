package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "post_meta")
public class Post_Metadata 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPostmet;
	
	private int idPostPostmet;
	private String keyPostmet;
	private String valuePostmet;
	private String typePostmet;
	
	public Post_Metadata(int metadata, int post, String key, String value, String type)
	{
		this.idPostmet = metadata;
		this.idPostPostmet = post;
		this.keyPostmet = key;
		this.valuePostmet = value;
		this.typePostmet = value;
	}
	
	public Post_Metadata() {}

	public int getIdPostmet() 
	{
		return idPostmet;
	}

	public void setIdPostmet(int idPostmet) 
	{
		this.idPostmet = idPostmet;
	}

	public int getIdPostPostmet() 
	{
		return idPostPostmet;
	}

	public void setIdPostPostmet(int idPostPostmet) 
	{
		this.idPostPostmet = idPostPostmet;
	}

	public String getKeyPostmet() 
	{
		return keyPostmet;
	}

	public void setKeyPostmet(String keyPostmet) 
	{
		this.keyPostmet = keyPostmet;
	}

	public String getValuePostmet() 
	{
		return valuePostmet;
	}

	public void setValuePostmet(String valuePostmet) 
	{
		this.valuePostmet = valuePostmet;
	}

	public String getTypePostmet() 
	{
		return typePostmet;
	}

	public void setTypePostmet(String typePostmet) 
	{
		this.typePostmet = typePostmet;
	}

	@Override
	public String toString() 
	{
		return "Post_Metadata [idPostmet=" + idPostmet + ", idPostPostmet=" + idPostPostmet + ", keyPostmet="
				+ keyPostmet + ", valuePostmet=" + valuePostmet + ", typePostmet=" + typePostmet + "]";
	}
	
}

package com.spring.CMS.CMS.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "content")
public class Content 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idContent;
	
	private String typeContent;
	private String descriptionContent;
	private int idPostContent;
	
	public Content(int content, String type, String description, int post)
	{
		this.idContent = content;
		this.typeContent = type;
		this.descriptionContent = description;
		this.idPostContent = post;
	}
	
	public Content() {}

	public int getIdContent() 
	{
		return idContent;
	}

	public void setIdContent(int idContent) 
	{
		this.idContent = idContent;
	}

	public String getTypeContent() 
	{
		return typeContent;
	}

	public void setTypeContent(String typeContent) 
	{
		this.typeContent = typeContent;
	}

	public String getDescriptionContent() 
	{
		return descriptionContent;
	}

	public void setDescriptionContent(String descriptionContent) 
	{
		this.descriptionContent = descriptionContent;
	}

	public int getIdPostContent() 
	{
		return idPostContent;
	}

	public void setIdPostContent(int idPostContent) 
	{
		this.idPostContent = idPostContent;
	}

	@Override
	public String toString() 
	{
		return "Content [idContent=" + idContent + ", typeContent=" + typeContent + ", descriptionContent="
				+ descriptionContent + ", idPostContent=" + idPostContent + "]";
	}

}

package com.spring.CMS.CMS.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cat;
	private String name_cat;
	private String description_cat;
	private Date date_cat = new Date();
	private int catSuperior_cat;
	
	public Category(int id, String name, String description, Date date, int cat)
	{
		this.id_cat = id;
		this.name_cat = name;
		this.description_cat = description;
		this.date_cat = date;
		this.catSuperior_cat = cat;
	}
	
	public Category() {}

	public int getId_Cat() 
	{
		return id_cat;
	}

	public void setId_Cat(int id) 
	{
		this.id_cat = id;
	}

	public String getName_Cat() 
	{
		return name_cat;
	}

	public void setName_Cat(String name) 
	{
		this.name_cat = name;
	}

	public String getDescription_Cat() 
	{
		return description_cat;
	}

	public void setDescription_Cat(String description) 
	{
		this.description_cat = description;
	}

	public Date getDate_Cat() 
	{
		return date_cat;
	}

	public void setDate_Cat(Date date) 
	{
		this.date_cat = date;
	}

	public int getCatSuperior_Cat() 
	{
		return catSuperior_cat;
	}

	public void setCatSuperior_Cat(int cat_superior) 
	{
		this.catSuperior_cat = cat_superior;
	}
	
}

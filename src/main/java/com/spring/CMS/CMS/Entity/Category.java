package com.spring.CMS.CMS.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "category")
public class Category 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cat;
	private String name_cat;
	private String description_cat;
	private Date date_cat;
	private int cat_superior_cat;
	
	public Category(int id_cat, String name_cat, String description_cat, Date date_cat, int cat_superior_cat)
	{
		this.id_cat = id_cat;
		this.name_cat = name_cat;
		this.description_cat = description_cat;
		this.date_cat = date_cat;
		this.cat_superior_cat = cat_superior_cat;
	}

	public Category() {}

	public int getId_cat() 
	{
		return id_cat;
	}

	public void setId_cat(int id_cat)
	{
		this.id_cat = id_cat;
	}

	public String getName_cat() 
	{
		return name_cat;
	}

	public void setName_cat(String name_cat) 
	{
		this.name_cat = name_cat;
	}

	public String getDescription_cat() 
	{
		return description_cat;
	}

	public void setDescription_cat(String description_cat) 
	{
		this.description_cat = description_cat;
	}

	public Date getDate_cat() 
	{
		return date_cat;
	}

	public void setDate_cat(Date date_cat) 
	{
		this.date_cat = date_cat;
	}

	public int getCat_superior_cat() 
	{
		return cat_superior_cat;
	}

	public void setCat_superior_cat(int cat_superior_cat) 
	{
		this.cat_superior_cat = cat_superior_cat;
	}

	@Override
	public String toString()
	{
		return "Category [id_cat=" + id_cat + ", name_cat=" + name_cat + ", description_cat=" + description_cat
				+ ", date_cat=" + date_cat + ", cat_superior_cat=" + cat_superior_cat + "]";
	}
}

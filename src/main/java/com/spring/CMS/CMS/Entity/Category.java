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
	private int idCat;
	private String nameCat;
	private String descriptionCat;
	private Date dateCat;
	private int catSuperiorCat;
	
	public Category(int id, String name, String description, Date date, int cat)
	{
		this.idCat = id;
		this.nameCat = name;
		this.descriptionCat = description;
		this.dateCat = date;
		this.catSuperiorCat = cat;
	}
	
	public Category() {}

	public int getIdCat() 
	{
		return idCat;
	}

	public void setIdCat(int id_cat) 
	{
		this.idCat = id_cat;
	}

	public String getNameCat() 
	{
		return nameCat;
	}

	public void setNameCat(String nameCat) 
	{
		this.nameCat = nameCat;
	}

	public String getDescriptionCat() 
	{
		return descriptionCat;
	}

	public void setDescriptionCat(String descriptionCat) 
	{
		this.descriptionCat = descriptionCat;
	}

	public Date getDateCat() 
	{
		return dateCat;
	}

	public void setDateCat(Date dateCat) 
	{
		this.dateCat = dateCat;
	}

	public int getCatSuperiorCat() 
	{
		return catSuperiorCat;
	}

	public void setCatSuperiorCat(int catSuperiorCat) 
	{
		this.catSuperiorCat = catSuperiorCat;
	}

	@Override
	public String toString() 
	{
		return "Category [idCat=" + idCat + ", nameCat=" + nameCat + ", descriptionCat=" + descriptionCat + ", dateCat="
				+ dateCat + ", catSuperiorCat=" + catSuperiorCat + "]";
	}
	
	
}

package com.spring.CMS.CMS.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_commt;
	
	private String comment_cmmt;
	private int idPost_cmmt;
	private int idUser_cmmt;
	private Date date_cmmt;
	private String answer_cmmt;
	
	public Comment(int id, int post, int user, Date date, String answer)
	{
		this.id_commt = id;
		this.idPost_cmmt = post;
		this.idUser_cmmt = user;
		this.date_cmmt = date;
		this.date_cmmt = date;
		this.answer_cmmt = answer;
	}
	
	public int getId_Commt() 
	{
		return id_commt;
	}
	
	public void setId_Commt(int id_commt) 
	{
		this.id_commt = id_commt;
	}
	
	public String getComment_Cmmt() 
	{
		return comment_cmmt;
	}
	
	public void setComment_Cmmt(String comment_cmmt) 
	{
		this.comment_cmmt = comment_cmmt;
	}
	
	public int getIdPost_Cmmt() 
	{
		return idPost_cmmt;
	}
	
	public void setIdPost_Cmmt(int id_post) 
	{
		this.idPost_cmmt = id_post;
	}
	
	public int getIdUser_Cmmt() 
	{
		return idUser_cmmt;
	}
	
	public void setIdUser_Cmmt(int id_user) 
	{
		this.idUser_cmmt = id_user;
	}
	
	public Date getDate_Cmmt() 
	{
		return date_cmmt;
	}
	
	public void setDate_Cmmt(Date date_commt) {
		this.date_cmmt = date_commt;
	}
	
	public String getAnswer_Cmmt() 
	{
		return answer_cmmt;
	}
	
	public void setAnswer_Cmmt(String answer_commt) 
	{
		this.answer_cmmt = answer_commt;
	}

	@Override
	public String toString() {
		return "Comment [id_commt=" + id_commt + ", comment_cmmt=" + comment_cmmt + ", idPost_cmmt=" + idPost_cmmt
				+ ", idUser_cmmt=" + idUser_cmmt + ", date_cmmt=" + date_cmmt + ", answer_cmmt=" + answer_cmmt + "]";
	}
	
}

package com.spring.CMS.CMS.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "comment")
public class Comment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCommt;
	
	private String commentCmmt;
	private int idPostCmmt;
	private int idUserCmmt;
	private Date dateCmmt;
	private String answerCmmt;
	
	public Comment(int id, int post, int user, Date date, String answer)
	{
		this.idCommt = id;
		this.idPostCmmt = post;
		this.idUserCmmt = user;
		this.dateCmmt = date;
		this.dateCmmt = date;
		this.answerCmmt = answer;
	}
	
	public Comment() {}

	public int getIdCommt() 
	{
		return idCommt;
	}

	public void setIdCommt(int idCommt) 
	{
		this.idCommt = idCommt;
	}

	public String getCommentCmmt() 
	{
		return commentCmmt;
	}

	public void setCommentCmmt(String commentCmmt) 
	{
		this.commentCmmt = commentCmmt;
	}

	public int getIdPostCmmt() 
	{
		return idPostCmmt;
	}

	public void setIdPostCmmt(int idPostCmmt) 
	{
		this.idPostCmmt = idPostCmmt;
	}

	public int getIdUserCmmt() 
	{
		return idUserCmmt;
	}

	public void setIdUserCmmt(int idUserCmmt) 
	{
		this.idUserCmmt = idUserCmmt;
	}

	public Date getDateCmmt() 
	{
		return dateCmmt;
	}

	public void setDateCmmt(Date dateCmmt) 
	{
		this.dateCmmt = dateCmmt;
	}

	public String getAnswerCmmt() 
	{
		return answerCmmt;
	}

	public void setAnswerCmmt(String answerCmmt) 
	{
		this.answerCmmt = answerCmmt;
	}

	@Override
	public String toString() 
	{
		return "Comment [idCommt=" + idCommt + ", commentCmmt=" + commentCmmt + ", idPostCmmt=" + idPostCmmt
				+ ", idUserCmmt=" + idUserCmmt + ", dateCmmt=" + dateCmmt + ", answerCmmt=" + answerCmmt + "]";
	}
	
	
}

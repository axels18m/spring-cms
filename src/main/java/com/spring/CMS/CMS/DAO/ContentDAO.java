package com.spring.CMS.CMS.DAO;

import java.util.List;

import com.spring.CMS.CMS.Entity.Content;

public interface ContentDAO 
{
	public List<Content> getAll();
	public Content getById(int id);
	public List<Content> getByPost(int post);
	public void save(ContentDAO content);
	public void update(ContentDAO content);
	public void delete(ContentDAO content);
}

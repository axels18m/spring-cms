package com.spring.CMS.CMS.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Content;

public interface ContentService 
{
	public List<Content> getAll(Pageable pageable);
	public Content getById(int id);
	public List<Content> getByPost(int post);
	public void save(Content content);
	public void update(Content content);
	public void delete(Content content);
}

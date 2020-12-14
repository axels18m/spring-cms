package com.spring.CMS.CMS.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Post_Metadata;

public interface Post_MetadataService 
{
	public List<Post_Metadata> getAll(Pageable pageable);
	public List<Post_Metadata> getByKey(String key);
	public List<Post_Metadata> getByType(String type);
	public Post_Metadata getById(int id);
	public void save(Post_Metadata post);
	public void update(Post_Metadata post);
	public void delete(Post_Metadata post);
}

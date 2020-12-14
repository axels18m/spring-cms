package com.spring.CMS.CMS.DAO;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Post_Metadata;
import com.spring.CMS.CMS.Mapper.BaseRep;

public interface Post_MetadataDAO extends BaseRep<Post_Metadata>
{
	public List<Post_Metadata> getAll(Pageable pageable);
	public List<Post_Metadata> getByKey(String key);
	public List<Post_Metadata> getByType(String type);
	public Post_Metadata getById(int id);
	public void save(Post_Metadata post);
	public void update(Post_Metadata post);
	public void delete(Post_Metadata post);
}

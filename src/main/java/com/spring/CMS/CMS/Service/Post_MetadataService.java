package com.spring.CMS.CMS.Service;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.spring.CMS.CMS.Entity.Post_Metadata;
import com.spring.CMS.CMS.Mapper.BaseRep;

public interface Post_MetadataService extends BaseRep<Post_Metadata>
{
	public List<Post_Metadata> getAll(Pageable pageable);
	public List<Post_Metadata> getByKey(String key);
	public List<Post_Metadata> getByType(String type);
	public Post_Metadata getById(int id);
	public Post_Metadata save(Post_Metadata post);
	public Post_Metadata update(Post_Metadata post);
	public void delete(Post_Metadata post);

	public List<Post_Metadata> getByPost(int post);
}

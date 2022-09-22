package com.silt.blog.entity;

import com.silt.blog.dao.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}

package com.codeup.springblog.repositories;

import com.codeup.springblog.Models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

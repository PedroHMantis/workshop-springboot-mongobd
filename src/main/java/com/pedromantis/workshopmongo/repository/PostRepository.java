package com.pedromantis.workshopmongo.repository;

import com.pedromantis.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}

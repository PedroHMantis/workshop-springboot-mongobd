package com.pedromantis.workshopmongo.services;

import com.pedromantis.workshopmongo.domain.Post;
import com.pedromantis.workshopmongo.repository.PostRepository;
import com.pedromantis.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id){
        Optional<Post> obj = postRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));
    }
}

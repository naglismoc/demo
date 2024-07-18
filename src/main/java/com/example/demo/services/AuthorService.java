package com.example.demo.services;

import com.example.demo.models.Author;
import com.example.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public Iterable<Author> findAll(){
        return authorRepository.findAll();
    }

    public Optional<Author> findById(Long id){
        return authorRepository.findById(id);
    }

}

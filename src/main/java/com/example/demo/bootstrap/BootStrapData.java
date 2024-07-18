package com.example.demo.bootstrap;

import com.example.demo.repository.AuthorRepository;
import org.springframework.boot.CommandLineRunner;

public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;

    public BootStrapData(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) {
        System.out.println("labas");
//        System.out.println(authorRepository.findById(1l));
//        System.out.println(authorRepository.findAll());

    }
}

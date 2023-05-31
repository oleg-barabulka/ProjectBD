package com.example.library;

import com.example.library.models.Literature;
import com.example.library.repositories.LiteratureRepository;
import com.example.library.sevices.LiteratureService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.Date;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LibraryApplication.class, args);
	}

}

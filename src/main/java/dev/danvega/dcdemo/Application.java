package dev.danvega.dcdemo;

import dev.danvega.dcdemo.model.Post;
import dev.danvega.dcdemo.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository repository) {
		return args -> repository.save(new Post("Hello World!","My first blog post!"));
	}

}

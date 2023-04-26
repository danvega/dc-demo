package dev.danvega.dcdemo.repository;

import dev.danvega.dcdemo.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post,Integer> {
}

package com.thainafonsecadev.workshopmongo.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thainafonsecaadev.workshopmongo.domain.Post;
import com.thainafonsecadev.workshopmongo.domain.User;

	@Repository
	public interface PostRepository extends MongoRepository<Post, String> {

		User findOne(String id);

}

package com.thainafonsecadev.workshopmongo.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thainafonsecadev.workshopmongo.domain.User;

	@Repository
	public interface UserRepository extends MongoRepository<User, String> {

		User findOne(String id);

}

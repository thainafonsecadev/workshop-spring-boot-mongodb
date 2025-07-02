package com.thainafonsecadev.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.thainafonsecadev.workshopmongo.domain.User;

	@Repository
	public interface UserRepository extends MongoRepository<User, String> {

		static void save(List<User> asList) {
			
		}
	

}

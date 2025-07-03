package com.thainafonsecadev.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thainafonsecadev.workshopmongo.domain.User;
import com.thainafonsecadev.workshopmongo.dto.UserDTO;
import com.thainafonsecadev.workshopmongo.repository.UserRepository;
import com.thainafonsecadev.workshopmongo.service.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	private User objDto;
	
	public List<User> findAll() {
		return repo.findAll();
		
	}

	public User findById(String id) {
		
		User user = (User) repo.findOne(id);
		if(user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		
		findById(id);
		
		repo.deleteById(id);	
	}
	
	
	public User update(User obj) {
	    User newObj = repo.findById(obj.getId())  .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	    updateData(newObj, obj);
	    return repo.save(newObj);
	}

	
	private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
	}

	public User fromDTO(UserDTO objtDto) {
		return new User(objDto.getId(), objDto.getName(),objDto.getEmail());
	}
}

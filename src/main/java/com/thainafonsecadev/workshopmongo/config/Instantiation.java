package com.thainafonsecadev.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.thainafonsecaadev.workshopmongo.domain.Post;
import com.thainafonsecadev.workshopmongo.domain.User;
import com.thainafonsecadev.workshopmongo.repository.PostRepository;
import com.thainafonsecadev.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

    private final PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PostRepository PostRepository1;

    Instantiation(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void run(String... args) throws Exception {
    	
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
    	
    	
        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");
        
        
        Post post1 = new Post(null, sdf.parse("03/07/2025"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", maria);
        Post post2 = new Post(null, sdf.parse("05/07/2025"), "Bom dia", "Acordei feliz hoje!",maria);
        	

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
        postRepository.saveAll(Arrays.asList(post1,post2));
    }

	public PostRepository getPostRepository1() {
		return PostRepository1;
	}

	public void setPostRepository1(PostRepository postRepository1) {
		PostRepository1 = postRepository1;
	}
}


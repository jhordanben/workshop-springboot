package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/naotemdianaotemhora")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "ariana", "onelasttime@gmail.com", "11974819322", "12345");
		User u2 = new User (2L, "É SEMPRE ASSIM", "VOCE ME AMA E VAI EMBORA @GMAIL.COM", "19138318312", "13332");
		return ResponseEntity.ok().body(u2);
		
	}

}

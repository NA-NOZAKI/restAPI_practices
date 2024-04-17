package com.returns;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnUsers {

	@GetMapping("/users")
	public List<User> returnUser() {
		List<User> userList = new ArrayList();
		userList.add(new User("001", "suzuki"));
		userList.add(new User("002", "satou"));
		userList.add(new User("003", "tanaka"));
		return userList;
	}
}

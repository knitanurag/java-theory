package com.anurag.jth.java8.stream;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {

		//creating empty optional object.
		Optional<User> emptyUser = Optional.empty();
		
		//Creating optional with non null values
		User nonNullUser = new User(1, "Anurag");
		Optional<User> nonNullOptionalUser = Optional.of(nonNullUser);
		
		//return  empty if null other the user itself
		Optional<User> userOptional = Optional.ofNullable(nonNullUser);
		
		//If value is present then return true.
		userOptional.isPresent();
		
		//calling with non null user
		userOptional.ifPresent(user->{
			System.out.println(user.getId());
		});
		
		//calling with null user
		emptyUser.ifPresent(user->{
			System.out.println(user.getId());
		});
		
		
		
		

	}
}

class User {

	private int id;
	private String name;

	public User(int id, String name) {
		super();
		this.setId(id);
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

}
package Model;

import java.time.LocalDate;

public class Cat extends Pet{

	public Cat() {
		
	}

	public Cat(String name, LocalDate dob) {
		super(name, dob);
		// TODO Auto-generated constructor stub
	}


	public void meow() {
		System.out.println("Meow meow");
	}
}

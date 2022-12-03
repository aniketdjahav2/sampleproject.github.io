package com.jpa.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.test.entities.input;
import com.jpa.test.userRepo.userRepo;

@Component   //to tell compilar that we have to create object of this class automatically
public class service {
	 @Autowired
	 private userRepo userRepo;

	public String performOperation(input in) {
		// TODO Auto-generated method stub
		int sol=0;
		this.userRepo.save(in);
		if(in.getOperation().equalsIgnoreCase("addition")) {
			 sol=in.getX()+in.getY();
			return "Solution is"+sol;
		}
		else if (in.getOperation().equalsIgnoreCase("substraction")) {
			sol=in.getX()-in.getY();
			return "Solution is"+sol;
		}
		else if (in.getOperation().equalsIgnoreCase("multipication")) {
			sol=in.getX()*in.getY();
			return "Solution is"+sol;
		}
		else if (in.getOperation().equalsIgnoreCase("division")) {
			sol=in.getX()/in.getY();
			return "Solution is"+sol;
		}
		else {
			return"Invalid Operation entered";
		}
		
	}

	public Optional<input> getOperation(int id) {
		System.out.println("inside service");
		Optional<input> input=null;
		// TODO Auto-generated method stub
		input=this.userRepo.findById(id);
		return input;
	}
	
	 
}

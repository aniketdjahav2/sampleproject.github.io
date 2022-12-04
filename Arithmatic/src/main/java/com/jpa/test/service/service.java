package com.jpa.test.service;

import java.util.Optional;

import javax.xml.stream.XMLInputFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jpa.test.entities.input;
import com.jpa.test.userRepo.userRepo;

@Component   //to tell compilar that we have to create object of this class automatically
public class service {
	 @Autowired
	 private userRepo userRepo;
//---------------------------------------------Performing Operation And Storing data-----------------------//
	public String performOperation(input in) {
		// TODO Auto-generated method stub
		int sol=0;
		
		if(in.getOperation().equalsIgnoreCase("addition")) {
			 sol=in.getX()+in.getY();
			 this.userRepo.save(in);
			return "Solution is "+sol;
		}
		else if (in.getOperation().equalsIgnoreCase("substraction")) {
			sol=in.getX()-in.getY();
			this.userRepo.save(in);
			return "Solution is "+sol;
		}
		else if (in.getOperation().equalsIgnoreCase("multipication")) {
			sol=in.getX()*in.getY();
			this.userRepo.save(in);
			return "Solution is "+sol;
		}
		else if (in.getOperation().equalsIgnoreCase("division")) {
			sol=in.getX()/in.getY();
			this.userRepo.save(in);
			return "Solution is "+sol;
		}
		else {
			return"Invalid Operation entered";
		}
		
	}
	
	
	
	
//------------------------Get Operation By Id---------------------------------//
	public Optional<input> getOperation(int id) {
		System.out.println("inside service");
		Optional<input> input=null;
		input=this.userRepo.findById(id);
		return input;
	}
	
	
	//--------------------Delete By Id--------------------------------------//

	public boolean deleteById(int id) {
		
		Optional<input> input=null;
		input=this.userRepo.findById(id);
		if(input==null) {
			return false;
		}
		else {
			this.userRepo.deleteById(id);
			return true;
		}
	
	}
	
	 
}

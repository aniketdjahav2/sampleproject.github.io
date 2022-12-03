package com.jpa.test.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.entities.input;
import com.jpa.test.service.service;

@RestController
public class controller {
	  @Autowired     //atomatically create object
	  private service service;
	  
	  @PostMapping("takeInputasJson")
	  public <T> ResponseEntity<T> getInput(@RequestBody input in) {
		 String solString= this.service.performOperation(in);
		  return (ResponseEntity<T>) ResponseEntity.status(HttpStatus.ACCEPTED).body(solString);
	  }
	  @GetMapping("getoperation/{id}")
	  public Optional<input> getOperation(@PathVariable("Id") int Id) {
		  System.out.println("inside controller");
		  Optional<input> input=null;
		input=  this.service.getOperation(Id);
		return input;
		  
	  }
}

package com.jpa.test.userRepo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.jpa.test.entities.input;
@Component
public interface userRepo extends CrudRepository<input, Integer>  {

}

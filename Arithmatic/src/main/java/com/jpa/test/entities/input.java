package com.jpa.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class input {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int x;
	private int y;
	private String operation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	@Override
	public String toString() {
		return "input [id=" + id + ", x=" + x + ", y=" + y + ", operation=" + operation + "]";
	}
	public input(int id, int x, int y, String operation) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.operation = operation;
	}
	public input() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}

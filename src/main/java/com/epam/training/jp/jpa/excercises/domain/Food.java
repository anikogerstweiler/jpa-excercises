package com.epam.training.jp.jpa.excercises.domain;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Food {

	@Id
	@GeneratedValue(strategy = AUTO)
	private int id;
	
	private String name;
	
	private int price;
	
	private int calories;
	
	private boolean isVegan;
	
	public String getName() {	
		return this.name;
	}

	public int getId() {	
		return this.id;
	}

	public int getCalories() {	
		return this.calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isVegan() {
		return isVegan;
	}

	public void setVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

}

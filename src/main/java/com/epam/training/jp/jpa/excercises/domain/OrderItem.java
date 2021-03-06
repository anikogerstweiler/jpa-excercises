package com.epam.training.jp.jpa.excercises.domain;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderItem {

	@Id
	@GeneratedValue(strategy = AUTO)
	private int id;
	
	private int quantity;
	
	@OneToOne(cascade = PERSIST)
	private Food food;
	
	public OrderItem() { }
	
	public OrderItem(Food f, Integer integer) {
		this.food = f;
		this.quantity = integer;
	}

	public Food getFood() {
		return food;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setFood(Food food) {
		this.food = food;
	}
}

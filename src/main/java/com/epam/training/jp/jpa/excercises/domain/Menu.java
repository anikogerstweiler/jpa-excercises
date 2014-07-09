package com.epam.training.jp.jpa.excercises.domain;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.TemporalType.DATE;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class Menu {
	
	@Id
	@GeneratedValue(strategy = AUTO)
	private int id;

	@Temporal(DATE)
	private Date fromDate;
	
	@Temporal(DATE)
	private Date toDate;
	
	@OneToMany(fetch = EAGER, cascade = PERSIST)
	private List<Food> foods;
	
	public Menu() {	}
	
	public Menu(int id, Date fromDate, Date toDate) {
		this.id = id;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
}

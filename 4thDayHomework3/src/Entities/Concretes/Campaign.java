package Entities.Concretes;

import Entities.Abstracts.Entity;

public class Campaign implements Entity{

	
	
	private int id ;
	private String name;
	private float discount;
	
	public Campaign () {}

	public Campaign (int id, String name, float discount) {
		this.id=id;
		this.name=name;
		this.discount =discount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getDiscount() {
		return discount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}
}

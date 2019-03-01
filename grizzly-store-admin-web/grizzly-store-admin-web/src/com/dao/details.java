package com.dao;

public class details {

	int id,price;
	String category,name,desciption;
	details()
	{
		id=0;
		price=0;
		category="";
		name="";
		desciption="";
	}
	public details(int id,String category,String name,String desciption,int price)
	{
		this.id=id;
		this.category=category;
		this.name=name;
		this.desciption=desciption;
		this.price=price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getdesciption() {
		return desciption;
	}
	public void setdesciption(String desciption) {
		this.desciption = desciption;
	}
	
}

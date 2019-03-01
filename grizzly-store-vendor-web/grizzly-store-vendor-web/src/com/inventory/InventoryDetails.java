package com.inventory;

public class InventoryDetails {
	int stock,req,buffer,pending;
	float price,rating;
	String name,id;
	
	
	public InventoryDetails(String name ,String id ,int stock ,int req  ,int buffer ,float price ,int pending  , float rating ) {
		super();
		this.stock = stock;
		this.req = req;
		this.buffer = buffer;
		this.pending = pending;
		this.price = price;
		this.rating = rating;
		this.name = name;
		this.id = id;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getReq() {
		return req;
	}
	public void setReq(int req) {
		this.req = req;
	}
	public int getBuffer() {
		return buffer;
	}
	public void setBuffer(int buffer) {
		this.buffer = buffer;
	}
	public int getPending() {
		return pending;
	}
	public void setPending(int pending) {
		this.pending = pending;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}

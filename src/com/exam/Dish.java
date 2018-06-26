package com.exam;

public class Dish {
	int id;
	int cost;
	int kcal;
	String name;
	
	public Dish(){
		
	}
	public Dish(int id, String name, int cost, int kcal){
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.kcal = kcal;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setCost(int cost){
		this.cost = cost;
	}
	public void setKcal(int kcal){
		this.kcal = kcal;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getCost(){
		return cost;
	}
	public int getKcal(){
		return kcal;
	}
	
	
	

}

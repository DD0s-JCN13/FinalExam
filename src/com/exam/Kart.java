package com.exam;

public class Kart {
	String name;
	int nums;
	int costs;
	int kcals;
	
	public Kart(){
		
	}
	public Kart(String name, int nums, int costs, int kcals){
		this.name = name;
		this.nums = nums;
		this.costs = costs;
		this.kcals = kcals;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNums() {
		return nums;
	}
	public void setNums(int nums) {
		this.nums = nums;
	}
	public int getCosts() {
		return costs;
	}
	public void setCosts(int costs) {
		this.costs = costs;
	}
	public int getKcals() {
		return kcals;
	}
	public void setKcals(int kcals) {
		this.kcals = kcals;
	}

}

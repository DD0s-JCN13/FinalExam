package com.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	List<Dish> dishes = new ArrayList<>();
	List<Kart> karts = new ArrayList<>();
	boolean check = true;
	boolean addkart = true;
	boolean askcount = false;
	int kcals = 0;
	int costs = 0;
	public Main(){
		
	}
	public void on(){
		Scanner sc = new Scanner(System.in);
		while(check){
			while(addkart){
				for(int i=0; i<dishes.size();i++){
					Dish d = dishes.get(i);
					System.out.println((i+1)+") "+d.getName());
				}
				System.out.println("0) 結算");
				System.out.println("q) 離開");
				System.out.println("請輸入餐點：");
				String input = sc.nextLine();
				switch(input){
				case "1":
				case "2":
				case "3":
				case "4":
				case "5":
				case "6":
				case "7":
					int tmp = Integer.parseInt(input);
					Dish d = dishes.get(tmp-1);
					String name = d.getName();
					int kcals = d.getKcal();
					int costs = d.getCost();
					do {
						askcount = true;
						System.out.println("請輸入數量：");
						try {
							String in = sc.nextLine();
							int nums = Integer.parseInt(in);
							kcals = kcals * nums;
							costs = costs * nums;
							karts.add(new Kart(name, nums, costs, kcals));
							System.out.println("目前餐點：");
							for (int i = 0; i < karts.size(); i++) {
								Kart k = karts.get(i);
								System.out.println((i + 1) + "." + k.getName() + k.getNums() + "份");
							}
							System.out.println("=============");
							askcount = false;
						} catch (NumberFormatException e) {
							// TODO Auto-generated catch block
							System.out.println("[數量錯誤]");
							askcount = true;
						} 
					} while (askcount);
					break;
				case "0":
					System.out.println("目前餐點：");
					int total = 0;
					int totkcal = 0;
					for(int i=0;i<karts.size();i++){
						Kart k = karts.get(i);
						System.out.println((i+1)+"."+k.getName()+k.getNums()+"份");
						total = total + k.getCosts();
						totkcal = totkcal + k.getKcals();
					}
					System.out.println("合計： "+ total+"元");
					if(totkcal>=1200){
						System.out.println("高熱量餐點");
					}
					addkart = false;
					check = false;
					break;
				case "q":
					check = false;
					addkart = false;
					break;
				default:
					System.out.println("[無此餐點]");
					break;
				}
			}
		}
	}
}


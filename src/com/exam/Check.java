package com.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Check {
	public static void main(String[] args){
		Main m = new Main();
		FileReader fr;
		try {
			fr = new FileReader("menu.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			while(line!=null){
				try{
					String[] token = line.split(",");
					int id = Integer.parseInt(token[0]);
					String name = token[1];
					int cost = Integer.parseInt(token[2]);
					int kcal = Integer.parseInt(token[3]);
					m.dishes.add(new Dish(id,name,cost,kcal));
				}catch(NumberFormatException e){
					e.printStackTrace();
				}
				line = in.readLine();
			}
			m.on();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

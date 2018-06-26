package com.exam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Check {
	public static void main(String[] args){
		Main m = new Main();
		FileInputStream fis;
		try {
			fis = new FileInputStream("menu.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			while(line!=null){
				String[] token = line.split(",");
				try{
					int id = Integer.parseInt(token[0]);
					String name = token[1];
					int cost = Integer.parseInt(token[2]);
					int kcal = Integer.parseInt(token[3]);
					m.dishes.add(new Dish(id,name,cost,kcal));
				}catch(NumberFormatException e){
					e.printStackTrace();
				}
				line = in.readLine();
				m.on();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

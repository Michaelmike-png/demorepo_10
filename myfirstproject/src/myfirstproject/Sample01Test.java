package myfirstproject;

import java.util.Scanner;

public class Sample01Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a color");
		String color = sc.next();
		color=color.toLowerCase();
		sc.close();
		
		if(color.equals("red") || color.equals("green") ||color.equals("yellow")) {
			
			switch(color) {
			case "red" :System.out.println("STOP");
				break;
			case "yellow" : System.out.println("SLOW DOWN");
				break;
			case "green" : System.out.println("GO");
				break;
		
			}
		}
		else {
			System.out.println("Invalid Color");
		}
	
	}

	}
	

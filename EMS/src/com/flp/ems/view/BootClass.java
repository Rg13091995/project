package com.flp.ems.view;

import java.util.Scanner;

public class BootClass {
	public static void main(string[] args)
	{
		System.out.println("1.Addemployee",2."Modifyemployee",3."Removeemployee",4."Searchemployee",5."getAllemployee")
		System.out.println("Enter menu");
		Scanner in=new Scanner(Scanner.in);
		int a=in.nextInt();
		UserInteraction u=new UserInteraction();
		menuSelection(a,u);
	}
	public static void  menuSelection(int a,UserInteraction u)
	{
		switch(a)
		{
		case 1:
			u.Addemployee();
			break;
		case 2:
			u.Modifyemployee();
			break;
		case 3:
			u.Removeemployee();
			break;
		case 4:
			u.Searchemployee();
			break;
		case 5:
		u.getAllemployee();
		break;
		default:
			System.out.println("enter valid number");	
			break;
			}
	}}
	
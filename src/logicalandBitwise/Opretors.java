package logicalandBitwise;

import java.util.Scanner;

public class Opretors {
public static void main(String[] args) {
		
		Scanner scc = new Scanner(System.in); // Scanner Class Object To get input from user.
		
		System.out.println("Type two Number below to check the condition. ");
		
		int getInput1=scc.nextInt(); // get input in variable getInput1
		
		int getInput2=scc.nextInt(); // get input in variable getInput2
		
		System.out.println("\n"); // just to print enter!
		
		System.out.println("LOGICAL && dosent check the second condition if first condition is false");
		
		System.out.println(" 1. If Num1<Num2 && Num1<Num2 with LOGICAL && so output :" + " " + (getInput1<getInput2&&getInput1<getInput2));
		if(getInput1<getInput2&getInput1<getInput2)
		{System.out.println("both condition checked");}
		else {System.out.println("Only First condition checked");}// if Conditions.
		
		System.out.println("\n");
		System.out.println("2 If Num1>Num2 && Num1<Num2 with LOGICAL && so output : " + " " + (getInput1>getInput2&&getInput1<getInput2));
		if(getInput1>getInput2&getInput1<getInput2)
		{System.out.println("both condition checked");}
		else {System.out.println("Only First condition checked");}// if Conditions.
		
		System.out.println("\n");
		System.out.println("3 If Num1>Num2 && Num1>Num2 with LOGICAL && so output : " + " " + (getInput1>getInput2&&getInput1>getInput2));
		if(getInput1>getInput2&getInput1>getInput2)
		{System.out.println("both condition checked");}
		else {System.out.println("Only First condition checked");}// if Conditions.
		
		System.out.println("\n");
		System.out.println("4 If Num1<Num2 && Num1>Num2 with LOGICAL && so output : " + " " + (getInput1<getInput2&&getInput1>getInput2));
		if(getInput1<getInput2&getInput1>getInput2)
		{System.out.println("both condition checked");}
		else {System.out.println("Only First condition checked");}// if Conditions.
		
System.out.println("\n");
		
		System.out.println("Bitwise & checks both the conditions wether first condition is true or false");
		
		System.out.println(" 1. If Num1<Num2 & Num1<Num2 with Bitwise & so output :" + " " + (getInput1<getInput2&getInput1<getInput2) );
		if(getInput1<getInput2&getInput1<getInput2)
		{System.out.println("both condition checked");}
		else {System.out.println("Still Both condition checked");}// if Conditions.
		
		System.out.println("\n");
		System.out.println("2 If Num1>Num2 & Num1<Num2 with Bitwise & so output : " + " " + (getInput1>getInput2&getInput1<getInput2));
		if(getInput1>getInput2&getInput1<getInput2)
		{System.out.println("both condition checked");}
		else {System.out.println("Still Both condition checked");}// if Conditions.
		
		System.out.println("\n");
		System.out.println("3 If Num1>Num2 & Num1>Num2 with Bitwise & so output : " + " " + (getInput1>getInput2&getInput1>getInput2));
		if(getInput1>getInput2&getInput1>getInput2)
		{System.out.println("both condition checked");}
		else {System.out.println("Still Both condition checked");}// if Conditions.
		
		System.out.println("\n");
		System.out.println("4 If Num1<Num2 & Num1>Num2 with Bitwise & so output : " + " " + (getInput1<getInput2&getInput1>getInput2));
		if(getInput1<getInput2&getInput1>getInput2)
		{System.out.println("both condition checked");}
		else {System.out.println("Still Both condition checked");}// if Conditions.
		
	}


}

package sample;

import java.util.Scanner;

public class StringPanlindrome {

	public static void main(String[] args) {

		System.out.println("Enter the string");

		Scanner sc1= new Scanner(System.in);

		String userInput=sc1.next();

		//System.out.println(userInput.length());

		String reverse=new StringBuffer(userInput).reverse().toString();

		System.out.println("UserInput------------->" + userInput);
		System.out.println("Reverse of userInput-->" + reverse);	

		if(userInput.equalsIgnoreCase(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}
}

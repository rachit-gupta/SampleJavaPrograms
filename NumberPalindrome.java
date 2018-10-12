package sample;

import java.util.Scanner;

public class NumberPalindrome
{
	public static void main(String[] args) {

		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Number");

		int userInput=sc1.nextInt();
		int userInputCopy=userInput;

		int remainder;
		int quotient;
		int reverseNumber=0;

		while(userInput!=0)
		{
			remainder=userInput%10;
			quotient=userInput/10;
			reverseNumber=(reverseNumber*10)+remainder;
			userInput=quotient;
		}

		if(reverseNumber==userInputCopy)

		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}

//package sample;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {


		Scanner sc1=new Scanner(System.in);

		System.out.println("Enter the From number");
		int userInput=sc1.nextInt();

		//System.out.println("Enter the From number");
		//int userInputFrom=sc1.nextInt();

		System.out.println("Enter the To number");
		int userInputTo=sc1.nextInt();

		int userInputCopy=userInput;
		int amstrongNumber=0;

		int remainder;
		int quotient;


		for(int i=userInputTo;i<=userInput;i++)

		{
			while(userInput!=0)
			{
				remainder=userInput%10;
				quotient=userInput/10;
				userInput=quotient;

				amstrongNumber=amstrongNumber+(remainder*remainder*remainder);
			}

		}

		if(amstrongNumber==userInputCopy)

		{
			System.out.println("Amstrong");

		}
		else
		{
			System.out.println("Not Amstrong");
		}

	}

}

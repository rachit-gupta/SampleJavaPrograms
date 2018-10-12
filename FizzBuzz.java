package sample;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

		System.out.println("userInput 1");

		int userInput1=sc1.nextInt();

		System.out.println("userInput 2");

		int userInput2=sc1.nextInt();		


		for(int i=userInput1;i<=userInput2;i++)
		{
			//System.out.println(i);

			if(i%15==0)
			{
				System.out.print("\t"+"FIZZBUZZ");
			}
			else if(i%5==0)
			{
				System.out.print("\t"+"BUZZ");
			}
			else if(i%3==0)
			{
				System.out.print("\t"+"FIZZ");
			}
			else
			{
				System.out.print("\t"+i);	
			}

		}

	}

}

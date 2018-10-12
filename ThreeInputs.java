package sample;

import java.util.Scanner;

public class ThreeInputs {

	public static void main(String[] args)

	{
		Scanner sc1= new Scanner(System.in);

		System.out.println("Enter the value 1");

		int inputNumber1=sc1.nextInt();

		System.out.println("Enter the value 2");

		int inputNumber2=sc1.nextInt();


		System.out.println("Please enter the action you want to perform... 1. Add 2. Subtract 3.Multiplication 4. Division");
		int userInput=sc1.nextInt();

		//System.out.println("you have choosen option "+userInput);

		switch(userInput)
		{
		case 1: System.out.println("you have choosen option "+userInput+":Addition "+(inputNumber1+inputNumber2));
		break;

		case 2: System.out.println(inputNumber1-inputNumber2);
		break;

		case 3: System.out.println(inputNumber1*inputNumber2);
		break;

		case 4: System.out.println(inputNumber1/inputNumber2);
		break;

		default:System.out.println("Invalid Input");
		break;

		}
	}

}

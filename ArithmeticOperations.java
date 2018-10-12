package sample;

import java.util.Scanner;

public class ArithmeticOperations {


	public static void main(String[] args)

	{
		Scanner sc1= new Scanner(System.in);

		System.out.println("Enter the Value");

		int inputNumber1=sc1.nextInt();

		System.out.println("Enter the value");

		int inputNumber2=sc1.nextInt();


		System.out.println("Please enter the action you want to perform... 1. Add 2. Subtract 3.Multiply 4. Divide");
		String userInput=sc1.next();

		//System.out.println("you have choosen option "+userInput);

		switch(userInput)
		{
		case "Add": System.out.println("Addition of "+inputNumber1+"  +  "+inputNumber2 +"is "+ (inputNumber1+inputNumber2));
		break;

		case "Subtract": System.out.println("Subtraction of "+inputNumber1+"  -  "+inputNumber2 +"  is "+ (inputNumber1-inputNumber2));
		break;

		case "Multiply": System.out.println("Multiplication of of "+inputNumber1+"  *  "+inputNumber2 +"is "+ (inputNumber1*inputNumber2));
		break;

		case "Divide": System.out.println("Division of "+inputNumber1+"  /  "+inputNumber2 +"is "+ (inputNumber1/inputNumber2));
		break;

		default:System.out.println("Invalid Operation");
		break;

		}
	}

}
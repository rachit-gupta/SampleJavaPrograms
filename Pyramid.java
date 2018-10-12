package sample;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		Scanner sc1= new Scanner(System.in);

		int userInput=sc1.nextInt();
		System.out.println("");

		for(int i=1; i<= userInput ;i++){

			for(int j=0; j < i; j++)
			{
				System.out.print("*");
			}

			System.out.println("");
		}
	}
}

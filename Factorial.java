package sample;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int fact=1;

		Scanner sc1 = new Scanner(System.in);

		int number=sc1.nextInt();

		for(int i=1;i<=number;i++)

		{
			fact=fact*i;
			//System.out.println(fact);
		}

		System.out.println(fact);
	}
}

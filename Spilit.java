package sample;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Spilit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1= new Scanner(System.in);

		String str=sc1.next();
		String [] arrOfStr = str.split("@", 2);

		for(String w:arrOfStr)
		{
			System.out.println(w);
		}

	}

}

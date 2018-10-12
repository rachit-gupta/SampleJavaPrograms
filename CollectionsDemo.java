package sample;

import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args)
	{
		ArrayList<String> alist = new ArrayList<>();

		alist.add("Manivannan");
		alist.add("Padmavathy");
		alist.add("Dinesh");
		alist.add("Divya");
		alist.add("Gokul"); 
		
		System.out.println(alist);
		
		System.out.println("-------------");
		
		alist.add(4,"Go~Cool");
		
		System.out.println(alist);
	}
}
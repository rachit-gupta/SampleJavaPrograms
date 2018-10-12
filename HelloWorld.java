package sample;

public class HelloWorld {

	public void HelloWorld1() {
		System.out.println("Initial");
	}

	public HelloWorld()
	{
		System.out.println("Calling constructor");
	}

	public static void main(String[] args)
	{
		HelloWorld obj1= new HelloWorld();
		//obj1.HelloWorld1();
	}
}
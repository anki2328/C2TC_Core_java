package Default;

public class StaticDemo {
	
	int a=10;
	int b;
	static int c=25;
	void func1()
	{
		System.out.println("The value are");
		System.out.println("a value is"+a);
		System.out.println("b value is"+b);
		System.out.println("c value is"+c);
	}
	static void fun2()
	{
		int d=19;
		System.out.println("d value is"+d);
		System.out.println("c value is "+c);
		
	}
	
	static
	{
		System.out.println("hi am in static block");
	}
	public static void main(String[] args) {
		System.out.println("c value is + static");
	}

}


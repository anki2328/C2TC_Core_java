package com;
class base
{
	static int i;
	static void ml()
	{
		i=10;
		System.out.println("Hi in a base class");
	}
	
}
class derived1 from base
{
	int j;
	void m2()
	{
		System.out.println("Hi in a derived class");
		
		
	}

} 

    class Derived2 extends base

	int k;
	void m3()
	{
		System.out.println("hi in a derived class");
	}
	class Derived3 extends base
	{
		int l;
		void m4()
		{
			System.out.println("hi in a derived class");
		}
	}
	class Derived4 extends base
	{
		int m;
		void m5()
		{
			System.out.println("hi in a derived class");
		}
	}
	public class hirarchialInheritanceDemo {
		public static void main(string[] args)
		{
			Base.m1();
			obj.m2();
			Derived2 obj1=new Derived2();
			obj1.m1();
			obj1.m3();
			Derived4 obj2=new Derived4();
			obj2.m1();
			obj2.m2();
			obj2.m5();
		}
	}
}

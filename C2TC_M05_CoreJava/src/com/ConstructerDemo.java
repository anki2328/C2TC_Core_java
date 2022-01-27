package com;

class Student
{
int id;
String name;
String course;
String email;
  




public void display()
{
	System.out.println("student information:");
    System.out.println(id+" "+name+" "+course+" "+email);}
}


public class ConstructerDemo {

	public static void main(String[] args) {
	Student s1=new Student();
    s1.id=2;
    s1.name="Ankita";
    s1.course="Java";
    s1.email="ankita123@gmail.com";
    s1.display();
	}
	

}

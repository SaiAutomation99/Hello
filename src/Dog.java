import java.util.Scanner;

public class Dog
{
	
   String breed="white";
   int age;
   String color;



	public static void main(String[] args) {
		Dog h=new Dog();   //object creation
		System.out.println(h.breed);
		System.out.println(h.age);
		System.out.println(h.color);
		Scanner sc=new Scanner(System.in);
	String name1=sc.next();	
	System.out.println("hello");
	}

}


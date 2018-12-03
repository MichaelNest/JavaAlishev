import java.util.Scanner;

public class CursAlish2 {
	
	public static void main(String[] args) {
		Pers body1 = new Pers();
		body1.setNameAge("Pasha", 37);
		System.out.println();
		System.out.println("My name is: " + body1.name);
		System.out.println("My age is: " + body1.age + " years.");
		System.out.println();
		
		Pers body2 = new Pers();
		body2.name = "Vova";
		body2.age = 25;
		System.out.println();
		System.out.println("My name is: " + body2.name);
		System.out.println("My age is: " + body2.age + " years.");
		System.out.println();
		
		Pers1 body3 = new Pers1();
		body3.name1 = "Pafnutiy";
		body3.age1 = 33;
		body3.sayHello();
		body3.speak();
		int p3 = body3.pencAge();
		System.out.println(p3 + " years to pensiy, but I won't live to pensiya.");
		System.out.println();
		Pers1 body4 = new Pers1();
		body4.name1 = "Dasha";
		body4.age1 = 18;
		body4.sayHello();
		body4.speak();
		int p4 = body4.pencAge();
		System.out.println(p4 + " years to pensiy, but I won't live to pensiya.");
		System.out.println();
		
		
		
	}
}

class Pers {
	String name;
	int age;
	void setNameAge (String uname, int uage) {
		name = uname;
	    age = uage;}

}

class Pers1 {
	String name1;
	int age1;
	
	int pencAge() {
		int page = 65-age1;
	    return page;}
	
	void sayHello() {
		System.out.println();
		for (int i=0; i<3; i++) {
	System.out.println("Hello my diar fucking Frends!!!"); }
	System.out.println();}
	void speak() {
		System.out.println();
		System.out.println("My name is: " + name1);
	    System.out.println("My age is: "+ age1 + " years old. ");
		System.out.println();}
	
}

































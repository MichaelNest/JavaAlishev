import java.util.Scanner;

public class CursAlish4 {
	
	public static void main(String[] args) {
	Pers body1 = new Pers();
	body1.setName("Pablo");
	body1.setAge(27);
	Pers body2 = new Pers("Emilio");
	Pers body3 = new Pers("Escobar", 33);
	System.out.println(" ");	
	System.out.println(body1.getName() + " " + body2.getName() + " " + body3.getName());
	Pers body4 = new Pers();
	
	Pers.a = 22;
	//Pers.a = 22;
	//Pers.setA(22);
	System.out.println(" ");
	System.out.println(body3.a);
    System.out.println(" ");	
	}
	
	
}
	class Pers {
		public static int a;
		private String name;
		private int age;
		
		//public void setA(int a) {
		//this.a = a;}
		
		//public int getA() {
		//return a;}
		
		public Pers() {
			System.out.println(" ");
			System.out.println("Salut from First Constructor!! ");
		    System.out.println(" "); 
			this.name = "Loh!!";
			this.age = 11;
			System.out.println("Your nane is: " + name + " Your age is: " + age);
			System.out.println(" ");}
			
		public Pers(String name) {
		System.out.println("Salut from Second Constructor!! ");
		System.out.println(" ");
		this.name = name; }
		
		public Pers(String name, int age) {
			System.out.println("Salut from Third Constructor!! ");
		    this.name = name;
		    this.age = age; }
			
			
		public void setName(String name) {
		this.name = name;}
		public void setAge(int age) {
		this.age = age;}
		
		public String getName() {
		return name;}
		public int getAge() {
		return age; }
		
		
	}		





















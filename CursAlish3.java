import java.util.Scanner;

public class CursAlish3 {
	
	public static void main(String[] args) {
	
	Pers body1 = new Pers();
	
	body1.setName("Vasia");
	body1.setAge(22);
	body1.setGenderLng("man", 15);
	System.out.println();
	System.out.println(" Output getters:  " + body1.getName() + " and " + body1.getAge());
	body1.speak();
	
	Human hum1 = new Human();
	hum1.setName("Petya");
	hum1.setAge(55);
	hum1.getInfo();



	
	}
	
	static class Human {
		int age;
		String name;
		public void setAge(int age) {
		this.age = age;}
		public void setName(String name) {
		this.name = name;}
		public String getName(){
		return name;}
		public int getAge() {
		return age;}
		public void getInfo() {
			System.out.println(" ");
		System.out.println(name + ", " + age);}
		
		
	}
	
	static class Pers {
		
		private String name;
		private int age;
		private String gender;
		private int lng;
		
		public void setGenderLng(String workGender, int workLng) {
			gender = workGender;
		lng = workLng; }
		
		
	    public void setName(String workName) {
			if (workName.isEmpty()) {
				System.out.println(" ");
			System.out.println("Dolboyob - enter norm name!! ");}
			else {name = workName;}
		}
		public String getName() {
			
		return name; }
		
		public void setAge(int workAge) {
			if(workAge < 0) {
				System.out.println(" ");
				System.out.println(" Pridurok - enter norm age!!");
			}
			else {age = workAge;}}
		
		public int getAge() {
			
		return age;}
		
		
		void speak() {
			System.out.println(" ");
			System.out.println(" Your name is " + name);
			System.out.println(" ");
			System.out.println(" Your age is  " + age + " years.");
			System.out.println(" ");
			System.out.println("Your gender is:  " + gender);
			System.out.println(" ");
			System.out.println("Long your penis is: " + lng);
			
		}
		
		
		
	}
	
	
}
		





















import java.util.Scanner;

import java.io.IOException;

public class MCalc1 {
	
	public static void main(String[] args) {
		//Упражнение 1
        //Напишите метод, toUSD(int rur, double course), переводящий рубли в доллары по заданному курсу. 
		//Вызовите его дважды в методе main() c любыми параметрами, результат напечатейте в консоль.

	 System.out.println();
     Count dollar = new Count();	 
	 System.out.println("Select type of operation: click on : D or G "); 
	 Scanner sc1 = new Scanner(System.in);
	 String ch1 = sc1.nextLine();
	 int iT = Integer.parseInt(ch1);
     System.out.println(iT);
	 
	if (iT == "doll") {
	     dollar.toUSD();}
	 else if (ch1 == "griv") {
		 dollar.toGRN();}
	 else {
		System.out.println("You enter another click. Select type of operation: click on : D or G ");  
		
	 }		 
			
	}

	
	
	 class Count {
		static void toUSD() {
		
		Scanner sc2 = new Scanner(System.in);  
		System.out.println();
		System.out.println("Enter course of Dollar: ");
		double doll = sc2.nextDouble();
		
		System.out.println("Enter your summ Grivens: ");	
		int grnsum = sc2.nextInt();
		
		double num = grnsum/doll;
		System.out.println(" Your summa is: " + num + " Dollars"); }
		
		static void toGRN() {
			Scanner sc2 = new Scanner(System.in);  
		System.out.println();
		System.out.println("Enter course of Dollar: ");
		double doll = sc2.nextDouble();
		
		System.out.println("Enter your summ Dollars: ");	
		int dollsum = sc2.nextInt();
		
		double num = dollsum*doll;
		System.out.println(" Your summa is: " + num + " Grivens"); 
		}

}	
	


























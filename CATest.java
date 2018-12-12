import java.util.Scanner;

public class CATest {
	
	public static void main(String[] args) {
		
		/*int a = 0;
		while(a<10) {
			a=a+2;
		System.out.println(a);}
		System.out.println();
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter num: ");
		int b = sc1.nextInt();
		System.out.println("Your num is: " + b);
		System.out.println();
		System.out.println("Enter String: ");
		String str = sc2.nextLine();
		System.out.println("Your string is: " + str);
		System.out.println();
		
		
		System.out.println();
		System.out.println("Enter your number: ");
		int ch = sc1.nextInt();
		System.out.println("Enter your stepen: ");
		int st = sc1.nextInt();
		int m = 1;
	    for (int i = 0; i < st; i++) {
		System.out.println(m);
		m = m*ch;}
		System.out.println();
		System.out.println(m);*/
		
		
		//Упражнение 2
        //Объявите две целочисленных переменных, присвойте им любые значения. С помощью оператора if найдите и выведите их максимум.

		/*System.out.println();
		System.out.println("Enter first num: "); 
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		System.out.println("First num is: " + a);
		System.out.println();
		
		System.out.println("Enter second num: ");
		int b = sc1.nextInt();
		System.out.println("Second name is: " + b);
		System.out.println();
		if (a>b) {
		System.out.println("First num is greater then Second num : " + a +" > " + b);}
		else if (a==b) {
		System.out.println("First and second numbers are equal: " + a + " = " + b);}
		else {
		System.out.println("Second num is greater them First num: " + b + " > " + a ); }
		
		
		//Упражнение 3
        //С помощью цикла while выведите все нечетные числа от 1 до 10.
		
		System.out.println();
		System.out.println("Please Enter any number: ");
		Scanner sc1 = new Scanner(System.in);
		int m = 0;
		int n = sc1.nextInt();
		System.out.println();
		System.out.println("Output all chetnye numbers: ");
		System.out.println();
		while(m<=n) {
			System.out.println(m);
		m+=2;}
		System.out.println();
		System.out.println("Output all ne chetnye numbers: ");
		System.out.println();
		int l = 1;
		while(l<=n) {
			System.out.println(l);
		l+=2;}*/
		
		
		//Упражнение 4
        //С помощью цикла for выведите все нечетные числа от 1 до 10.
		/*System.out.println();
		System.out.println("Output all ne chetnye numbers: ");
		System.out.println();
		for(int i = 1; i < 10; i+=2) {
		System.out.println(i);}*/
	
	
	    System.out.println();
		System.out.println(" Your summa is: " + toUSD() + " Dollars");
		System.out.println();
			
			
			
	}
	
	//Упражнение 1
        //Напишите метод, toUSD(int rur, double course), переводящий рубли в доллары по заданному курсу. 
		//Вызовите его дважды в методе main() c любыми параметрами, результат напечатейте в консоль.
		
	static double toUSD() {
		Scanner sc1 = new Scanner(System.in); 
		Scanner sc2 = new Scanner(System.in); 
		
		System.out.println();
		System.out.println("Enter course of Dollar: ");
		double doll = sc1.nextDouble();
		
		System.out.println("Enter your summ Griven: ");	
		int grnsum = sc2.nextInt();
		
		double num = grnsum/doll;
	return num; }
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
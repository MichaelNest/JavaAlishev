import java.util.Scanner;

public class CursAlish1 {
	
	public static void main(String[] args) {
		int n = 10;
		int[] array = new int[5];
		System.out.println();
		System.out.println(array[1]);
		array[0] = 10;
		array[1] = 20;
		for (int i = 2; i < array.length; i++) {
		array[i] = i*10 + 10; }
		for(int i = 0; i < array.length; i++) {
		System.out.println(array[i]); }
		System.out.println();
		
		int[] array1 = {22,33,44,55,66};
		for(int i = 0; i<array1.length; i++) {
		System.out.println("Soderjimoe Array1: " + array1[i]);}
		System.out.println();
		
		String[] str = new String[3];
		str[0] = " Hello Loh!! ";
		str[1] = " Goodbuy Chmo!! ";
		str[2] = " Java the Best!! ";
		System.out.println(str[1] + str[2] + str[0]);
		System.out.println();
		
		for(int i = 0; i < str.length; i++) {
		System.out.println(str[i]); }
		System.out.println();
		
		for(String strng:str) {                                         //operator FOR EACH
		System.out.println(strng);}
		System.out.println();
		
		int[] array2 ={1,2,3,4,5};
		int sum = 0;
		for(int x:array2) {                                             //operator FOR EACH
		sum = sum+x;}
		System.out.println(sum);
		System.out.println();
		
		int[][] matrics = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(matrics[2][2]);
		System.out.println();
		
		int[][] matrics2 = {{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
			                {1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
		                    {1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}} ;
							
			for (int i = 0; i < matrics2.length; i++) {
                 for (int j = 0; j < matrics2[i].length; j++) {
				 System.out.print(matrics2[i][j] + " ");}
			System.out.println();}
			System.out.println();
            System.out.println("EveryThing is good!!");
			
							
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
import java.util.Scanner;

public class Scannerinput {

	public static void main(String[] args) {
	
		Scanner Sc = new Scanner(System.in);
		System.out.println("integer input");
		int x = Sc.nextInt();
		System.out.printf("value of x; %d\n" ,x);
		System.out.println("Float input");
		float f = Sc.nextFloat();
		System.out.println("value of f; " +f);
		System.out.println("double input");
		double d = Sc.nextDouble();
		System.out.println("value of d; " +d);
		Sc.nextLine();
		System.out.println("string input");
		String s = Sc.nextLine();
		System.out.println("value of s;" +s);
		Sc.close();
		 
		int a= 20, b = 30;
		System.out.println(a+b+"the value is");
		System.out.println(a+"the value is"+b);
		System.out.println("the value is"+a+b);
		System.out.println("the value is"+(a+b));
		

	}
}


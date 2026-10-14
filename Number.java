package Chapter1;
import java.util.Scanner;                                              
public class Number {
	public static void main(String [] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter Value x :");
	  int x = sc.nextInt();
	  System.out.println("your entered value is x:"+x);
	  sc.close();
	}
}

package Chapter1;

import java.util.Scanner;

public class ScannerTest{
  public static void main(String args[])throws Exception
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Your rollno And Name:");
	  int rollno=sc.nextInt();
	  String name=sc.next();
	  System.out.println("Roll no:"+rollno+" Name:"+name);
	  sc.close();
  }
}

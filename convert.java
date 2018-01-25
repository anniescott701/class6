package class6;

import java.util.Scanner;

public class convert {
	public static void main(String args[]){  
		   Scanner sc=new Scanner(System.in);  
		     
		   System.out.println("Enter the values:");
			String input1 = sc.next();
			String input2 = sc.next();
			
			int a = Integer.valueOf(input1);
			int b = Integer.valueOf(input2);
			
			if(a>b)
			{
	System.out.print("a is maximum:"+a);
		}
			else
			{
				System.out.println("b is maximum"+b);
			}
}
}

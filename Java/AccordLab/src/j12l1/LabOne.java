package j12l1;

import java.util.Scanner;

public class LabOne {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int a=sc.nextInt();
		System.out.println("Enter the values : ");
		int c=0;
		for(int i=0;i<a;i++) {
			c=sc.nextInt();
		}
		
		System.out.println(c);
	}

}

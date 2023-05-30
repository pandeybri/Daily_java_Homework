//Q. wap to display no from 1 to 100.
package core_java_program;

import java.util.Scanner;

public class For_demo {

	public static void main(String[] args) {
//		int i;
//		for(i=1;i<=100;i++) {
//			System.out.print(i+"\t");
//			if(i%10==0) {
//				System.out.println("\n");
//			}
//		}
		
		
//		Q. wap to accept min and max no. from the user and display the range
		Scanner sc = new Scanner(System.in);
		int j,min, max;
		
		System.out.println("enter min number");
		min = sc.nextInt();
		System.out.println("enter max value");
		max = sc.nextInt();
		
		for(j=min;j<=max;j++) {
			System.out.println(j);
		}

	}

}

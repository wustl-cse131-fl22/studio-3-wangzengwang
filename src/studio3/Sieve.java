package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the input number?");
		int n = in.nextInt();
		int[] anArray = new int[n-1];
		for (int i = 0; i < n; i++)
		{
			anArray[i] = i + 2;
			System.out.println(anArray[i]);
			for (int j = i + (i + 2); j < n; j = i + 2)
			{
				anArray[j] = 1;
				System.out.println((j + 2));
				
			}
		}
		
		
	}

}

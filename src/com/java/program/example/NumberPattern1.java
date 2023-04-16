package com.java.program.example;

import java.util.Scanner;

public class NumberPattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			// Loop to iterate over each column of the ith row
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}

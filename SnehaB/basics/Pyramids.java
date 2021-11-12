package com.ts;

public class Pyramids {

	public static void main(String[] args) {
		

		// 17.Print half pyramid

		String a = " * ";

		for (int i = 1; i <= 5; i++) {// outer loop

			for (int j = i; j >= 1; j--) { // inner loop

				System.out.print(a + "   ");

			}
			System.out.println();

		}
		System.out.println("---------------------------------");

		// 18.Print half pyramid using numbers
		int c = 5;

		for (int d = 1; d <= c; d++) { // outer loop

			for (int d2 = 1; d2 <= d; d2++) { // inner loop

				System.out.print(d2 + "\t");

			}

			System.out.println();

		}

		System.out.println("---------------------------------");

		// 19.Print half pyramid using numbers

		char alph = 'E';

		for (char letter = 'A'; letter <= alph; letter++) { // outer loop

			for (char letter2 = letter; letter2 >= 'A'; letter2--) { // inner loop

				System.out.print(letter + "   ");

			}

			System.out.println();
		}
		System.out.println("---------------------------------");

		// 20.Inverted half pyramid

		int r = 5;

		for (int i = r; i >= 1; --i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();

		}
		System.out.println("---------------------------------");

		// 21.Inverted half pyramid using Numbers

		int s = 5;
		for (int i = s; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();

		}
		System.out.println("---------------------------------");

		// 22.print full pyramid using *

		int number = 5, z = 0;

	    for (int i = 1; i <= number; ++i, z = 0) {
	      for (int space = 1; space <= number - i; ++space) {
	        System.out.print("  ");
	      }

	      while (z != 2 * i - 1) {
	        System.out.print("* ");
	        ++z;
	      }

	      System.out.println();
	    }
		System.out.println("---------------------------------");

	}

}

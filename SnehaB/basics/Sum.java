package com.ts;

public class Sum {

	public static void main(String[] args) {
		
		// 4. check whether number is even or odd

				int check = 16;

				if ((check % 2) == 0) {

					System.out.println("number is even");

				} else {
					System.out.println("number is odd");
				}


				System.out.println("==========================");


				// 6. find largest among three Numbers

				int i = 5, j = 10, k = 30;

				if (i >= j && i >= k) {

					System.out.println(i + " is largest number");

				} else if (j >= i && j >= k) {

					System.out.println(j + " is largest number");
				} else {

					System.out.println(k + " is largest number");

				}

				System.out.println("==========================");

				
			

				// 8. Find Faction of a number using for loop and while

				int n = 3;
				int temp = 1;

				for (i = 1; i <= n; i++) {

					temp = i * temp;

					System.out.println(temp);

				}
				System.out.println("==========================");

				int x = 1;
				int y = 3;
				int tempr = 1;

				while (x <= y) {

					tempr = x * tempr;
					x++;
					System.out.println(tempr);
				}
				System.out.println("==========================");

				// 9. calculate the sum of natural numbers

				int num = 5, total = 0;

				for (int z = 1; z <= num; z++) {

					total = total + z;
				}

				System.out.println("Total= " + total);

				System.out.println("==========================");

				// 10. Generate Multiplication Table

				int numb = 10;
				for (int z = 1; i <= numb; ++i) {
					System.out.printf("%d * %d = %d \n", numb, z, numb * z);
				}

				System.out.println("==========================");

				// 11.Find GCD of Two numbers

				int num1 = 5, num2 = 10;

				while (num1 != num2) {
					if (num1 > num2)
						num1 = num1 - num2;
					else 
						num2 = num2 - num1;
					
					System.out.printf("GCD of given numbers is: %d \n", num2);
					
				}
				
				System.out.println("==========================");
				// 14.prime numbers

				int chec = 10;
				int rem;
				boolean isPrime = true;

				for (int number = 2; number <= chec / 2; number++) {

					rem = chec % number;
					System.out.println(chec + " Divided by " + number + " gives a remainder " + rem);

					if (rem == 0) {
						isPrime = false;
						break;

					}
				}

				if (isPrime)
					System.out.println(chec + " is a Prime number");
				else
					System.out.println(chec + " is not a Prime number");


			
	}

}

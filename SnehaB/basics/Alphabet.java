package com.ts;

public class Alphabet {

	public static void main(String[] args) {
	
		// 5. check whether an alphabet is vowel or consonant

				char ch = 'E';

				if ((ch == 'a' || ch == 'A') || (ch == 'e' || ch == 'E') || (ch == 'i' || ch == 'I') || (ch == 'o' || ch == 'O')
						|| (ch == 'u' || ch == 'U')) {

					System.out.println("its is VOWEL");

				} else {

					System.out.println("It is CONSONANT");
				}
				
				System.out.println("==========================");
				// 7. check whether a character is alphabet or not

				char cha = 'd';

				if ((cha >= 'A' && cha <= 'Z') || (cha >= 'a' && cha <= 'z')) {

					System.out.println(cha + " is alphabet");

				} else {

					System.out.println(cha + " is not alphabet");
				}
				
				System.out.println("==========================");
				// 13.Display Alphabets from a to z using loops

				

				for (char alpha = 'a'; alpha <= 'z'; alpha++) {

					System.out.println(alpha + "");

				}

	}

}

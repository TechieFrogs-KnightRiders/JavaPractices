package practice;

public class VowelOrConstent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'i';
		switch(ch){
			case 'a':
			case 'i':
			case 'e':
			case 'o':
			case 'u':
				System.out.println (ch +" : Alphabet is vowel");
				break;
				default:
					System.out.println(ch +":  Alphabet is constent");
		}
		

	}

}

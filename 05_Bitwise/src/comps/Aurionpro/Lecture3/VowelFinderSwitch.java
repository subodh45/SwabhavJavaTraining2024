package comps.Aurionpro.Lecture3;

public class VowelFinderSwitch {

	public static void main(String[] args) {

		char ch = 'b';

		switch (ch) {
		case 'a':
			System.out.println("Its an vowel");
			break;
		case 'e':
			System.out.println("Its an vowel");
			break;
		case 'i':
			System.out.println("Its an vowel");
			break;
		case 'o':
			System.out.println("Its an vowel");
			break;
		case 'u':
			System.out.println("Its an vowel");
			break;

		default:
			System.out.println("not an vowel");
		}

		switch (ch) {
		case 'a':		
		case 'e':			
		case 'i':			
		case 'o':		
		case 'u':
			System.out.println("Its an vowel");
			break;

		default:
			System.out.println("not an vowel");
		}
	}

}

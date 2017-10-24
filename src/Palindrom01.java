import java.util.Scanner;

public class Palindrom01 {
	public static String umdrehen(String word) {
		String umgekehrt = new String();

		for (int j = word.length() - 1; j >= 0; j--)
			umgekehrt += word.charAt(j);

		return umgekehrt;
	}

	public static void main(String[] args) {
		System.out.println("Bitte geben sie ein Wort ein");
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		if (word.equals(umdrehen(word))){
			System.out.println("Es handelt sich um ein Palindrom");
		}else{
			System.out.println("Ihr Wort entspricht keinem Palindrom");
		}
		
		

	}
}

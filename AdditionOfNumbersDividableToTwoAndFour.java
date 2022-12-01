import java.util.Scanner;

public class AdditionOfNumbersDividableToTwoAndFour {
	
	public static void main(String[] args) {
		
		int count = 0;
		int countTwos = 0;
		int countFours = 0;
		int enteredNumber;
		double additionOfTwos = 0;
		double additionOfFours = 0;

		Scanner keybInput = new Scanner(System.in);
		
		System.out.print("Sayıyı Girin : ");
		enteredNumber = keybInput.nextInt();
		while (enteredNumber >= 0 && enteredNumber % 2 == 0) {
			if (enteredNumber % 2 == 0) {
				additionOfTwos += enteredNumber;
				countTwos++;
				
			}
			if (enteredNumber % 4 == 0) {
				additionOfFours += enteredNumber;
				countFours++;
			}

			System.out.print("Sayıyı Girin : ");
			enteredNumber = keybInput.nextInt();
		}
				
		System.out.println("İKİYE BÖLÜNEBİLEN SAYILAR TOPLAMI : " + additionOfTwos);
		System.out.println("DÖRTE BÖLÜNEBİLEN SAYILAR TOPLAMI : " + additionOfFours);


	}

}


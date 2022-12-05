import java.util.Scanner;

public class FindMinMax {

    public static void main(String[] args) {
    	
    	int minNumber = 0;
    	int maxNumber = 0;
    	Scanner keybInput = new Scanner(System.in);
    	System.out.print("Kaç tane sayı gireceksiniz : ");
    	int count = keybInput.nextInt();

    	for (int i = 1 ; i <= count ; i++) {
    		System.out.printf("%d. Sayıyı Giriniz : " , i);
    		int enteredNumber = keybInput.nextInt();
    		if (i == 1) {
    			maxNumber = enteredNumber;
    			minNumber = enteredNumber;
    		}
    		if (enteredNumber > maxNumber) {
    			maxNumber = enteredNumber;
    		}
    		if (enteredNumber < minNumber) {
    			minNumber = enteredNumber;
    		}
    	}

    	System.out.printf("Max : %d \n" , maxNumber);
    	System.out.printf("Min : %d \n" , minNumber);

    }
}



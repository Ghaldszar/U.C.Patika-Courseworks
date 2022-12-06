import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {
    	
    	int enteredNumber;
    	
    	Scanner keybInput = new Scanner(System.in);

    	System.out.print("Basamak Sayısını Giriniz : ");
    	enteredNumber = keybInput.nextInt();

    	for (int i = 1 ; i <= enteredNumber ; i++) {
    		for (int j = 1 ; j <= i ; j++ ) {
    			System.out.print(" ");
    		}
    		for (int j = 1 ; j <= ((2 * (enteredNumber - i)) + 1) ; j++ ) {
    			System.out.print("*");
    		}
    		for (int j = 1 ; j <= i ; j++ ) {
    			System.out.print(" ");
    		}
    		System.out.println();

    	}

    }
}



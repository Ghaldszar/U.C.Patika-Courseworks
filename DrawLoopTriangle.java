import java.util.Scanner;

public class DrawLoopTriangle {

    public static void main(String[] args) {
    
    	Scanner keybInput = new Scanner(System.in);
    	
    	System.out.print("Sayı : ");
    	int enteredNumber = keybInput.nextInt();

    	// 3 1 3
    	// 2 3 2
    	// 1 5 1

    	for (int i = 0 ; i < enteredNumber ; i++) {
    		for (int j = 1 ; j <= enteredNumber - i ; j++ ) {
    			System.out.print(" ");
    		}
    		
    		for (int j = 1 ; j <= ((2 * i) + 1) ; j++ ) {
    			System.out.print("*");
    		}
    		for (int j = 1 ; j <= enteredNumber - i ; j++ ) {
    			System.out.print(" ");
    		}
    		System.out.println();
    	}

    }
}



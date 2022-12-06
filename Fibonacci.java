import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
    	
    	int tempNumber01 = 0;
    	int tempNumber02 = 1;
    	//int total = 0;

    	Scanner keybInput = new Scanner(System.in);
    	System.out.print("Eleman Sayısı : ");
    	int enteredNumber = keybInput.nextInt();

    	System.out.print("0  1  ");
    	for (int i = 1 ; i <= enteredNumber - 2 ; i++){
    		int total = tempNumber01 + tempNumber02;
    		tempNumber01 = tempNumber02;
    		tempNumber02 = total;
    		System.out.print(total);
    		System.out.print("  ");
    	}


    }
}



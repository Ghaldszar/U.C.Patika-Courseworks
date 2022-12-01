import java.util.Scanner;

public class EnteredNumberPower {

    public static void main(String[] args) {
    	
    	int enteredNumber;
    	int result = 0;

    	Scanner keybInput = new Scanner(System.in);

    	System.out.print("Sayı Girin : ");
    	enteredNumber = keybInput.nextInt();
    	
    	while (enteredNumber < 0){
    		System.out.println("Lütfen Pozitif Bir Sayı Giriniz");
    		System.out.print("Sayı Girin : ");
    		enteredNumber = keybInput.nextInt();
    	}

    	for (int i = 0 ; i <= enteredNumber ; i++) {
    		if (i == 0) {
    			result = 1;
    			System.out.printf("2 üssü %d = %d \n" , i , result);
    		}
    		if (i > 0) {
    			result = result * 2;
    			System.out.printf("2 üssü %d = %d \n" , i , result);
    		}
    	}


    }
}



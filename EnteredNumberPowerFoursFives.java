import java.util.Scanner;

public class EnteredNumberPowerFoursFives {

    public static void main(String[] args) {
    	
    	int enteredNumber;
    	int resultFours = 0;
    	int resultFives = 0;

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
    			resultFours = 1;
    			resultFives = 1;
    			System.out.printf("4 üssü %d = %d       5 üssü %d = %d \n " , i , resultFours , i , resultFives);
    		}
    		if (i > 0) {
    			resultFours = resultFours * 4;
    			resultFives *= 5;
    			System.out.printf("4 üssü %d = %d       5 üssü %d = %d \n " , i , resultFours , i , resultFives);

    		}
    	}


    }
}



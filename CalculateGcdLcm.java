import java.util.Scanner;

public class CalculateGcdLcm {

    public static void main(String[] args) {
    	
    	int bigNumber = 0;
    	int smallNumber = 0;

    	Scanner keybInput = new Scanner(System.in);

    	System.out.print("İlk Sayı : ");
    	int firstNumber = keybInput.nextInt();
    	System.out.print("İkinci Sayı : ");
    	int secondNumber = keybInput.nextInt();

    	if (firstNumber > secondNumber) {
    		bigNumber = firstNumber;
    		smallNumber = secondNumber;
    	}
    	else if (firstNumber < secondNumber) {
    		smallNumber = firstNumber;
    		bigNumber = secondNumber;
    	}

    	calculateOBEB(bigNumber , smallNumber);
    	calculateOKEK(bigNumber , smallNumber);
    }

    static void calculateOBEB(int bigNumber , int smallNumber) {
    	
    	int obeb = 1;

    	int i = 2;
    	while (i <= smallNumber) {
    		while (smallNumber % i == 0 && bigNumber % i == 0){
    			smallNumber /= i;
    			bigNumber /= i;
    			obeb *= i;
    		}
    		i++;
    	}
    	System.out.printf("OBEB : %d \n" , obeb);
    }

    static void calculateOKEK(int bigNumber , int smallNumber) {

    	int okek = 1;	

    	int i = 2;
    	while (i <= bigNumber){
    		while (bigNumber % i == 0 && smallNumber % i == 0){
    			bigNumber /= i;
    			smallNumber /= i;
    			okek *= i;
    		}
    		while (bigNumber % i == 0){
    			bigNumber /= i;
    			okek *= i;   			
    		}
    		while (smallNumber % i ==	 0){
    			smallNumber /= i;
    			okek *= i;
    		}
    		i++;
    	}
    	System.out.printf("OKEK : %d \n" , okek);

    }
}



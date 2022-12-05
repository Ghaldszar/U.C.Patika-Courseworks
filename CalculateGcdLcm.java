import java.util.Scanner;

public class CalculateGcdLcm {

    public static void main(String[] args) {
    	
    	Scanner keybInput = new Scanner(System.in);

    	System.out.print("İlk Sayı : ");
    	int firstNumber = keybInput.nextInt();
    	System.out.print("İkinci Sayı : ");
    	int secondNumber = keybInput.nextInt();

    	obeb(firstNumber , secondNumber);
    	okek(firstNumber , secondNumber);
    }

    static void obeb(int firstNumber , int secondNumber) {
    	
    	int bigNumber = 0;
    	int smallNumber = 0;
    	int commonMultiply = 1;

    	if (firstNumber > secondNumber) {
    		bigNumber = firstNumber;
    		smallNumber = secondNumber;
    	}
    	else if (firstNumber < secondNumber) {
    		smallNumber = firstNumber;
    		bigNumber = secondNumber;
    	}

    	int i = 2;
    	while (i <= smallNumber) {
    		while (smallNumber % i == 0 && bigNumber % i == 0){
    			smallNumber /= i;
    			bigNumber /= i;
    			commonMultiply *= i;
    		}
    		i++;
    	}
    	System.out.printf("OBEB : %d \n" , commonMultiply);
    }

    static void okek(int firstNumber , int secondNumber) {

    	int bigNumber = 0;
    	int smallNumber = 0;
    	int commonMultiply = 1;	

    	if (firstNumber > secondNumber) {
    		bigNumber = firstNumber;
    		smallNumber = secondNumber;
    	}
    	else if (firstNumber < secondNumber) {
    		smallNumber = firstNumber;
    		bigNumber = secondNumber;
    	}

    	int i = 2;
    	while (i <= bigNumber){
    		while (bigNumber % i == 0 && smallNumber % i == 0){
    			bigNumber /= i;
    			smallNumber /= i;
    			commonMultiply *= i;
    		}
    		while (bigNumber % i == 0){
    			bigNumber /= i;
    			commonMultiply *= i;   			
    		}
    		while (smallNumber % i ==	 0){
    			smallNumber /= i;
    			commonMultiply *= i;
    		}
    		i++;
    	}
    	System.out.printf("OKEK : %d \n" , commonMultiply);

    }
}



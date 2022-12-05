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

    	calculateGCD(bigNumber , smallNumber);	// OBEB - GREATEST COMMON DIVISOR
    	calculateLCM(bigNumber , smallNumber); // OKEK - LEAST COMMON MULTIPLE
    }

    static void calculateGCD(int bigNumber , int smallNumber) {
    	
    	int gcd = 1;

    	int i = 2;
    	while (i <= smallNumber) {
    		while (smallNumber % i == 0 && bigNumber % i == 0){
    			smallNumber /= i;
    			bigNumber /= i;
    			gcd *= i;
    		}
    		i++;
    	}
    	System.out.printf("OBEB : %d \n" , gcd);
    }

    static void calculateLCM(int bigNumber , int smallNumber) {

    	int lcm = 1;	

    	int i = 2;
    	while (i <= bigNumber){
    		while (bigNumber % i == 0 && smallNumber % i == 0){
    			bigNumber /= i;
    			smallNumber /= i;
    			lcm *= i;
    		}
    		while (bigNumber % i == 0){
    			bigNumber /= i;
    			lcm *= i;   			
    		}
    		while (smallNumber % i ==	 0){
    			smallNumber /= i;
    			lcm *= i;
    		}
    		i++;
    	}
    	System.out.printf("OKEK : %d \n" , lcm);

    }
}



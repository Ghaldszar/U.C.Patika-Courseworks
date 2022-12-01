import java.util.Scanner;

public class CalculateFactorial {

    public static void main(String[] args) {
    	long result = 1;
    	Scanner keybInput = new Scanner(System.in);

    	System.out.print("Faktoriyel Sayısını Giriniz : ");
    	int enteredNumber = keybInput.nextInt();

    	while (enteredNumber < 0){
    		System.out.println("Yanlış Sayı Girdiniz.");
    		System.out.println("Lğtfen Poziif Bir Sayı Giriniz");
    		System.out.print("Faktoriyel Sayısını Giriniz : ");
    		enteredNumber = keybInput.nextInt();
    	}

    	if (enteredNumber == 0) {
    		result = 1;
    	}
    	else {
    		for (int i = 1 ; i <= enteredNumber ; i++) {
    		result *= i;
    		}	
    	}    	

    	System.out.printf("%d! Hesabının Sonucu = %d " , enteredNumber , result);
    }
}



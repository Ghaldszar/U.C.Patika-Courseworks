import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
    
    	int enteredNumber;
    	int tempNumber = 0;

    	Scanner keybInput = new Scanner(System.in);	

    	System.out.print("Sayıyı Giriniz : ");
    	enteredNumber = keybInput.nextInt();

    	for (int i = 1 ; i < enteredNumber ; i++) {
    		if (enteredNumber % i == 0){
    			tempNumber += i;
    		}
    	}

    	if (enteredNumber == tempNumber) {
    		System.out.printf("%d Sayısı Mükemmel Sayıdır" , enteredNumber);
    	}
    	else {
    		System.out.printf("%d Sayısı Mükemmel Sayı DEĞİLDİR" , enteredNumber);

    	}
    }
}



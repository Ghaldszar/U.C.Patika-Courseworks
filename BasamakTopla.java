import java.util.Scanner;

public class BasamakTopla {

    public static void main(String[] args) {
    	
    	int total = 0;

    	Scanner keybInput = new Scanner(System.in);

    	System.out.print("Sayı Giriniz : ");
    	int enteredNumber = keybInput.nextInt();

    	int tempNumber = enteredNumber;

    	while (tempNumber >= 10 ){
    		total = total + tempNumber % 10;
    		 tempNumber /= 10;
    	}
    	total += tempNumber;

    	System.out.printf("Girdiğiniiz Sayıların Rakamlarının Toplamı : %d " , total);


    }
}



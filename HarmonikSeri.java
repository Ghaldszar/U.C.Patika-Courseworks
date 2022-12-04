import java.util.Scanner;

public class HarmonikSeri {

    public static void main(String[] args) {

    	double total = 0.0;

    	Scanner keybInput = new Scanner(System.in);

    	System.out.print("Dizinin Max Sayısını Giriniz : ");
    	int enteredNumber = keybInput.nextInt();
    	
    	for (int i = 1 ; i <= enteredNumber ; i++ ) {
    		total += 1.0 / i;
    	}

    	System.out.printf("İşlemin Sonucu : %f" , total);

    }
}



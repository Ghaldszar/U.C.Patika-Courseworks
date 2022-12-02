import java.util.Scanner;

public class ExponentiateNumbers {

    public static void main(String[] args) {
    
    	int n , r;
    	int resultWithFor = 1;
    	int resultWithWhile = 1;

    	Scanner keybInput = new Scanner(System.in);

    	System.out.print("Üssü Alınacak Sayı : ");
    	n = keybInput.nextInt();
    	System.out.print("Üs Olacak Sayı : ");
    	r = keybInput.nextInt();

    	for (int i = 1 ; i <= r ; i++ ) {
    		resultWithFor *= n;
    	}

    	int i = 1;
    	while (i <= r){
    		resultWithWhile *= n;
    		i++;
    	}

    	System.out.printf("FOR ile Hesaplanan Sonuç \t: %d \n" , resultWithFor);
    	System.out.printf("WHILE ile Hesaplanan Sonuç \t: %d \n" , resultWithWhile);



    }
}



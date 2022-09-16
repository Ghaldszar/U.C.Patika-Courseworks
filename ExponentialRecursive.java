import java.util.Scanner;

public class ExponentialRecursive {

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);

    	System.out.print("Taban Değeri Giriniz: ");
    	int base = input.nextInt();
    	System.out.print("Üs Değerini Giriniz: ");
    	int exponent = input.nextInt();

    	System.out.println("Sonuç : " + power(base , exponent));
    }

    static long power(int base , int exponent) {
    	if (exponent == 0) {
    		return 1;
    	}
    	return power(base , exponent - 1) * base;
    }
}



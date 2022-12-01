import java.util.Scanner;

public class CalculateCombination {

    public static void main(String[] args) {
    
    	Scanner keybInput = new Scanner(System.in);

    	System.out.println("C(N,R) ==> N’in R’li Kombinasyonu Hesabı İçin : ");
    	System.out.println("Sayıları Girin");
    	System.out.print("N : ");
    	int n = keybInput.nextInt();
    	while (n < 1){
    		System.out.println("Lütfen Geçerli Bir Sayı Girin.");
    		System.out.print("N : ");
    		n = keybInput.nextInt();
    	}
    	System.out.print("R : ");
    	int r = keybInput.nextInt();
    	while (r < 1){
    		System.out.println("Lütfen Geçerli Bir Sayı Girin.");
    		System.out.print("R : ");
    		r = keybInput.nextInt();
    	}
    	long combinationResult = calculateFactorial(n) / (calculateFactorial(r) * calculateFactorial(n - r));
    	System.out.println("Sonuç : " + combinationResult);

    }

    static long calculateFactorial(int enteredNumber) {
    	long result = 1;
    	for (int i = 1 ; i <= enteredNumber ; i++) {
    		result *= i;
    	}
    	return result;    
    }
}



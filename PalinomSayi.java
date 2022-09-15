import java.util.Scanner;

public class PalinomSayi {

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	System.out.print("Sayıyı Giriniz : ");
    	int number = input.nextInt();

    	if (isPalinom(number) == true) {
    		System.out.println("Bu Sayı Palinomdur");
    	}
    	else {
	    	System.out.println("Bu Sayı Palinom DEĞİLDİR....");
    	}
    	//System.out.println(isPalinom(23));
    }

    public static boolean isPalinom(int number) {
    	int temp = 0;
    	int reversedNumber = 0;
    	int x = number;
    	while (x > 0){
    		reversedNumber *= 10;
    		temp = x % 10;
    		reversedNumber += temp;
    		x /= 10;
    	}
    	
    	if (number == reversedNumber) {
    		return true;
    	}
    	else {
    		return false;
    	}
    	
    }
}



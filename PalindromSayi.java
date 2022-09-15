import java.util.Scanner;

public class PalindromSayi {

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	System.out.print("Sayıyı Giriniz : ");
    	int number = input.nextInt();

    	if (isPalindrom(number) == true) {
    		System.out.println("Bu Sayı Palindromdur");
    	}
    	else {
	    	System.out.println("Bu Sayı Palindrom DEĞİLDİR....");
    	}
    	//System.out.println(isPalindrom(23));
    }

    public static boolean isPalindrom(int number) {
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



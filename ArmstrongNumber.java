import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
    
    	int enteredNumber;
    	int total = 0;

    	Scanner keybInput = new Scanner(System.in);
    	System.out.print("Sayı Girin : ");
    	enteredNumber = keybInput.nextInt();
    	int tempNumber = enteredNumber;

    	int basamakSayisi = (basamakSay(enteredNumber));
    	//System.out.println(usHesapla(2 , basamakSayisi));

    	while (tempNumber >= 10){
    		total = total + usHesapla((tempNumber % 10) , basamakSayisi);
    		tempNumber /= 10;
    	}
    	total += usHesapla(tempNumber , basamakSayisi);

    	isArmstrong(enteredNumber , total);
    }

    static int basamakSay(int enteredNumber) {
    	int count = 1;
    	while (enteredNumber >= 10){
    		enteredNumber /= 10;
    		count++;
    	}
    	return count;
    }

    static int usHesapla(int a , int b) {
    	int usHesabiSonucu = 1;
    	for (int i = 1 ; i <= b ; i++ ) {
    		usHesabiSonucu *= a;
    	}
    	return usHesabiSonucu;
    }

    static void isArmstrong(int enteredNumber , int total) {
    	if (enteredNumber == total) {
    		System.out.printf("%d Sayısı Bir Armstrong Sayıdır." , enteredNumber);
    	}
    	else {
    		System.out.printf("%d Sayısı Bir Armstrong Sayısı DEĞİLDİR." , enteredNumber);
    	}
    }
}



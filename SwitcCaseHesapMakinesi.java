import java.util.Scanner;

public class SwitcCaseHesapMakinesi {

    public static void main(String[] args) {
    
    	Scanner input = new Scanner(System.in);

    	System.out.print("İlk Sayıyı Giriniz : ");
    	int number1 = input.nextInt();
		System.out.print("İkinci Sayıyı Giriniz : ");
    	int number2 = input.nextInt();

    	System.out.println("İşlemi Seçiniz : ");
    	System.out.println("1 : Toplama");
    	System.out.println("2 : Çıkarma");
    	System.out.println("3 : Çarpma");
    	System.out.println("4 : Bölme");
    	System.out.print("Seçim : ");

    	int choice = input.nextInt();
    	switch(choice) {
    	case 1: 
    		System.out.print("Sonuç : " + (number1 + number2));
    		break;
    	case 2: 
    		System.out.print("Sonuç : " + (number1 - number2));
    		break;
    	case 3: 
    		System.out.print("Sonuç : " + (number1 * number2));
    		break;
    	case 4: 
    		System.out.print("Sonuç : " + (double)(number1 / number2));
    		break;
    	}


    }
}



import java.util.Scanner;

public class CalculatorAdv {

    public static void main(String[] args) {
    	System.out.println("Gelişmiş Hesap Makinası Programına Hoş Geldiniz.");
    	CalculatorMenu();
    }

    static void addition() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("T O P L A M A   İ Ş L E M İ");
    	System.out.print("Birinci Sayıyı Giriniz : ");
    	double firstNumber = input.nextDouble();
    	System.out.print("İkinci Sayıyı Giriniz : ");
    	double secondNumber = input.nextDouble();
    	double result = firstNumber + secondNumber;
    	System.out.println("Toplama İşleminin Sonucu : " + result);
    }

    static void subtraction() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Ç I K A R M A   İ Ş L E M İ");
    	System.out.print("Birinci Sayıyı Giriniz : ");
    	double firstNumber = input.nextDouble();
    	System.out.print("İkinci Sayıyı Giriniz : ");
    	double secondNumber = input.nextDouble();
    	double result = firstNumber - secondNumber;
    	System.out.println("Çıkarma İşleminin Sonucu : " + result);
    }

    static void multiplication() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Ç A R P M A   İ Ş L E M İ");
    	System.out.print("Birinci Sayıyı Giriniz : ");
    	double firstNumber = input.nextDouble();
    	System.out.print("İkinci Sayıyı Giriniz : ");
    	double secondNumber = input.nextDouble();
    	double result = firstNumber * secondNumber;
    	System.out.println("Çarpma İşleminin Sonucu : " + result);
    }

    static void division() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("B Ö L M E   İ Ş L E M İ");
    	System.out.print("Birinci Sayıyı Giriniz : ");
    	double firstNumber = input.nextDouble();
    	System.out.print("İkinci Sayıyı Giriniz : ");
    	double secondNumber = input.nextDouble();
    	double result = firstNumber / secondNumber;
    	System.out.println("Bölme İşleminin Sonucu : " + result);
    }

    static void exponential() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Ü S   A L M A   İ Ş L E M İ");
    	System.out.print("Sayıyı Giriniz : ");
    	double firstNumber = input.nextDouble();
    	System.out.print("Sayının Kuvvetini Giriniz : ");
    	int secondNumber = input.nextInt();
    	double result = 1;
    	for (int i = 1 ; i <= secondNumber ; i++ ) {
    		result *= firstNumber;
    	}
    	//double result = firstNumber / secondNumber;
    	System.out.println("Üs Alma İşleminin Sonucu : " + result);
    }

    static void factorial() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("F A K T O R İ Y E L   A L M A   İ Ş L E M İ");
    	System.out.print("Sayıyı Giriniz : ");
    	int number = input.nextInt();
    	int result = 1;
    	for (int i = number ; i >= 1 ; i--) {
    		result *= i;
    	}
    	System.out.println("Faktoriyel İşleminin Sonucu : " + result);
    }

    static void mod() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("M O D   A L M A   İ Ş L E M İ");
    	System.out.print("Birinci Sayıyı Giriniz : ");
    	int firstNumber = input.nextInt();
    	System.out.print("İkinci Sayıyı Giriniz : ");
    	int secondNumber = input.nextInt();
    	int result = firstNumber % secondNumber;
    	System.out.println("Bölme İşleminden Kalan : " + result);
    }

    static void rectangleCalculations() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("D İ K D Ö R T G E N   A L A N   V E   Ç E V R E   H E S A P L A R I");
    	System.out.print("Uzun Kenar Uzunluğunu Giriniz : ");
    	int longSideLength = input.nextInt();
    	System.out.print("Kısa Kenar Uzunluğunu Giriniz : ");
    	int shortSideLength = input.nextInt();
    	int resultArea = longSideLength * shortSideLength;
    	int resultCevre = (2 * longSideLength) + (2 * shortSideLength);
    	System.out.println("Dikdörgenin Alanı : " + resultArea);
    	System.out.println("Dikdörgenin Çevresi : " + resultCevre);
    }

    static void CalculatorMenu() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz.");
    	System.out.println("[1] - Toplama İşlemi");
		System.out.println("[2] - Çıkarma İşlemi");
		System.out.println("[3] - Çarpma İşlemi");
		System.out.println("[4] - Bölme işlemi");
		System.out.println("[5] - Üslü Sayı Hesaplama");
		System.out.println("[6] - Faktoriyel Hesaplama");
		System.out.println("[7] - Mod Alma");
		System.out.println("[8] - Dikdörtgen Alan ve Çevre Hesabı");
		System.out.print("Seçiminiz : ");
		char menuChoice = input.next().charAt(0);
		while (menuChoice != '1' && menuChoice != '2' && menuChoice != '3' && menuChoice != '4' && menuChoice != '5' && menuChoice != '6' && menuChoice != '7' && menuChoice != '8') {
			System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz.");
    		System.out.println("[1] - Toplama İşlemi");
			System.out.println("[2] - Çıkarma İşlemi");
			System.out.println("[3] - Çarpma İşlemi");
			System.out.println("[4] - Bölme işlemi");
			System.out.println("[5] - Üslü Sayı Hesaplama");
			System.out.println("[6] - Faktoriyel Hesaplama");
			System.out.println("[7] - Mod Alma");
			System.out.println("[8] - Dikdörtgen Alan ve Çevre Hesabı");
			System.out.print("Seçiminiz : ");
			menuChoice = input.next().charAt(0);
		}

		switch(menuChoice) {
		case '1' :
			addition();
			break;
		case '2' :
			subtraction();
			break;
		case '3' :
			multiplication();
			break;
		case '4' :
			division();
			break;
		case '5' :
			exponential();
			break;
		case '6' :
			factorial();
			break; 
		case '7' :
			mod();
			break; 
		case '8' :
			rectangleCalculations();
			break;
		default :
			break;
		}


    }
}



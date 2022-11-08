import java.util.Scanner;

public class ZodiacFinder {

    public static void main(String[] args) {

    	int month;
    	int day;
    
    	Scanner keybInput = new Scanner(System.in);

    	System.out.print("Doğduğunuz Ayı Giriniz : ");
    	month = keybInput.nextInt();

    	chooseMonth(month);

    }

    public static void chooseMonth(int month) {
    	if (month <= 12 && month >= 1) {
    		System.out.print("Doğduğunuz Günü Yazınız : ");
    		Scanner keybInput = new Scanner(System.in);
    		int day = keybInput.nextInt();
    		System.out.print(findSign(day , month));
    	}
    	else {
    		System.out.print("Seçtiğiniz Ay Hatalıdır");
    	}
    }
	
	public static String findSign(int day , int month) {
    	if(month == 1) {
    		if(day > 0 && day <= 21) {
    			return "Burcunuz : Oğlak";
    		}
    		else if(day > 21 && day <= 31) {
    			return "Burcunuz : Kova";
    		}
    		else {
    			return "Girdiğiniz Tarih Hatalıdır...";
    		}
    	}
    	else if(month == 2) {
    		if(day > 0 && day <= 19) {
    			return "Burcunuz : Kova";
    		}
    		else if(day > 19 && day <= 29) {
    			return "Burcunuz : Balık";
    		}
    		else {
    			return "Girdiğiniz Tarih Hatalıdır...";
    		}
    	}
    	else if(month == 3) {
    		if(day > 0 && day <= 20) {
    			return "Burcunuz : Balık";
    		}
    		else if(day > 20 && day <= 31) {
    			return "Burcunuz : Koç";
    		}
    		else {
    			return "Girdiğiniz Tarih Hatalıdır...";
    		}
    	}
    	else if(month == 4) {
    		if(day > 0 && day <= 20) {
    			return "Burcunuz : Koç";
    		}
    		else if(day > 20 && day <= 30) {
    			return "Burcunuz : Boğa";
    		}
    		else {
    			return "Girdiğiniz Tarih Hatalıdır...";
    		}
    	}
    	else if(month == 5) {
    		if(day > 0 && day <= 21) {
    			return "Burcunuz : Boğa";
    		}
    		else if(day > 21 && day <= 31) {
    			return "Burcunuz : İkizler";
    		}
    		else {
    			return "Girdiğiniz Tarih Hatalıdır...";
    		}
    	}
    	else if(month == 6) {
    		if(day > 0 && day <= 22) {
    			return "Burcunuz : İkizler";
    		}
    		else if(day > 22 && day <= 30) {
    			return "Burcunuz : Yengeç";
    		}
    		else {
    			return "Girdiğiniz Tarih Hatalıdır...";
    		}
    	}
    	else if(month == 7) {
    		if(day > 0 && day <= 22) {
    			return "Burcunuz : Yengeç";
    		}
    		else if(day > 22 && day <= 31) {
    			return "Burcunuz : Aslan";
    		}
    		else {
    			return "Girdiğiniz Tarih Hatalıdır...";
    		}
    	}
    	else if(month == 8) {
    		if(day > 0 && day <= 22) {
    			return "Burcunuz : Aslan";
    		}
    		else if(day > 22 && day <= 31) {
    			return "Burcunuz : Başak";
    		}
    		else {
    			return "Girdiğiniz Tarih Hatalıdır...";
    		}
    	}
    	else if(month == 9) {
    		if(day > 0 && day <= 22) {
    			return "Burcunuz : Başak";
    		}
    		else if(day > 22 && day <= 30) {
    			return "Burcunuz : Terazi";
    		}
    		else {
    			return "Girdiğiniz Tarih Hatalıdır...";
    		}
    	}
    	else if(month == 10) {
    		if(day > 0 && day <= 22) {
    			return "Burcunuz : Terazi";
    		}
    		else if(day > 22 && day <= 31) {
    			return "Burcunuz : Akrep";
    		}
    		else {
    			return "Girdiğiniz Tarih Hatalıdır...";
    		}
    	}
    	else if(month == 11) {
    		if(day > 0 && day <= 21) {
    			return "Burcunuz : Akrep";
    		}
    		else if(day > 21 && day <= 30) {
    			return "Burcunuz : Yay";
    		}
    		else {
    			return "Girdiğiniz Tarih Hatalıdır...";
    		}
    	}
    	else {
    		if(day > 0 && day <= 21) {
    			return "Burcunuz : Yay";
    		}
    		else if(day > 21 && day <= 31) {
    			return "Burcunuz : Oğlak";
    		}
    		else {
    			return "Girdiğiniz Tarih Hatalıdır...";
    		}
    	}
    	
    }
}





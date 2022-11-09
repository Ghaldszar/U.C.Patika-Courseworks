import java.util.Scanner;

public class ArtikYilHesaplayici {

    public static void main(String[] args) {
    	int year;
    	boolean isLeapYear;

    	Scanner keybInput = new Scanner(System.in);

    	System.out.print("Yıl Giriniz : ");
    	year = keybInput.nextInt();

    	isLeapYear = year % 4 == 0;
    	String str = isLeapYear ? " Yılı Bir Artık Yıldır" : " Yılı Bir Artık Yıl Değildir.";

    	System.out.println(year + str);

    }
}



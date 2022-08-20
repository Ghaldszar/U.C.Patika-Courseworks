import java.util.Scanner;
import java.lang.Math;

public class HipotenusveAlanHesapla {

    public static void main(String[] args) {
    	
    	int a , b , alan;
    	double hipotenus;

    	Scanner input = new Scanner(System.in);

    	System.out.print("1.Kenarın Uzunluğunu Giriniz : ");
    	a = input.nextInt();

    	System.out.print("2.Kenarın Uzunluğunu Giriniz : ");
    	b = input.nextInt();

    	hipotenus = Math.sqrt(Math.pow(a , 2) + Math.pow(b , 2));

    	System.out.print("Hipotenüs Uzunluğu : " + hipotenus);
    	System.out.println();

    	alan = a * b;
    	System.out.print("Üçgenin Alanı : " + alan);

    }
}



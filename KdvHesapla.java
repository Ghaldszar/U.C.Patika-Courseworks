import java.util.*;

public class KdvHesapla {
	
	public static void main (String[] args) {
		
		double kdvHaricFiyat;
		double kdv = 0.18;
		double kdvDahilFiyat;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Lütfen KDV Haric Fiyatı Giriniz : ");
		kdvHaricFiyat = input.nextInt();
		kdvDahilFiyat = kdvHaricFiyat * ( 1 + kdv );

		System.out.printf("KDVsiz Fiyat : %.2f TL.\n" , kdvHaricFiyat);
		System.out.print("KDV : % 18.00 \n");
		System.out.printf("KDVli Fiyat : %.2f TL.\n" , kdvDahilFiyat);


	}

}

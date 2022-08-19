import java.util.*;

public class NotOrtalamasi {
	public static void main (String[] args) {
		int fizik , kimya , matematik , turkce , din , felsefe , sosyoloji , beden, resim;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Fizik Notounuzu Giriniz : ");
		fizik = input.nextInt();
		
		System.out.print("Kimya Notunuzu Giriiniz : ");
		kimya = input.nextInt();
		
		System.out.print("Matematik Notounuzu Giriniz : ");
		matematik = input.nextInt();
		
		System.out.print("Türkçe Notounuzu Giriniz : ");
		turkce = input.nextInt();
		
		System.out.print("Din Notounuzu Giriniz : ");
		din = input.nextInt();
		
		System.out.print("Felsefe Notounuzu Giriniz : ");
		felsefe = input.nextInt();
		
		System.out.print("Sosyoloji Notounuzu Giriniz : ");
		sosyoloji = input.nextInt();
		
		System.out.print("Beden Eğitimi Notounuzu Giriniz : ");
		beden = input.nextInt();
		
		System.out.print("Resim Notounuzu Giriniz : ");
		resim = input.nextInt();

		double ortalama = ( fizik + kimya + matematik + turkce + din + felsefe + sosyoloji + beden + resim ) / 9;
		System.out.println("Not Ortalamanız : " + ortalama);
		if (ortalama >= 50) {
			System.out.println("T E B R İ K L E R    G E Ç T İ N İ Z");
		}
		else {
			System.out.println("Ü Z G Ü N Ü Z   K A L D I N I Z");
		}	

		

	 
	}

} 

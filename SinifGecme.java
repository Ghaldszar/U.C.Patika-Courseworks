import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {
    	
    	int mat , fizik , turkce , kimya , muzik;
    	int count = 0;
    	int totalValidGrades = 0;
    	double average;

    	Scanner input = new Scanner(System.in);

    	System.out.print("Matematik Notunuz :  ");
    	mat = input.nextInt();
    	if (mat >= 0 && mat <= 100 ) {
    		totalValidGrades += mat;
    		count++;
    	}

    	System.out.print("Fizik Notunuz :  ");
    	fizik = input.nextInt();
    	if (fizik >= 0 && fizik <= 100 ) {
    		totalValidGrades += fizik;
    		count++;
    	}

    	System.out.print("Türkçe Notunuz :  ");
    	turkce = input.nextInt();
    	if (turkce >= 0 && turkce <= 100 ) {
    		totalValidGrades += turkce;
    		count++;
    	}

    	System.out.print("Kimya Notunuz :  ");
    	kimya = input.nextInt();
    	if (kimya >= 0 && kimya <= 100 ) {
    		totalValidGrades += kimya;
    		count++;
    	}

    	System.out.print("Müzik Notunuz :  ");
    	muzik = input.nextInt();
    	if (muzik >= 0 && muzik <= 100 ) {
    		totalValidGrades += muzik;
    		count++;
    	}
 		
 		average = totalValidGrades / count;
 		System.out.printf("Ortalama : %s \n" , average);
 		
 		if (average >= 55) {
 			System.out.println("Tebrikler. Geçtiniz...");
 		}
 		else {
 			System.out.println("Üzgünüz. Sınıfta Kaldınız. Seneye Tekrar Görüşürüz...");
 		}

    }
}



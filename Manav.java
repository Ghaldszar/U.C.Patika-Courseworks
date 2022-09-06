import java.util.Scanner;

public class Manav {

    public static void main(String[] args) {
    
    double armutKg;
    double elmaKg;
	double domatesKg;
    double muzKg;
    double patlicanKg;

    Scanner scan = new Scanner(System.in);
    
    System.out.print("Armut Kaç Kilo ? : ");
    armutKg = scan.nextDouble();    
    System.out.print("Elma Kaç Kilo ? : ");
    elmaKg = scan.nextDouble();
    System.out.print("Domates Kaç Kilo ? : ");
    domatesKg = scan.nextDouble();
    System.out.print("Muz Kaç Kilo ? : ");
    muzKg = scan.nextDouble();
    System.out.print("Patlıcan Kaç Kilo ? : ");
    patlicanKg = scan.nextDouble();

    double armutTutar = armutKg * 2.14;
	double elmaTutar = elmaKg * 3.67;
	double domatesTutar = domatesKg * 1.11;
	double muzTutar = muzKg * 0.95;
	double patlicanTutar = patlicanKg * 5.00;
	double toplamTutar = armutTutar + elmaTutar + domatesTutar + muzTutar + patlicanTutar;

	System.out.printf("Toplam Tutar : %.2f TL." , toplamTutar);
    }
}



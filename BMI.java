import java.util.Scanner;
import java.lang.Math;

public class BMI {

    public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);

    	System.out.print("Boyunuzu Giriniz (cm) : ");
    	double heightCM = scan.nextDouble();
    	double height = heightCM / 100;
    	System.out.print("Kilonuzu Giriniz (kg) : ");
    	double weight = scan.nextDouble();
    	double bmi = weight / Math.pow(height , 2);

    	System.out.printf("Vücut Kitle Indexi(BMI) : %.2f" , bmi);

    }
}



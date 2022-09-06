import java.util.Scanner;
import java.lang.Math;

public class DaireHesaplari {

    public static void main(String[] args) {
    
    	int radius , angle;
    	double area1 , area2 , circum;

    	Scanner scan = new Scanner(System.in);

    	System.out.print("Lütfen Yarıçap Ölçüsünü Girin : ");
    	radius = scan.nextInt();
    	System.out.print("Lütfen Daire Diliminin Açısını Girin : ");
    	angle = scan.nextInt();

    	while (angle > 360 || angle <= 0){
    		System.out.println("Lütfen Doğru Bir Açı Girin!!!.....");
    		System.out.print("Lütfen Daire Diliminin Açısını Girin : ");
    		angle = scan.nextInt();

    	}

    	circum = 2 * Math.PI * radius;
    	area1 = Math.PI * Math.pow(radius, 2);
    	area2 = Math.PI * Math.pow(radius, 2) * angle / 360;
    	System.out.printf("Çemberin Çevresi : %.2f \n" , circum);
    	System.out.printf("Çemberin Tüm Alanı : %.2f \n" , area1);
    	System.out.printf("Çemberin Alanı : %.2f \n" , area2);



    }
}



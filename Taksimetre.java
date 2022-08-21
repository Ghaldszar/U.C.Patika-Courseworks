import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
    
    	int gidilenKm;


    	Scanner input = new Scanner(System.in);

    	System.out.print("Gidilen KM giriniz : ");
    	gidilenKm = input.nextInt();


    	double hesaplananTutar = (gidilenKm * 2.20) + 10;
    	
    	boolean tutarGecerliMi = hesaplananTutar >= 20;
    	double odenecekTutar = tutarGecerliMi ? hesaplananTutar : 20;
    	//System.out.print("Ödenecek Tutar : " + tutar + " TL.dir");
    	System.out.print(odenecekTutar);


    }
}



import java.util.Scanner;

public class TicketPriceCalculator {

    public static void main(String[] args) {
    	
    	int distance;
    	int age;
    	int flightType;
    	int normalTicketPrice;



    	Scanner keybInput = new Scanner(System.in);
    	
    	System.out.print("Mesafeyi -km- türünden giriniz : ");
    	distance = keybInput.nextInt();
    	while (distance < 100){
    		System.out.println("Lütfen Uzaklığı Doğru Giriniz. Uçakla Yapılan Seyahat Uzaklığı Bu kadar Küçük Olamaz.");
    		System.out.print("Mesafeyi -km- türünden yeniden giriniz : ");
    		distance = keybInput.nextInt();
    	}
    	
    	System.out.print("Yaşınızı giriniz : ");
    	age = keybInput.nextInt();
    	while (age < 0){
    		System.out.print("Lütfen Yaşı Doğru Giriniz. Yaş eksi sayılarda olamaz ");
    		System.out.print("Yaşınızı giriniz : ");
    		age = keybInput.nextInt();
    	}

    	System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
    	flightType = keybInput.nextInt();
    	while (flightType < 1 || flightType > 2){
    		System.out.println("Lütfen Yolculuk Tipini Doğru Giriniz");
    		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
    		flightType = keybInput.nextInt();

    	}

    	System.out.print("Bilet Fiyatı : " + calculateTicketPrice(distance , age , flightType));


    }

    public static int calculateTicketPrice(int distance , int age , int flightType) {
    	double normalTicketPrice = distance * 0.10;
    	double ageDiscountedTicketPrice = normalTicketPrice - (normalTicketPrice * ageDiscount(age));
    	double flightTypeDiscountedTicketPrice = ageDiscountedTicketPrice - (ageDiscountedTicketPrice * flightTypeDiscount(flightType));
    	int ticketPrice = (int) flightTypeDiscountedTicketPrice;
    	if (flightType == 1) {
    		return ticketPrice;
    	}
    	else if (flightType == 2) {
    		return ticketPrice * 2;
    	}
    	else {
    		return ticketPrice;
    	}
    }

    public static double ageDiscount(int age) {
    	if (age < 12) {
    		return 0.50;
    	}
    	else if (age <= 24 && age >= 12) {
    		return 0.10;
    	}
    	else if (age >= 65) {
    		return 0.30;
    	}
    	else {
    		return 0;
    	}
    }

    public static double flightTypeDiscount(int flightType) {
    	double returnValue = 0;
    	switch (flightType) {
    		case 1: 
    			returnValue = 0;
    			break;
    		case 2:
    			returnValue = 0.20; 
    			break;
    		default:
    			break;
    	}
    	return returnValue;
    }
}



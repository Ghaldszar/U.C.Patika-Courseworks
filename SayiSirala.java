import java.util.Scanner;

public class SayiSirala {

    public static void main(String[] args) {
    	
    	Scanner keybInput = new Scanner(System.in);
    	System.out.println("Sıralamak İstediğiniz 3 Sayıyı Giriniz:");
    	System.out.print("1.Sayı : ");
    	int a = keybInput.nextInt();
    	System.out.print("2.Sayı : ");
    	int b = keybInput.nextInt();
    	System.out.print("3.Sayı : ");
    	int c = keybInput.nextInt();

		System.out.println("Bu 3 Sayıyı Sıralama Şeklini Seçiniz.");
		System.out.println("Küçükten Büyüğe Sıralamak İçin --> 1");
		System.out.println("Büyükten Küçüğe Sıralamak İçin --> 2");
		System.out.print("Seçiminiz: ");
		int secim = keybInput.nextInt();
		switch (secim) {
		case 1 :
			minToMax(a , b , c);
			break;
		case 2 :
			//minToMax(a , b , c);
			maxToMin(a , b , c);
			break;
		default : 
			System.out.println("Yanlış Seçim Yaptınız.");
		}


    }

    static void minToMax(int a , int b , int c) {
    	if (a < b && a < c) {
    		if (b < c) {
    			System.out.println(a + " " + b + " " + c);
    		}
    		else if (c < b) {
    			System.out.println(a + " " + c + " " + b);    			
    		}
    	}
    	else if (b < a && b < c) {
    		if (a < c) {
    			System.out.println(b + " " + a + " " + c);
    		}
    		else if (c < a) {
    			System.out.println(b + " " + c + " " + a);
    		}
    	}
    	else if (c < a && c < b) {
    		if (a < b) {
	 			System.out.println(c + " " + a + " " + b);
    		}
    		else if (b < a) {
    			System.out.println(c + " " + b + " " + a);
    		}
    	}
    	else {
    		System.out.println("Hatalı Bir Durum Var. En az 2 sayı Birbirine Eşit Olabilir.");
    	}
    }

    static void maxToMin(int a , int b , int c) {
    	if (a > b & a > c) {
    		if (b > c) {
    			System.out.println(a + " " + b + " " + c);
    		}
    		else if (c > b) {
    			System.out.println(a + " " + c + " " + b);    			
    		}
    	}
    	else if (b > a & b > c) {
    		if (a > c) {
    			System.out.println(b + " " + a + " " + c);
    		}
    		else if (c > a) {
    			System.out.println(b + " " + c + " " + a);
    		}
    	}
    	else if (c > a & c > b) {
    		if (a > b) {
	 			System.out.println(c + " " + a + " " + b);
    		}
    		else if (b > a) {
    			System.out.println(c + " " + b + " " + a);
    		}
    	}
    	else {
    		System.out.println("Hatalı Bir Durum Var. En az 2 sayı Birbirine Eşit Olabilir.");
    	}	
    }
}



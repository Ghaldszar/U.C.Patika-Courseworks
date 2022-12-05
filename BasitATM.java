import java.util.Scanner;

public class BasitATM {

    public static void main(String[] args) {
    	
    	String userName = "Ghaldszar";
    	String password = "2143";
    	int loginTry = 3;
    	int choiceOfBankTransaction;
    	double balance = 10000;
    	double enteredAmount;


    	Scanner keybInput = new Scanner(System.in);


    	while (loginTry > 0){

	    	System.out.print("Kullanıcı Adı : ");
	    	String enteredUserName = keybInput.nextLine();
	    	System.out.print("Parola : ");
	    	String enteredPassword = keybInput.nextLine();

    		if (enteredUserName.equals(userName) && enteredPassword.equals(password)) {
    			System.out.println("Merhaba. Basit ATM Uygulamasına Hoşgeldiniz.");
    			System.out.println();
    			System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz.");
    			System.out.println("1 - PARA YATIRMA");
    			System.out.println("2 - PARA ÇEKME");
    			System.out.println("3 - BAKİYE ÖĞRENME");
    			System.out.println("4 - ÇIKIŞ YAP");
    			System.out.print("Seçiniz : ");
    			choiceOfBankTransaction = keybInput.nextInt();

    			switch (choiceOfBankTransaction) {
    			case 1:
    				System.out.print("Yatırmak İstediğiniz Miktarı Giriniz : ");
    				enteredAmount = keybInput.nextDouble();
    				balance += enteredAmount;
    				System.out.println("Para Yatırma İşleminiz Başarılı.");
    				System.out.printf("Bakiyeniz %.2f TL.dir." , balance);
    				break;
    			case 2:
    				System.out.print("Çekmek İstediğiniz Miktarı Giriniz : ");
    				enteredAmount = keybInput.nextDouble();
    				if (enteredAmount <= balance) {
    					System.out.printf("Çekmek İstediğiniz Miktar Olan %.2f TL. Ödeniyor. \n" , enteredAmount);
    					System.out.println("Lütfen Paranızı Bölmeden Alınız.");
    					System.out.println("Para Çekme İşlminiz Başarılı.");
    					balance -= enteredAmount;
    				}
    				else {
    					System.out.println("Bakiyeniz Yetersiz");
    				}
    				System.out.printf("Bakiyeniz %.2f TL.dir." , balance);
    				break;
    			case 3:
    				System.out.printf("Bakiyeniz %.2f TL.dir." , balance);
    				break;
    			case 4:
    				System.out.println("Basit ATM İyi Günler Diler.");
    			default:
    				System.out.println("Yanlış Bir Şeçim Yaptığınızdan Dolayı İşleminiz Sonlandırılmıştır.");
    				System.out.println("Basit ATM İyi Günler Diler.");
    				break;
    			}

    			break;

	    	}

	    	else {
	    		loginTry--;
	    		if (loginTry == 0) {
	    			System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
	    		}
	    		else {
	    			System.out.println("Yanlış Kullanıcı Adı ve/veya Parola. Lütfen Tekrar Deneyiniz.");
	    			System.out.printf("Kalan Deneme Hakkınız : %d\n" , loginTry);

	    		}
    		}
    	}

    	



    }
}



import java.util.Scanner;

public class KullaniciIslemleri {

    public static void main(String[] args) {
		
		String userName = "patika";  
		String password = "java123";
		String userNameEntered, passwordEntered;

		Scanner input = new Scanner(System.in);

		System.out.print("Username : ");
		userNameEntered = input.nextLine();

		System.out.print("Password: ");
		passwordEntered = input.nextLine();

		if (userNameEntered.equals(userName) && passwordEntered.equals(password)) {
		 	System.out.printf("Merhaba %s. Başarıyla Giriş Yaptınız." , userName);
		 } 
		 else {
		 	System.out.println("Kullanıcı Adı ya da Şifre HATALI.");
		 	System.out.print("Yeni Bir Şifre Belirlemek İster misiniz? (E/H) : ");
		 	
		 	char choice = input.next().charAt(0);
		 	
		 	switch(choice) {
		 		case 'E' : ;
		 		case 'e' :
			 		System.out.print("Yeni Şifrenizi Giriniz : ");
			 		input.nextLine();
			 		String passwordNew = input.nextLine();
			 		if (passwordNew.equals(password)) {
			 			System.out.println("Girdiğiniz şifre hatalıdır. \nGirdiğiniz şifre eski şifreniz ile aynı olmamalıdır." );
			 			System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
			 		}
			 		else{
			 			System.out.println("Şifre Başarıyla Oluşturuldu.");
			 		}
			 		break;
			 	case 'H' : 
			 		System.out.println("Patika.dev İyi Günler Diler.");
			 		break;
			 	default: 
		 			System.out.println("Yanlış Giriş Yaptınız");
			 	}
		 		


		 }


    }
}



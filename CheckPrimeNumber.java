import java.util.Scanner;

public class CheckPrimeNumber {
    
    public static void main(String[] args) {  
        
        Scanner input = new Scanner(System.in);
        System.out.print("Kontrol Edilecek Sayıyı Giriniz : ");
        int number = input.nextInt();
        
        if (isPrime(number, 2)) {
          System.out.printf("%d Bir Asal Sayıdır." , number);
        }
        else {
         System.out.printf("%d Bir Asal Sayı DEĞİLDİR:" , number);
        }
    }

    static boolean isPrime(int n, int i) {
        if (n <= 2) {
            if (n == 2) {
                return true;
            } 
            else {
                return false;
            }
        }
        if (n % i == 0) {
           return false; 
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }

    

 }
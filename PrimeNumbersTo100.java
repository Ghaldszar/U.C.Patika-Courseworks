public class PrimeNumbersTo100 {

    public static void main(String[] args) {
        
        for(int i = 2 ; i < 100 ; i++) {       
			System.out.print(i + " ");          
        }

    }

    static boolean isPrime(int i) {

        for(int j = 2 ; j < i ; j++) {
            if(i % j == 0) {
                return false;
            }
        }

        return true;
        
    }

}



import java.util.Scanner;

public class AverageOddNumbers {

    public static void main(String[] args) {
    
		int totalNumbers = 0;
		int count = 0;
		int enteredNumber;    	

    	Scanner keybInput = new Scanner(System.in);
    	
    	System.out.print("Sayı Girin: ");	
    	enteredNumber = keybInput.nextInt();
    	while(enteredNumber >= 0) {
    		if (enteredNumber % 2 != 0) {
    				totalNumbers += enteredNumber;
    				count++;   				
    			}
    		System.out.print("Sayı Girin: ");	
    		enteredNumber = keybInput.nextInt();		
    	}

    	//System.out.print("COUNT : " + count);
    	if (count < 1) {
    		count = 1;
    	}
    	double averageNumbers = totalNumbers / count;
    	System.out.print("GİRİLEN TEK SAYILARIN ORTALAMASI : " + averageNumbers );


    }
}



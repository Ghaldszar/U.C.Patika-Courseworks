import java.util.Scanner;

public class FindEvenNumbers {

    public static void main(String[] args) {
    	
    	Scanner keybInput = new Scanner(System.in);

    	System.out.print("Üst Sınırı Girin : ");
    	int enteredLastNumber = keybInput.nextInt();

    	int totalNumbersOfDiviidibleTwo = 0;
    	int countTwo = 0;    	    	
    	double averageOfDividibleTwo = 0;

    	System.out.print("2 YE TAM BÖLÜNEN SAYILAR : ");
    	for (int i = 1 ; i <= enteredLastNumber ; i++ ) {
    		
    		while(i % 2 == 0) {
    			System.out.print(i + " ");
    			totalNumbersOfDiviidibleTwo = totalNumbersOfDiviidibleTwo + i;
    			countTwo++;
    			break;
    		}
    	}
    	if (countTwo < 1) {
    		countTwo = 1;
    	}

    	System.out.println();
    	averageOfDividibleTwo = totalNumbersOfDiviidibleTwo / countTwo;
    	System.out.println("2'YE BÖLÜNENLERİN ORTALAMASI = " + (averageOfDividibleTwo));


    	int totalNumbersOfDiviidibleThreeAndFour = 0;
    	int countThreeAndFour = 0;
    	double averageOfDividibleThreeAndFour;
    	System.out.println();
		System.out.print("3 VE 4'E TAM BÖLÜNEN SAYILAR : ");
    	for (int i = 1 ; i <= enteredLastNumber ; i++ ) {
    		while(i % 3 == 0 && i % 4 == 0) {
    			System.out.print(i + " ");
    			totalNumbersOfDiviidibleThreeAndFour = totalNumbersOfDiviidibleThreeAndFour + i;
    			countThreeAndFour++;
    			break;
    		}
    	}
    	if (countThreeAndFour < 1) {
    		countThreeAndFour = 1;
    	}
    	System.out.println();
    	averageOfDividibleThreeAndFour = totalNumbersOfDiviidibleThreeAndFour / countThreeAndFour;
    	System.out.println("3 ve 4'E BÖLÜNENLERİN ORTALAMASI = " + (averageOfDividibleThreeAndFour));

    }
}



import java.util.Scanner;

public class ChineseZodiacFinder {

    public static void main(String[] args) {
    
    	int birthYear;

    	Scanner keybInput = new Scanner(System.in);
    	System.out.print("Enter Your Birth Year : ");
    	birthYear = keybInput.nextInt();

    	System.out.print("Your Chinese Zodiac : " + findZodiac(birthYear));


    }

    public static int calculateZodiacCode(int birthYear) {    	
    	int zodiacCode = birthYear % 12;
    	return zodiacCode;
    }

    public static String findZodiac(int birthYear) {
    	String returnString = null;
    	int zodiacCode;

    	zodiacCode = calculateZodiacCode(birthYear);

    	switch (zodiacCode) {
			case 1 :
				returnString = "Rooster";
				break;
			case 2 :
				returnString = "Dog";
				break;
			case 3 :
				returnString = "Pig";
				break;
			case 4 :
				returnString = "Rat";
				break;
			case 5 :
				returnString = "Ox";
				break;
			case 6 :
				returnString = "Tiger";
				break;
			case 7 :
				returnString = "Rabbit";
				break;
			case 8 :
				returnString = "Dragon";
				break;
			case 9 :
				returnString = "Snake";
				break;
			case 10 :
				returnString = "Horse";
				break;
			case 11 :
				returnString = "Goat";
				break;
			case 0 :
				returnString = "Monkey";
				break;    		
			default:
				break;
		}
		return returnString;

    }
}



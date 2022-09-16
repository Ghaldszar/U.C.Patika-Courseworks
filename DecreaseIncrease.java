import java.util.Scanner;

public class DecreaseIncrease {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Girin : ");
        int number = input.nextInt();
        System.out.print("Çıktı -->  ");
        decreaseIncreaseBy5(number);
    }

    private static void decreaseIncreaseBy5(int number) {
        System.out.print(number + " ");
        if (number <= 0) return;
        decreaseIncreaseBy5(number - 5);
        System.out.print(number + " ");
    }
}
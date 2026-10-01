import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        
        // Handle negative numbers by taking the absolute value
        int number = Math.abs(sc.nextInt());
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            sum += number % 10; 
            number = number / 10; 
        }

        System.out.println("The sum of digits of " + originalNumber + " is: " + sum);
        sc.close();
    }
}

import java.util.Scanner;
public class stringlenght {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int a = input.length();
        System.out.println("The length of the string is: " + a);

        sc.close();
    }
}

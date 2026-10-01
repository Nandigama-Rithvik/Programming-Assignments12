import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int sum = sc.nextInt();
        for(int i = 1; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum of number from 1 to "+n+" = "+sum);
    }
}
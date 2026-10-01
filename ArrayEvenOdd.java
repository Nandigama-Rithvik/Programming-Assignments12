public class ArrayEvenOdd{
    public static void main(String[] args) {
        int[] numbers = {23, 55, 54, 9, 76, 66, 2, 91};
        
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Even elements count: " + evenCount);
        System.out.println("Odd elements count: " + oddCount);
    }
}

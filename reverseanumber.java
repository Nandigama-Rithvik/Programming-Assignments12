class reverseanumber {
    public static void main(String[] args) {
        int num = 12345; // Number to be reversed
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append digit to reversed number
            num /= 10; // Remove the last digit from num
        }

        System.out.println("Reversed Number: " + reversedNum);
    }
}
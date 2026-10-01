public class numberpattern {
    public static void main(String[] args) {
        int rows = 5; // Total number of rows to print

        // Outer loop controls the rows
        for (int i = 1; i <= rows; i++) {
            
            // Inner loop controls the numbers printed in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Move to the next line after each row finishes
            System.out.println();
        }
    }
}

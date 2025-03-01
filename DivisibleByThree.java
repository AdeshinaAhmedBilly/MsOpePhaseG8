public class DivisibleByThree {
    public static int sumDivisibleByThree() {
        int sum = 0; // Initialize sum to 0
        for (int i = 1; i <= 30; i++) { // Loop from 1 to 30
            if (i % 3 == 0) { // Check if divisible by 3
                sum += i; // Add to sum
            }
        }
        return sum; // Return the result
    }

    public static void main(String[] args) {
        System.out.println(sumDivisibleByThree()); // Test the function
    }
}
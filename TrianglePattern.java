public class TrianglePatterns {
    public static String printTriangles() {
        StringBuilder result = new StringBuilder();
        int rowCount = 10; // Number of rows in the pattern

        for (int i = 1; i <= rowCount; i++) {
            // Pattern (a) - Left-aligned increasing
            for (int j = 1; j <= i; j++) {
                result.append('*');
            }
            result.append("   "); // Space between patterns

            // Pattern (b) - Right-aligned decreasing
            for (int j = 1; j <= (rowCount - i + 1); j++) {
                result.append('*');
            }
            result.append("   ");

            // Pattern (c) - Left-aligned decreasing
            for (int j = 1; j <= (rowCount - i + 1); j++) {
                result.append('*');
            }
            result.append("   ");

            // Pattern (d) - Right-aligned increasing
            for (int j = 1; j <= i; j++) {
                result.append('*');
            }

            result.append("\n"); // Move to the next line
        }

        return result.toString();
    }

    // Unit test
    public static void main(String[] args) {
        System.out.println(printTriangles()); // Print the patterns
    }
}

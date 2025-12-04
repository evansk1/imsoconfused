public class practiceprogramming3 {

    // Function to sum values based on a condition defined by f
    public static double sumIf(double[] arr, Condition f) {
        double sum = 0;
        
        // Iterate through the array and sum values for which f(v) is true
        for (double v : arr) {
            if (f.test(v)) {
                sum += v;
            }
        }
        
        return sum;
    }

    // Interface for condition function (like the predicate)
    @FunctionalInterface
    public interface Condition {
        boolean test(double v);
    }

    // Optional main method to test the sumIf function
    public static void main(String[] args) {
        double[] arr = {3.5, 1.2, 7.8, 4.6, 2.9};

        // Example: Sum all even numbers (for simplicity, assume a value is "even" if divisible by 2)
        double result = sumIf(arr, v -> v % 2 == 0); // Passing a lambda function as the condition
        System.out.println("Sum of even numbers: " + result);

        // Example: Sum all values greater than 4
        result = sumIf(arr, v -> v > 4); // Lambda to check if the number is greater than 4
        System.out.println("Sum of numbers greater than 4: " + result);
    }
}
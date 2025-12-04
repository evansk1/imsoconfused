public class practicejava4 {

    // Function to return the nth Fibonacci number
    public static int fib(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Iterative approach to find the nth Fibonacci number
        int a = 0; // F(0)
        int b = 1; // F(1)
        int fib = 0;

        // Start loop from 2 to n to calculate Fibonacci number
        for (int i = 2; i <= n; i++) {
            fib = a + b; // F(i) = F(i-1) + F(i-2)
            a = b;       // Move forward in the sequence
            b = fib;     // Move forward in the sequence
        }

        return fib; // Return the nth Fibonacci number
    }

    // Optional main method to test the fib function
    public static void main(String[] args) {
        int n = 10; // Example: Find the 10th Fibonacci number
        int result = fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}

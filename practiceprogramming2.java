public class practiceprogramming2 {

    // Function to return the larger of two doubles
    public static double max(double a, double b) {
        return (a > b) ? a : b; // Ternary operator to return the larger of a and b
    }

    // Function to return the largest number in the array using the max function
    public static double maxArray(double[] arr) {
        // Assume the first element is the largest initially
        double maxVal = arr[0];
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Compare the current element with the current max value
            maxVal = max(maxVal, arr[i]); // Use max function for comparison
        }
        
        return maxVal; // Return the largest value
    }
}
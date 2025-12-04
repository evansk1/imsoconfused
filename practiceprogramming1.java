public class practiceprogramming1 {

    // Function to return the larger of two doubles
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Optional main method to test the max function
    public static void main(String[] args) {
        double num1 = 5.4;
        double num2 = 7.8;

        double result = max(num1, num2);
        System.out.println("The larger number is: " + result);
    }
}
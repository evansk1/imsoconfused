public class practicejava2 {

    // Function to reverse an array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length]; // Create a new array for the reversed elements
        
        // Loop to copy elements from arr to reversed in reverse order
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i]; // Set reversed array element to arr element from the end
        }
        
        return reversed; // Return the reversed array
    }

    // Optional main method to test the reverseArray function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Call reverseArray
        int[] reversed = reverseArray(arr);
        
        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}
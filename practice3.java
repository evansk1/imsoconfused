public class practice3 {

    // Function to sum all elements in a 2D double array
    public static double sumGrid(double[][] grid) {
        double sum = 0;

        // Nested for loops to iterate over all rows and columns
        for (int i = 0; i < grid.length; i++) { // Loop through rows
            for (int j = 0; j < grid[i].length; j++) { // Loop through columns in each row
                sum += grid[i][j]; // Add the element at grid[i][j] to the sum
            }
        }

        return sum; // Return the total sum of all elements
    }

    // Optional main method to test the sumGrid function
    public static void main(String[] args) {
        // Example 2D array
        double[][] grid = {
            {1.5, 2.5, 3.0},
            {4.5, 5.0, 6.5},
            {7.0, 8.5, 9.5}
        };

        // Calculate the sum of the grid
        double total = sumGrid(grid);
        System.out.println("The sum of all elements in the grid is: " + total);
    }
}

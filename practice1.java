public class practice1 {
    public static void practice1(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int n = 2;
        int count = countOccurrences(arr, n);
        System.out.println("The number " + n + " appears " + count + " times.");
    }

    public static int countOccurrences(int[] arr, int n) {
        int count = 0;
        for (int num : arr) {
            if (num == n) {
                count++;
            }
        }
        return count;
    }
}

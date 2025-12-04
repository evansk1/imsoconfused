public class Main {
    public static void main(String[] args) {
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
public static int[] reverseArray(int[] arr) {
    int[] reversed = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        reversed[i] = arr[arr.length - 1 - i];
    }
    return reversed;
}

}

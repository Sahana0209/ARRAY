public class odd_indices {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println("Elements at odd indices: ");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

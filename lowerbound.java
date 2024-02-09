
public class lowerbound {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 30, 40, 50, 60, 70 };

        int x = 30;
        int ans = 8;
        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (x <= arr[mid]) {
                ans = Math.min(ans, mid);
                high = mid - 1;
            } else
                low = mid + 1;
        }

        System.out.println("Lower bound for " + x + " is : " + ans);
    }
}

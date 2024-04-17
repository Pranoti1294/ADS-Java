import java.util.ArrayList;
import java.util.List;

public class SubarraysDivisibleByA {
    public static void main(String[] args) {
        int[] array = {5, 6, 2, 3, 4, 1, 0, 10};
        int a = 5;
        List<List<Integer>> result = findSubarrays(array, a);
        System.out.println("Subarrays whose elements' sum is divisible by " + a + ":");
        for (List<Integer> subarray : result) {
            System.out.println(subarray);
        }
    }

    // Function to find subarrays whose elements' sum is divisible by 'a'
    public static List<List<Integer>> findSubarrays(int[] array, int a) {
        List<List<Integer>> result = new ArrayList<>();
        int sum = 0;
        int start = 0;
        for (int end = 0; end < array.length; end++) {
            sum += array[end];
            while (sum % a == 0) {
                result.add(getSubarray(array, start, end));
                sum -= array[start++];
            }
        }
        return result;
    }

    // Function to get a subarray from the original array
    private static List<Integer> getSubarray(int[] array, int start, int end) {
        List<Integer> subarray = new ArrayList<>();
        for (int i = start; i <end; i++) {
            subarray.add(array[i]);
        }
        return subarray;
    }
}

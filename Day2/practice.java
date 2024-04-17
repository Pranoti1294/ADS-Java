import java.util.ArrayList;
import java.util.List;

public class practice {


    public static void main(String[] args) {
        int[] array = {5, 6, 2, 3, 4, 1, 0, 10};
        int a = 5;

         List<List<Integer>> result = findSubarrays(array, a);
        
        for (List<Integer> subarray : result) {
            System.out.println(subarray);
        }
    }

    private static List<List<Integer>> findSubarrays(int[] array,int a) 
    {
        List<List<Integer>> result = new ArrayList<>();
        int sum = 0;
        for (int start = 0; start < array.length; start++) {
            sum = array[start];
            for (int end = start + 1; end <= array.length; end++) {
                if (sum % a == 0 && end - start > 1) {
                    result.add(getSubarray(array, start, end - 1)); // Adjust end index
                }
                if (end < array.length) {
                    sum += array[end];
                }
            }
        }
        return result;
    }

    private static List<Integer> getSubarray(int[] array, int start, int end) {
        List<Integer> subarray = new ArrayList<>();
        for (int i = start; i <=end; i++) {
            subarray.add(array[i]);
        }
        return subarray;
    }
}

public class Ass2_4 {
    public static void main(String[] args) {
        int[] arr = {3,6,2,4,1};
        System.out.println(sumOfArray(arr,0));
    }
    private static int sumOfArray(int[] arr, int i) {
       
        if(i==arr.length-1)
        {
            return arr[i];
        }
        return arr[i]+sumOfArray(arr, i+1);
    }
}

public class Ass2_3 
{
    public static void main(String[] args) 
    {
        int[] arr = {3,6,2,4,1};
        System.out.println(findAverage(arr,0)/arr.length);
    }

    private static int findAverage(int[] arr, int i) {
       
        if(i==arr.length-1)
        {
            return arr[i];
        }
        return arr[i]+findAverage(arr, i+1);
    }
}

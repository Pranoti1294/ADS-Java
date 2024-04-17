public class demoHSort {
 
    public static void main(String[] args) {
        
        int [] arr = {55,77,88,33,11,55};
        heapSort(arr);
    }

    private static void heapSort(int[] arr) {
        
        int n = arr.length;

        for(int i = n/2-1 ; i>=0;i--)
        {
            heapify(arr,n,i);
        }

        for(int i=n;i>0;i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
       
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left > n && arr[left] > arr[largest])
            largest = left;

        if(right>n && arr[right] > arr[largest])
            largest = right;

        if(largest != i)
        {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] =temp;

            heapify(arr, n, largest);
        }
    }
}
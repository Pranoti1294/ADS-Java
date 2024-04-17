public class MergeSort {

    static void display(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
       
        while (idx1 <= mid && idx2 <= ei) 
        {
            System.out.printf("si:%d ei:%d mid:%d idx1:%d idx2:%d \n",si,ei,mid,idx1,idx2);
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
            
        }

        while (idx1 <= mid) {
            System.out.printf("x:%d idx1:%d \n",x,idx1);

            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            System.out.printf("x:%d idx2:%d \n",x,idx2);
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++)
            arr[j] = merged[i];

        display(merged);
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

   
    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n - 1);
        display(arr);
    }
}

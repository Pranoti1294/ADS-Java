class QSort {
    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partition(int []a, int low, int high) 
    {
        int pivot = a[low];
        int start = low;
        int end = high;

        while (start < end) 
        {
            while (a[start] <= pivot && start < high) 
            {
                start++;
            }
            while (a[end] > pivot) 
            {
                end--;
            }

            if (start < end) 
            {
                swap(a, start, end);
            }
        }
        swap(a, low, end);
        return end;
    }

    static void quickSort(int []a, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(a, low, high);
            quickSort(a, low, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, high);
        }
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] = {10,80,30,90,40,50,70};
        quickSort(a, 0, a.length - 1);
        printArray(a, a.length);
    }
}

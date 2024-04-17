public class InsertionSort 
{
    static void insertionSort(int []a)
    {
        for(int i=1; i<a.length; i++)
        {
            int key = a[i];
            int j = i-1;

            while ((j >= 0 && key < a[j])) 
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;

        }
    }

    private static void display(int[] a) 
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) 
    { 
        int a [] ={55,33,22,66,11};
        display(a); 
        insertionSort(a);
        System.out.println();
        display(a);
    }

}

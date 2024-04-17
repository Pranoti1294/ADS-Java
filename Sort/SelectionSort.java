public class SelectionSort 
{ 

    static void selectionSort(int []a)
    {
        for(int i=0; i<a.length-1; i++)
        {
            int min = i;
            for(int j=i+1; j<a.length; j++)
            {
                if(a[j] < a[min])
                    min = j;

            }
                
   
            int temp = a[min];
                a[min] = a[i];
                a[i] = temp;

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
        selectionSort(a);
        System.out.println();
        display(a);

    }

}

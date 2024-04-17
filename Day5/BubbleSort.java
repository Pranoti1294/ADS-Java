
public class BubbleSort 
{

    static void bubbleSort(int []arr)
    {
        int l = arr.length;
        boolean flag = false;
        for(int i=0; i<l-1; i++)
        {
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                     
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if(flag == false)
                break;
        }
    }

    
    private static void display(int[] a) {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        int a [] ={55,33,22,66,11};

        display(a);
        bubbleSort(a);
        System.out.println();
        display(a);

    }

   
}
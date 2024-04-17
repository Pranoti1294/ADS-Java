public class StringBubbleSort 
{
    static void bubbleSort(String str) {
        char[] arr = str.toCharArray();
        int l = arr.length;
        boolean flag;
        for (int i = 0; i < l - 1; i++) {
            flag = false;
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) 
                break;
        }
        
        System.out.println("Sorted string: " + new String(arr));
    }
    
    public static void main(String[] args) 
    {
        
        String str = "nmhgdr";
        bubbleSort(str);
    }

    
}

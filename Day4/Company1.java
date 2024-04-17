
/*
 * 
 *int a[] = {0,1,1,0,0,1,1,0,0,0,0,1,1,1,1};
    the sub array which has same number of 0 and 1 in it
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class Company1 {

    public static void main(String[] args) {
        
        int a[] = {0,1,1,0,0,1,1,0,0,0,0,1,1,1,1};

        findArraySequence(a);
    } 
    
    private static void findArraySequence(int[] a) {
       int res[] ;
        for (int i=0;i<a.length;i++)
        {
            if(a[i]!=a[i+1])
                res= new int[2];
                calculationArrayElement(a[i],a[i+1]);
                

        }
       
    }

    private static void calculationArrayElement(int... n) {
        
        
    }


    
}

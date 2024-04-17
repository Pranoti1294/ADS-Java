
import java.io.*;
import java.util.*;

public class fibonacci {

    static int fibo(int num)
    {
        if(num<=1)
            return num;
        return fibo(num-1)+fibo(num-2);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        List<Integer> a = new ArrayList<Integer>();
        
        for(int i=0; i<=num;i++)
        {
            int n=fibo(i);
            if(n<=num)
            {
                a.add(n);
            }

            
        }
       
        System.out.println(a);
    }
    
}


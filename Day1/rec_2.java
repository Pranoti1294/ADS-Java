public class rec_2 {

    static long fibo(int n)
    {

        if(n<=1)
            return n;
        else
            return (long)fibo(n-1)+fibo(n-2); 
    }

    public static void main(String[] args) {
        
        for (int i=0;i<=10;i++)
        {
            System.out.println(i+" " +fibo(i));
        }
    }
}

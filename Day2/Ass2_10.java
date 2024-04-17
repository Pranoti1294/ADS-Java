public class Ass2_10 {
    public static void main(String[] args) {
        int num = 10;
        for( int i = num-1; i >= 0 ; i--)
        {
            System.out.println(fibo(i));
        }
    }

    private static int fibo(int num) {
       if(num == 0 || num == 1)
            return num;
        return fibo( num - 1) + fibo(num - 2);
    
    }
}

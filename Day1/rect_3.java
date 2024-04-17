public class rect_3 {

    static int fact(int n)
    {
        if(n>=1)
        {
            return n*fact(n-1);
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) {
        
        int n=5;
        System.out.println("Factorial of number : " +fact(n));

    }
    
}

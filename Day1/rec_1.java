public class rec_1 {

    static int table(int n)
    {

        if(n==0)
            return 0;
        else
            return 8+table(n-1); 
    }

    public static void main(String[] args) 
    {
        
        for (int i=1;i<=10;i++)
        {
            System.out.println(table(i));
        }
    }
}

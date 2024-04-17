
public class Ass1_3 {

    
    static void prime(int n, int i)
    {
        if (n==1)
            return ;
        if(n%i==0)
        {
            System.out.println(n+" ");
            n/=i;
        }
        else{
            i++;
        }
        prime(n, i);
        
    }

    public static void main(String[] args) {
        
        prime(6,2);
    }
}

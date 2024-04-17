
public class TowerOfHanoi {
    public static void main(String[] args) {
        
        hanoi(3,'A','B','C');
    }

    private static void hanoi(int n, char s, char a, char d) {
       if(n==1)
       {
            System.out.println(s+" "+d);
       }
       else
       {
            hanoi(n, s, d, a);
            System.out.println(s+" "+d);
            hanoi(n, a, s, d);
       }
       
    }
    
}
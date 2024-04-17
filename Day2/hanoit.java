

class hanoit {

    private static void hanoi(int n, char s, char a, char d) 
    {
        if(n==1)
        {
             System.out.print("{"+s+","+d+"}  ");
        }
        else
        {

            hanoi(n-1, s, d, a);
            System.out.print("{"+s+","+d+"}  ");
            hanoi(n-1, a, s, d);

        }
        
     }

    public static void main(String[] args) 
    {
        hanoi(3,'A','B','C');
    }
}

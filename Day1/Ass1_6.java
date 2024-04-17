public class Ass1_6 {
    public static void main(String[] args) {
        

        int num = 123;
        if(isArmstrong(num))
        {
            System.out.println("It is Armstrong ");
        }
        else
        {
            System.out.println("It is not Armstrong ");
        }
    }

    private static boolean isArmstrong (int num) {
        int rev=reverseNumber(num);
        return num==rev;

    }
    private static int reverseNumber(int num)
    {
        return reverseNumber(num,0);
    }

    private static int reverseNumber(int num, int rev) {
       if(num==0)
            return rev;
        return reverseNumber(num/10, rev+(int)Math.pow((num%10), 3));
        
    }
}

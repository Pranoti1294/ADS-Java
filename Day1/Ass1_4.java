public class Ass1_4 {

    
    public static void main(String[] args) {
        int number=123;
        boolean b = isPalindrome(number);
        if(b)
        {
            System.out.println("It is palindrome.......");
        }
        else
        {
            System.out.println("It is not palindrome.......");
        }
        
    }

    private static boolean isPalindrome(int num) {
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
        return reverseNumber(num/10, rev*10+num%10);
        
    }
    
}

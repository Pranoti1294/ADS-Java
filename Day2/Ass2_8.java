public class Ass2_8 {
    public static void main(String[] args) {
        String a = "aba";
        System.out.println("Reverse string is: " + isPalindrome(a) );
    }

    private static boolean isPalindrome(String str)
    {
        String target = str;
        return target.equals(reverseString(str, str.length())) ;
    }
    private static String reverseString(String a, int length) {
        if(a.length() == 0)
            return "";
        //System.out.println(a.charAt(length-1));
        return a.charAt(length-1) + reverseString(a.substring(0, length-1), length-1);
    } 
}

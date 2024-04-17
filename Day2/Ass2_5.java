public class Ass2_5 {

    public static void main(String[] args) {
        String a = "abcd";
        System.out.println("Reverse string is: " + reverseString(a, a.length()));

    }

    private static String reverseString(String a, int length) {
        if(a.length() == 0)
            return "";
        //System.out.println(a.charAt(length-1));
        return a.charAt(length-1) + reverseString(a.substring(0, length-1), length-1);
    }   
}

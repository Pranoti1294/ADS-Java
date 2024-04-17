public class Ass2_6 {
    public static void main(String[] args) {
        String a = "abcd";
        System.out.println(findLengthOfString(a));
    }

    private static int findLengthOfString(String a) 
    {
        if(a.equals(""))
            return 0;
        return 1 + findLengthOfString(a.substring(1));   
    }
}

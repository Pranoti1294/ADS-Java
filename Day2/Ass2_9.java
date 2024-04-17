public class Ass2_9 {
    public static void main(String[] args) {
        
        int num = 11 ;
        String conversion = decimalToBinary(num);
        System.out.println(conversion);
    }

    private static String decimalToBinary(int decimal) 
    {
       
        if (decimal == 0) {
            return "";
        }
        
        return decimalToBinary(decimal / 2) + (decimal % 2);
    }
}

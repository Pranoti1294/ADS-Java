public class Ass2_11 {
    public static void main(String[] args) {
        
        int num = 1234;
        System.out.println(sumOfDigits(num));
    }

    private static int sumOfDigits(int num) {
        if(num == 0)
            return num % 10;
        return ( num % 10 ) + sumOfDigits(num / 10);
    } 
}

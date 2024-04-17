public class Ass1_9 {
    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 284;

        if(isAmicableNumber(num1,num2))
        {
            System.out.println("Amicable Number");
        }
        else
        {
            System.out.println("Not Amicable Number");
        }

    }

    private static boolean isAmicableNumber(int num1, int num2) {
        int sum1 = itsDivisorSum(num1,num1-1);
        int sum2 = itsDivisorSum(num2,num1-1);

        return sum1 == num2 && sum2 == num1 && num1 != num2;
    }

    private static int itsDivisorSum(int num1, int divisor) {
        
        if( divisor == 0 )
            return 0;
        if( num1 % divisor == 0 )
            return divisor + itsDivisorSum(num1, divisor-1);
        return itsDivisorSum(num1, divisor-1);
    }
}

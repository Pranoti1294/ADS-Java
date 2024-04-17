public class Ass1_7 {
    public static void main(String[] args) {

        int num = 6;
        if(isPerfect(num))
        {
            System.out.println("It is perfect number ");
        }
        else
        {
            System.out.println("It is not perfect number ");
        }
        
    }

    public static boolean isPerfect(int number) {
        if (number <= 1)
            return false;
        return number == sumOfFactors(number, 1);
    }

    
    public static int sumOfFactors(int number, int d) {
        if (d > number / 2)
            return 0;
        if (number % d == 0)
            return d + sumOfFactors(number, d + 1);
        else
            return sumOfFactors(number, d + 1);
    }
}

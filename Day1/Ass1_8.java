import java.util.Scanner;

public class Ass1_8 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        if (isPrime(number, number / 2)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int number, int divisor) {
       
        if (number <= 1) {
            return false; 
        }
        if (divisor == 1) {
            return true; 
        }
       
        if (number % divisor == 0) {
            return false; 
        }
       
        return isPrime(number, divisor - 1);
    }
    
}

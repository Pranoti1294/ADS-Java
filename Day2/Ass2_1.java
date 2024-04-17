import java.util.Scanner;

public class Ass2_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        printNumber(1,num);
    }

    private static void printNumber(int start, int end) {
        
        if (start > end) {
            return; 
        }
        System.out.println(start); 
        printNumber(start + 1, end);
    }
}

import java.util.Scanner;

public class Ass2_2 {

    private static int sumOfNaturalNumbers(int start, int end) {
        
        if (start ==  end) {
            return end; 
        }
         
        return start+ sumOfNaturalNumbers(start + 1, end);
    }

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        int num = 5;

        System.out.println(sumOfNaturalNumbers(1,num));
    }
}

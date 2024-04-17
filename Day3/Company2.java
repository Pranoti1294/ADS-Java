import java.util.*;

public class Company2 {
    public static void main(String[] args) {
        
        int[] array = {5, 6, 2, 3, 4, 1, 0, 10};
        int a = 5;
        ArrayList<ArrayList<Integer>> list = subArrays(array, a);

        for(ArrayList<Integer> innerArray : list){
            for(int element : innerArray){
                System.out.print(element + ", ");
            }
            System.out.println();
        }
    }

    static ArrayList<ArrayList<Integer>> subArrays(int[] array, int target){
        int leftPointer = 0;
        int rightPointer = 0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int sum = 0;
        for(; rightPointer < array.length; ++rightPointer){
            sum = sum + array[rightPointer];

            if(sum == target){
                ArrayList<Integer> subList = new ArrayList<>(2);
                subList.add(leftPointer);
                subList.add(rightPointer);
                list.add(subList);

                sum = sum - array[leftPointer];

                ++leftPointer;
            }
            else if(sum > target){
                sum = sum - array[leftPointer];

            ++leftPointer;
            
            }
        }

        return list;
    }

}

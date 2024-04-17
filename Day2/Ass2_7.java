public class Ass2_7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateSum(array, array.length-1, 0);
        System.out.println("Sum of array elements: " + sum);
    }

    private static int calculateSum(int[] array, int index, int partialSum) {
        if(index == 0)
            return partialSum;
        //System.out.println(partialSum + array[index]);
        return  calculateSum(array, index - 1, partialSum + array[index]);
    }
}

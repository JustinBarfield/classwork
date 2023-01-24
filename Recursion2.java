public class Recursion2 {

    private static int[] intArray = { 2, 7, 3, 8, 10 };

    /**
     * recursively adds up numbers
     * 
     * @param index must be an integer in the array
     * @return an integer representing the sum of the array elements
     */
    public static int sumByHead(int index) {
        if (index == intArray.length - 1) {
            return intArray[index];
        } else {
            int previousSum = sumByHead(index + 1);
            return previousSum + intArray[index];
        }
    }

    public static int sumByTail(int index, int sum) {
        if (index == intArray.length - 1) {
            return sum + intArray[index];
        } else {
            sum = sum + intArray[index];
            return sumByTail(index + 1, sum);
        }
    }

    public static void main(String[] args) {

        System.out.println(sumByHead(0));
        System.out.println(sumByTail(0, 0));

    }
}
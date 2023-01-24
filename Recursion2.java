public class Recursion2 {

    private static int[] intArray = { 2, 7, 3, 8, 10 };

    public static int sumByHead(int index) {
        if (index == intArray.length - 1) {
            return intArray[index];
        } else {
            int previousSum = sumByHead(index + 1);
            return previousSum + intArray[index];
        }
    }

    public static void main(String[] args) {

        System.out.println(sumByHead(0));

    }
}
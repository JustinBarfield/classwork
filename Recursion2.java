public class Recursion2 {

    private static int[] intArray = { 2, 7, 3, 20, 8, 10 };
    private static int[] sorted = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22 };

    public static int binarySearch(int key, int left, int right) {
        if (right == left) {
            return sorted[left];
        } else {
            int middle = (left + right) / 2;
            if (sorted[middle] == key)
                return middle;
            else if (sorted[middle] < key) {
                left = middle+1;
               
            }
            else //(sorted[middle] > key)
            {
                right = middle-1;
            }
            return binarySearch(key, left, right);

        }
    }

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

    public static int maxByHead(int index) {
        if (index == intArray.length - 1) {
            return intArray[index];
        } else {
            int previousMax = maxByHead(index + 1);
            return Math.max(previousMax, intArray[index]);
        }
    }

    public static int maxByTail(int index, int max) {
        if (index == intArray.length - 1) {
            return Math.max(max, intArray[index]);
        } else {
            max = Math.max(max, intArray[index]);
            return maxByTail(index + 1, max);
        }
    }

    public static void main(String[] args) {

        // System.out.println(sumByHead(0));

        // System.out.println(sumByTail(0, 0));
       // System.out.println(maxByHead(0));
        //System.out.println(maxByTail(0, intArray[0]));
        System.out.println(binarySearch(16,0,sorted.length-1));
    }
}
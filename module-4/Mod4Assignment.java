/*Mark White
  CSD402
  Mod4Assignment*/

public class Mod4Assignment {
    public static short average(short[] array) {
        if (array.length == 0) return 0;
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short)(sum / array.length);
    }

    public static int average(int[] array) {
        if (array.length == 0) return 0;
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        if (array.length == 0) return 0;
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        if (array.length == 0) return 0;
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void printArray(String type, Object array) {
        System.out.print(type + " Array: [");
        if (array instanceof short[]) {
            short[] arr = (short[])array;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
            }
        } else if (array instanceof int[]) {
            int[] arr = (int[])array;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
            }
        } else if (array instanceof long[]) {
            long[] arr = (long[])array;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
            }
        } else if (array instanceof double[]) {
            double[] arr = (double[])array;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Test arrays of different sizes
        short[] shortArray = {1, 2, 3};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100, 200, 300, 400, 500};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Testing short array
        System.out.println("\n=== Short Array Test ===");
        printArray("Short", shortArray);
        System.out.println("Average: " + average(shortArray));

        // Testing int array
        System.out.println("\n=== Integer Array Test ===");
        printArray("Integer", intArray);
        System.out.println("Average: " + average(intArray));

        // Testing long array
        System.out.println("\n=== Long Array Test ===");
        printArray("Long", longArray);
        System.out.println("Average: " + average(longArray));

        // Testing double array
        System.out.println("\n=== Double Array Test ===");
        printArray("Double", doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }
}
/*Mark White
CSD402
Mod5Assignment*/

public class Mod5Assignment {
    public static int[] locateLargest(double[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{0, 0};
        }
        
        int[] location = {0, 0};
        double largest = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
    
    public static int[] locateLargest(int[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{0, 0};
        }
        
        int[] location = {0, 0};
        int largest = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{0, 0};
        }
        
        int[] location = {0, 0};
        double smallest = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
    
    public static int[] locateSmallest(int[][] arrayParam) {
        if (arrayParam == null || arrayParam.length == 0 || arrayParam[0].length == 0) {
            return new int[]{0, 0};
        }
        
        int[] location = {0, 0};
        int smallest = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        //test methods
        double[][] testDouble = {{1.5, 2.3, 3.1}, {4.2, 5.7, 0.8}, {9.4, 1.2, 7.5}};
        int[][] testInt = {{1, 2, 3}, {4, 9, 6}, {7, 8, 5}};
        
        int[] doubleResult = locateLargest(testDouble);
        int[] intResult = locateLargest(testInt);
        
        System.out.println("Largest element in double array at: [" + doubleResult[0] + "][" + doubleResult[1] + "]");
        System.out.println("Largest element in int array at: [" + intResult[0] + "][" + intResult[1] + "]");

        int[] doubleSmallest = locateSmallest(testDouble);
        int[] intSmallest = locateSmallest(testInt);
        
        System.out.println("Smallest element in double array at: [" + doubleSmallest[0] + "][" + doubleSmallest[1] + "]");
        System.out.println("Smallest element in int array at: [" + intSmallest[0] + "][" + intSmallest[1] + "]");

       
    }
}
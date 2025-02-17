/**
 Mark White
 CSD-402
 Assignment8.2
 */
import java.util.ArrayList;
import java.util.Scanner;

public class WhiteArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (enter 0 to finish):");
        
        while (true) {
            int input = scanner.nextInt();
            list.add(input);
            if (input == 0) {
                break;
            }
        }
        
        Integer largestValue = max(list);
        System.out.println("The largest value is: " + largestValue);
    }
    
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        
        Integer maxValue = list.get(0);
        for (Integer value : list) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
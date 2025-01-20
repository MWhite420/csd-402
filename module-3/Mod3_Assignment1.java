/*Mark White
CSD402
Mod3_Assignment1*/

public class Mod3_Assignment1 {
    public static void main(String[] args) {
        int rows = 7;
        
        for (int i = 0; i < rows; i++) {
            // Print leading spaces based on row number
            int leadingSpaces;
            switch(i) {
                case 0: leadingSpaces = 7; break;
                case 1: leadingSpaces = 6; break;
                case 2: leadingSpaces = 5; break;
                case 3: leadingSpaces = 4; break;
                case 4: leadingSpaces = 3; break;
                case 5: leadingSpaces = 2; break;
                case 6: leadingSpaces = 1; break;
                default: leadingSpaces = 0;
            }
            
            // Print leading spaces
            for (int space = 0; space < leadingSpaces * 2; space++) {
                System.out.print(" ");
            }
            
            // Print first half of numbers (increasing)
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num *= 2;
            }
            
            // Print second half of numbers (decreasing)
            num /= 4;
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num /= 2;
            }
            
            // Print spaces before @ based on row number
            int trailingSpaces;
            switch(i) {
                case 0: trailingSpaces = 18; break;
                case 1: trailingSpaces = 16; break;
                case 2: trailingSpaces = 14; break;
                case 3: trailingSpaces = 12; break;
                case 4: trailingSpaces = 9; break;
                case 5: trailingSpaces = 5; break;
                case 6: trailingSpaces = 1; break;
                default: trailingSpaces = 0;
            }
            
            for (int space = 0; space < trailingSpaces; space++) {
                System.out.print(" ");
            }
            
            System.out.println("@");
        }
    }
}


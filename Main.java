import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        
        int half = n;
        
        for (int i = 0; i < half; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            
            for (int j = 0; j < 2 * (half - i - 1); j++) {
                System.out.print("  ");
            }
            
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        for (int i = half - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            
            for (int j = 0; j < 2 * (half - i - 1); j++) {
                System.out.print("  ");
            }
            
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
/In - 4
/
/Out -
/*            *
/ **        **
/  ***    ***
/   ********
/   ********
/  ***    ***
/ **        **
/*            *

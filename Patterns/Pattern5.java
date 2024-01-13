
import java.util.Scanner;

class Pattern5 {
    static void printpattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move this line outside the inner loop
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            printpattern(n);
        }
    }

}
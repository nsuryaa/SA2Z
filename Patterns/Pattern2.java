
import java.util.Scanner;

class Pattern2 {
    static void printpattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
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
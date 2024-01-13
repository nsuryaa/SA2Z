/*
 * Patterns -> Nested loops
 * 
 * for the outer loop -- count the no of lines
 * 
 * for the inner loop focus on the columns & connect them
 * somehow to the rows
 * 
 * whatever you are printing print them inside the inner for loop
 * 
 * observer symmetry in case of some patterns
 */

import java.util.Scanner;

class Pattern1 {
    static void printpattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
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
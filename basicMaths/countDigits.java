package basicMaths;

class countDigits
{
    public static void main(String[] args) {

        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int N = 8394;
        System.out.println(countDigits(N));
    }
    public static int countDigits(int N) {
        int count = 0;
        while (N != 0) {
            N = N / 10;
            count++;
        }
        return count;
    }
}
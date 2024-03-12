class reverseDigits
{
    public static void main(String[] args) {

        // Here, we have taken the value of N as 5.
        // We can also take input from the user.
        int N = 8394;
        System.out.println(reverseDigits(N));
    }
    public static int reverseDigits(int N)
    {
        int reverse = 0;
        int digit = 0;
        while(N!=0)
        {
            digit = N % 10;
            N = N / 10;
            reverse = reverse * 10 + digit;
        }
        return reverse;
    }
}
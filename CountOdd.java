public class CountOdd {

    public static void main(String[] args) {

        int n = 76543;

        System.out.println(countOdd(n));
    }

    private static int countOdd(int n) {

        int count = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit % 2 != 0) {
                count++;
            }

            n = n / 10;
        }

        return count;
    }
}
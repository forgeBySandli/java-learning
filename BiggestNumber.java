public class BiggestNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 25;    //using if statment
        int c = 15;

        if (a > b && a > c) {
            System.out.println(a + " is the biggest number");
        }

        if (b > a && b > c) {
            System.out.println(b + " is the biggest number");
        }

        if (c > a && c > b) {
            System.out.println(c + " is the biggest number");
        }
    }
}
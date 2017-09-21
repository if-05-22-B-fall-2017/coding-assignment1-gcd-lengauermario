package gcd;

/**
 *
 * @author Mario Lengauer
 */
public class gcd {

    public static void main(String[] args) {
        int a, b, gcdPrimeFactor, gcdEucledian;
        a = 4;
        b = 2;
        gcdPrimeFactor = gcdPrimeFactors(a, b);
        gcdEucledian = gcdEucledian(a, b);
        System.out.printf("Prime Factors of %d, %d: %8d %4d\n", a, b, gcdPrimeFactor, gcdEucledian);
        a = 9;
        b = 7;
        gcdPrimeFactor = gcdPrimeFactors(a, b);
        gcdEucledian = gcdEucledian(a, b);
        System.out.printf("Prime Factors of %d, %d: %8d %4d\n", a, b, gcdPrimeFactor, gcdEucledian);
        a = 4825;
        b = 3235;
        gcdPrimeFactor = gcdPrimeFactors(a, b);
        gcdEucledian = gcdEucledian(a, b);
        System.out.printf("Prime Factors of %d, %d: %2d %4d\n", a, b, gcdPrimeFactor, gcdEucledian);
        a = 852;
        b = 207;
        gcdPrimeFactor = gcdPrimeFactors(a, b);
        gcdEucledian = gcdEucledian(a, b);
        System.out.printf("Prime Factors of %d, %d: %4d %4d\n", a, b, gcdPrimeFactor, gcdEucledian);
    }

    public static int gcdPrimeFactors(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcdPrimeFactors(b, a % b);
        }
    }

    public static int gcdEucledian(int a, int b) {
        if (a == 0) {
            return b;
        }
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

}

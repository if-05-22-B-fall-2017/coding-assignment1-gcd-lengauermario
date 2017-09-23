package gcd;

/**
 *
 * @author Mario Lengauer
 */
public class gcd {

    public static void main(String[] args) {
        int a, b, gcdPrimeFactor, gcdEucledian;
        a = 8;
        b = 4;
        gcdPrimeFactor = gcdPrimeFactors(a, b);
        gcdEucledian = gcdEucledian(a, b);
        System.out.printf("Prime Factors of %d, %d: %8d %4d\n", a, b, gcdPrimeFactor, gcdEucledian);
        a = 9;
        b = 7;
        gcdPrimeFactor = gcdPrimeFactors(a, b);
        gcdEucledian = gcdEucledian(a, b);
        System.out.printf("Prime Factors of %d, %d: %8d %4d\n", a, b, gcdPrimeFactor, gcdEucledian);
        a = 3235;
        b = 4825;
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
        int factor = 2, gcd= 1, divid;
        while (a%b != 0) {
            divid = 0;
            if(a%factor == 0){
                a = a / factor;
                divid++;
            }
            if(b%factor == 0){
                b = b / factor;
                divid++;
            }
            if(divid == 0) factor++;
            if(divid == 2)gcd *= factor;
        }
        return gcd*b;
    }

    public static int gcdEucledian(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdEucledian(b, a % b);
    }

}

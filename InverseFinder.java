package Project ;
public class InverseFinder {
    public static int findInverse(int key) {
        int m = 26; // Modulo value
        int a = key;
        int m0 = m;
        int y = 0, x = 1;

        while (a > 1) {
            int q = a / m;
            int t = m;

            m = a % m;
            a = t;
            t = y;

            y = x - q * y;
            x = t;
        }

        if (x < 0){
            x += m0;
            System.out.println("Inverse of " + key + " mod 26 is: " + x);
        }

        return x;
    }
}

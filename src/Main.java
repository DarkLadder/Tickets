/**
 * Created by BYT9C0D9 on 07.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i=000000; i <= 999999; i++) {
            int gh = i;
            int a, b, c, d, e, f;
            a = gh/100000;
            b = gh/10000%10;
            c = gh/1000%10;
            d = gh/10%100;
            e = gh/10%10;
            f = gh/1%10;
            if (a + b + c == d + e + f) count++;
        }
        System.out.println(count);
    }
}

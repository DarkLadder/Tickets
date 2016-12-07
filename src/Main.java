/**
 * Created by BYT9C0D9 on 07.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        for (int i=0; i <= 999999; i++) {
            int gh = 0;
            int a, b, c, d, e, f;
            a = gh/100000;
            b = gh/10000;
            b = b%10;
            c = gh/1000;
            c = c%10;
            d = gh/100;
            d = d%10;
            e = gh/10;
            e = e%10;
            f = gh/1;
            f = f%10;
            Calc calc = new Calc(a, b, c, d, e, f);
            calc.Calcul();
        }
    }
}

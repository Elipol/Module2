/**
 * Return rounded number  28.01.2017.
 */
public class ExtraTask3 {
    public static void main(String[] args) {
        double n = 43.44374364735;
        int p = (int) n;
        for (int i = 0; i < 10; i++) {
            n = n * 10;
            if ((int) n - ((int) n / 10) * 10 < 4) {
                System.out.println(p);
                break;
            }
            else if ((int) n - ((int) n / 10) * 10 > 4) {
                System.out.println(p+1);
                break;
            }
        }
    }
}


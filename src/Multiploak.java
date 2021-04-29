
import java.util.Arrays;

public class Multiploak {

    public static void main(String[] args) {
        printMultiploak(7, 3);
        for (int i = 1; i < 50; i++) {
            System.out.print("\u2500");
        }
        System.out.println("");

        printMultiploak(2, 11);
        for (int i = 1; i < 50; i++) {
            System.out.print("\u2500");
        }
        System.out.println("");

        System.out.println(Arrays.toString(getMultiploak(3, 20)));
        for (int i = 1; i < 50; i++) {
            System.out.print("\u2500");
        }
        System.out.println("");

        System.out.println(Arrays.toString(getMultiploak(4, 6)));
    }

    public static int[] getMultiploak(int noren, int zenbat) {
        //OSATU METODO HAU
        return null;
    }

    public static void printMultiploak(int noren, int zenbat) {
        //OSATU METODO HAU
    }
}

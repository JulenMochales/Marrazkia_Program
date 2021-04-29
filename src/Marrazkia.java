
import java.util.Scanner;

public class Marrazkia {

    public static void main(String[] args) {
        //IDATZI HEMEN ZURE KODEA
        Scanner in = new Scanner(System.in);
        int altuera = 0;
        int zabalera = 0;

        while (altuera == 0 || altuera < 0) {
            System.out.println("Sartu altuera (zenbaki positiboa) ");
            altuera = in.nextInt();

        }
        while (zabalera == 0 || zabalera < 0) {
            System.out.println("Sartu zabalera (zenbaki positiboa)");
            zabalera = in.nextInt();

        }
        int bukatu = zabalera * altuera;
        int anch = 1;

        for (int zenbakia = 0; zenbakia < bukatu; zenbakia++) {

            System.out.println(zenbakia + 1);
            System.out.print("  ");

            if (zenbakia == zabalera) {
                System.out.println("  ");
            }

        }

    }

}


import java.util.Scanner;

public class Marrazkia {

    public static void main(String[] args) {
        //IDATZI HEMEN ZURE KODEA
        Scanner in = new Scanner(System.in);
        int altuera = 0;
        int zabalera = 0;

        if (altuera == 0) {
            System.out.println("Sartu altuera (zenbaki positiboa) ");
            altuera = in.nextInt();

        }
        while (altuera < 0) {
            System.out.println("Sartu altuera (zenbaki positiboa) ");
            altuera = in.nextInt();
        }
        if (zabalera == 0) {
            System.out.println("Sartu zabalera (zenbaki positiboa)");
            zabalera = in.nextInt();

        }
        while (zabalera < 0) {
            System.out.println("Sartu zabalera (zenbaki positiboa)");
            zabalera = in.nextInt();

        }
        int kontadorea = 1;

        for (int i = 0; i < altuera; i++) {
            for (int j = 0; j < zabalera; j++) {
                System.out.print(kontadorea);
                kontadorea++;
            }
            System.out.println("");
        }

    }

}

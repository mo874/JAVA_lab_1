import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 1;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        byte zmiennaByte = 22;
        System.out.println("zmienna byte = " + zmiennaByte);

        short zmiennaShort = 3;
        System.out.println("zmienna short = " + zmiennaShort);

        long zmiennaLong = 4;
        System.out.println("zmienna long = " + zmiennaLong);

        float zmiennaFloat = 5.55f;
        System.out.println("zmienna float = " + zmiennaFloat);

        boolean zmiennaBoolean = true;
        System.out.println("zmienna boolean = " + zmiennaBoolean);


        /*
         *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
         *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
         *  */

        int liczbaA = 22;
        System.out.println("liczba A = " + liczbaA);

        int liczbaB = 4;
        System.out.println("liczba B = " + liczbaB);
        
        int wynik1 = liczbaA + liczbaB;
        System.out.println("A+B = " + wynik1);

        int wynik2 = liczbaB - liczbaA;
        System.out.println("B-A = " + wynik2);

        int wynik3 = liczbaA - liczbaB;
        System.out.println("A-B = " + wynik3);

        int wynik4 = liczbaA * liczbaB;
        System.out.println("A*B = " + wynik4);

        int wynik5 = liczbaA / liczbaB;
        System.out.println("A/B = " + wynik5);

        int wynik6 = liczbaB%liczbaA;
        System.out.println("B%A = " + wynik6);

        double liczbaX = 10.0000001;
        System.out.println("liczba X = " + liczbaX);

        double liczbaY = 8.09;
        System.out.println("liczba Y = " + liczbaY);

        double wynik7 = liczbaX + liczbaY;
        System.out.println("X+Y = " + wynik7);

        double wynik8 = liczbaX - liczbaY;
        System.out.println("X-Y = " + wynik8);

        double wynik9 = liczbaX * liczbaY;
        System.out.println("X*Y = " + wynik9);

        double wynik10 = liczbaX / liczbaY;
        System.out.println("X/Y = " + wynik10);

        double wynik11 = liczbaX % liczbaY;
        System.out.println("X%Y = " + wynik11);

    }
}
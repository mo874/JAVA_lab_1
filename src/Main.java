import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj Imię: ");
        String imie = scan.next();

        System.out.print("Podaj Nazwisko: ");
        String nazwisko = scan.next();

        System.out.print("Podaj wiek: ");
        int wiek = scan.nextInt();

        System.out.print("Podaj nr indeksu: ");
        int nrIndeksu = scan.nextInt();


        System.out.println("Twoje imie i nazwisko to  " + imie + " " + nazwisko + ". Masz  " + wiek + " lat. Twój nr indeksu to " + nrIndeksu);
        System.out.printf("Twoje imie  to %s , zaś nazwisko to %s . ", imie, nazwisko);
        System.out.printf("Twoj wiek to %d , a nr indeksu to %d . ", wiek, nrIndeksu);



        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
         *   wynik wyświetlić w konsoli programu
         */

        System.out.print("Podaj dowolną liczbę: ");
        int liczba1 = scan.nextInt();

        System.out.print("Podaj drugą dowolną liczbę : ");
        int liczba2 = scan.nextInt();

        int wynik = liczba1 + liczba2;
        System.out.println("liczba1 + liczba2 = " + wynik);

        int wynik1 = liczba1 - liczba2;
        System.out.println("liczba1 - liczba2 = " + wynik1);

        int wynik2 = liczba1 * liczba2;
        System.out.println("liczba1 * liczba2 = " + wynik2);

        int wynik3 = liczba1 / liczba2;
        System.out.println("liczba1 / liczba2 = " + wynik3);

        int wynik4 = liczba1 % liczba2;
        System.out.println("liczba1 % liczba2 = " + wynik4);

    }


}
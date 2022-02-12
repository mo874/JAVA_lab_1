import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoj wiek: ");
        int wiek = scan.nextInt();

        if (wiek % 3 == 0) {System.out.println("Podzielny przez 3");}
            else {System.out.println("Niepodzielny przez 3");}

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        System.out.println("Podaj swoj numer indeksu: ");
        int indeks = scan.nextInt();
        String parzystosc = ((indeks % 2) == 0) ? "parzysty" : "nieparzysty";
        System.out.println(parzystosc);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        System.out.println("Wpisz liczbe zmiennoprzecinkowa");
        Double liczba = scan.nextDouble();

        if (liczba < 0) {System.out.println("Podałeś liczbę poniżej zera");}
            else if (liczba == 0) {System.out.println("Podałeś liczbę równą zero");}
            else if (liczba < 50.505050) {System.out.println("Podałeś liczbę powyżej zera jednak poniżej liczby 50,505050");}
            else {System.out.println("Podałeś liczbę większą lub równą 50,505050");}

    }
}
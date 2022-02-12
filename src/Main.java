import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        /* Operatory logiczne */
        /*operatory logiczne, czyli koniunkcja && ("i") i alternatywa || ("lub").
        Koniunkcja w wyniku daje true tylko wtedy, gdy oba warunki, które nią łączymy są prawdą,
        natomiast alternatywa daje false tylko wtedy, gdy oba warunki będą false.
        ! to zaprzeczenie - NOT
        */

        boolean a = true;
        boolean b = true;
        boolean c = false;
        System.out.println("Operatory arytmetyczne:" + "\na = true\tb = true\tc = false");

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wartosc ponizszych wyrazen logicznych wpisujac true lub false:");

        System.out.println("(a && b) : " + (a && b)); // true
        String odpowiedz = scan.next();
        if (odpowiedz.equals("true")) System.out.println("Poprawnie");
        else System.out.println("Błędna odpowiedz");

        System.out.println("(a || b) : " + (a || b)); // true
        String odpowiedz2= scan.next();
        if (odpowiedz2.equals("true")) System.out.println("Poprawnie");
        else System.out.println("Błędna odpowiedz");

        System.out.println("!b : " + !b); // false
        String odpowiedz3 = scan.next();
        if (odpowiedz3.equals("true")) System.out.println("Błędna odpowiedz");
        else System.out.println("Poprawnie");

        System.out.println("!((a && c) || (!a || b) : " + !((a && c) || (!a || b))); // true
        String odpowiedz4 = scan.next();
        if (odpowiedz4.equals("true")) System.out.println("Poprawnie");
        else System.out.println("Błędna odpowiedz");


        /* Operatory porównania */
        /*
        == sprawdza równość wartości.
        != różny.
        >= większy, bądź równy.
        <= mniejszy, bądź równy.
        > większy.
        < mniejszy.
        */

        int x = 4;
        int y = 5;
        int z = 10;

        System.out.printf("Operatory porównania:" + "\nx = %d\ty = %d\tz = %d\n", x, y, z);
        System.out.print("\n\nOdpowiedzi: \n");

        System.out.println("(x == z) : " + (x == z)); // false
        System.out.println("(x != y) : " + (x != y)); // true
        System.out.println("(x < y) : " + (x < y)); // true
        System.out.println("((x > y) || (a && c)) : " + ((x > y) || (a && c))); // false

    }
}
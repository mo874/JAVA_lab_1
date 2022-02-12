import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę 5-cio elementową typu:
        a) double[],
        b) char[],
        c) boolean[]
        przypisać do niej wartości i wyświetlić za pomocą dowolnej pętli.
        */


        /*a) double[],*/
        double[] tablica = new double[5];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 19;
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Element " + i + " to: " + tablica[i]);
        }



        /*b) char[],*/
        char[] tablica1 = {'A','B','C','D','E'};
        for (int i = 0; i<tablica1.length; i++) {
            System.out.print(tablica1[i] + ",");
        }
        System.out.println();




        /*c) boolean[]*/
       boolean[] tablica2 = new boolean [5];
        for(int i = 0; i< tablica2.length; i++){
            if(i%2==0){
                tablica2[i] = true;
                System.out.println("Tablica nr["+ i + "] = wartość w tablicy: " + tablica2 [i] +"  True");
            }
            else{
                tablica2[i] = false;
                System.out.println("Tablica nr["+ i + "] = wartość w tablicy: " + tablica2 [i] +"  False");
            }
        }


    }
}
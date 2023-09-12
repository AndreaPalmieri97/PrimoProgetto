import Esercizi.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("Inserisci una stringa e ti dirò se è pari o dispari");
//        String s = input.nextLine();
//        System.out.println("La stringa è dispari? " + Esercizio1.esercizio1(s));

//        System.out.println("Inserisci una stringa da invertire");
//        String s = input.nextLine();
//        System.out.println("La stringa inversa è: " + Esercizio2.esercizio2(s));

//        System.out.println("Inserisci un numero");
//        int n = input.nextInt();
//        System.out.println("Il fattoriale del numero " + n + " è " + Esercizio3.fattoriale_ricorsivo(n));

//        System.out.println("Inserisci un numero di secondi");
//        int n = input.nextInt();
//        System.out.println(Esercizio4.numeroSecondi(n));
//        System.out.println("ciao");

        int[] array = {5, 2, 12, 11, 5, 9, 23, 4};
        int[] copia = Esercizio6.doubluOdd(array);
        System.out.println(Arrays.toString(copia));

        }
    }
import Esercizi.Esercizio1;
import Esercizi.Esercizio2;
import Esercizi.Esercizio3;
import Esercizi.Esercizio4;

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

        System.out.println("Inserisci un numero di secondi");
        int n = input.nextInt();
        System.out.println(Esercizio4.numeroSecondi(n));

        }
    }
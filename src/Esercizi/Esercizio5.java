package Esercizi;

import java.util.Scanner;

public class Esercizio5 {
    //Scrivere un metodo che prenda in input un numero intero n e una stringa. Il metodo chiede all’utente di scrivere
    // n stringhe da tastiera e per ognuna di esse stampa true o false a seconda se la stringa inizi con quella passata
    //in input.
    public static void indovinaStringa(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la quantità di stringhe da confrontare: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Inserisci la stringa da confrontare: ");
        String stringaVerifica = scanner.nextLine();

        for(int i=0; i<n ; i++){
            System.out.println("Inserisci la stringa n°"+ (i+1) +" da confrontare: ");
            String checkStringa = scanner.nextLine();
            System.out.println(checkStringa.startsWith(stringaVerifica));
        }
    }
}
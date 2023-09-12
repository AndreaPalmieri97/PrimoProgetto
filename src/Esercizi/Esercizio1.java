package Esercizi;

import java.util.Scanner;

public class Esercizio1 {

    //Scrivere un metodo che prenda in input una stringa e ritorni true se la
    //stringa ha lunghezza dispari, false altrimenti.
    public static boolean esercizio1(String s){
        if(s.length()%2==1){
            return false;
        }
        return true;
    }
}

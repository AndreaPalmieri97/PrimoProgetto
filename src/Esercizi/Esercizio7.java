package Esercizi;

import java.util.Arrays;

public class Esercizio7{
    //) Scrivete una funzione che dato in input due numeri n ed m, crea un array lungo m che in ogni cella ha il
    // valore di indice della cella moltiplicato per n.

    public static void creaArray(int n, int m){
        int[] array = new int[m];
        for(int i=0; i<m; i++){
            array[i] = i*n;
        }
        System.out.println(Arrays.toString(array));
    }

}
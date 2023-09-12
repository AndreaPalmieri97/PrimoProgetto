package Esercizi;

public class Esercizio3 {

    //Scrivere un metodo che calcoli il fattoriale di un numero positivo n. Se
    //l’input è negativo stampare un messaggio di errore.

    public static int fattoriale(int n) {

        if(n<0){
            System.out.println("ERRORE. Input negativo");
            return -1;
        }
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

    public static int fattoriale_ricorsivo(int n){
        if(n <= 1) return 1;
        else return n * fattoriale_ricorsivo(n-1);
    }
}

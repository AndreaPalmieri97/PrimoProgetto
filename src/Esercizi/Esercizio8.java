package Esercizi;

public class Esercizio8 {

// Scrivere un metodo che stampa l’ennesimo elemento della sequenza di
// Fibonacci, nella quale ogni numero Ë definito dalla somma dei due precedenti, eccetto i primi
// due che sono per definizione 0 e 1. Esempio: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... E cosÏ via.
// Assumete di iniziare da 0, dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e cosÏ via.

    public static int metodoFibonacci(int n){
        if(n<1){
            System.out.println("Valore inserito non valido");
            return -1;
        }

        int fibonacci1=0;
        int fibonacci2=1;
        int fibonacci3=0;

        for(int i=2 ; i<=n ; i++){
            fibonacci3=fibonacci1+fibonacci2;
            fibonacci1=fibonacci2;
            fibonacci2=fibonacci3;
        }

        return fibonacci3;
    }

}

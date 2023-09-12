package Esercizi;

public class Esercizio4 {

//    Scrivete una funzione che dato in input un numero di secondi, restituisce una stringa che dice
//    ´Giorni: numero di giorni, Ore: numero di ore etc…

    public static String numeroSecondi(int n){

        int giorni = n / 86400;
        int resto = n % 86400;
        int ore = resto / 3600;
        resto = n % 3600;
        int minuti = resto / 60;
        int secondi = resto % 60;
        resto = n % 60;
        return "Giorni: " + giorni + ", Ore: " + ore + ", Minuti: " + minuti + ", Secondi: " + secondi;

    }
}

package com.sda.zadaniaPoboczne;

//Napisz program obliczajacy konwersje galonow na litry od 1 litra do 100 litrow. Zapisz wyniki konwersji do tabeli typu double.
//Wyniki wyswietl w blokach po 10 pozycji
//1 galon to 3,7854 litra
//Wyniki wyswietl w formie
// x galonow to x litrów
// grupujac po 10 wynikow w bloku

public class galony {

    public static void main(String[] args) {

        double[] tabela = new double[100];
        double przelicznik = 3.7854;

        for(int i = 0; i < tabela.length; i++){
            tabela[i] = (i + 1) * przelicznik;
        }

        String slowo = "galonow to ";
        String slowoDrugie = " litrow";

        int counter = 1;
        int helperCounter = 0;
        for(double wynik : tabela){
            ++helperCounter;
            StringBuilder sb = new StringBuilder();
            sb.append(counter++);
            sb.append(slowo);
            sb.append(wynik);
            sb.append(slowoDrugie);
            if(helperCounter == 10){
                sb.append("\n");
                helperCounter = 0;
            }
            System.out.println(sb);
        }

    }
}


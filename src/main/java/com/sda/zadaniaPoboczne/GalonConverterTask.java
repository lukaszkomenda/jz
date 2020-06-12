package com.sda.zadaniaPoboczne;

public class GalonConverterTask implements IGalonConverter {

        private double[] tabela = new double[100];
        private double przelicznik = 3.7854;

//    public GalonConverterTask(int size) {
//        tabela = new String (size);
//    }

    @Override
    public String[] getGalonConverter() {

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


        return new String[0];
    }
}

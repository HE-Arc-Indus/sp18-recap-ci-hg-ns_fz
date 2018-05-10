package ch.hearc.ig.indus.fizzbuzz;

public class FizzBuzz {

    private String[] maListe;
    public FizzBuzz(){
      maListe = new String[100];
      for (Integer i=1;i<=100;i++){
        maListe[i-1]=i.toString();
      }
    }
    public String[] getMaListe(){
      return maListe;
    }
}

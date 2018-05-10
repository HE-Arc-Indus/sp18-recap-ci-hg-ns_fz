package ch.hearc.ig.indus.fizzbuzz;

public class FizzBuzz {

  public FizzBuzz() {


  }

    public String[] generateList(Integer p_nb ){
      String [] myList= new String [p_nb];

      for (Integer i = 1; i <= p_nb; i++) {
        myList[i - 1]=i.toString();
      }
      return myList;
    }

    public String[] generateFizzBuzz (String [] p_list){
      for (Integer i = 1; i <=p_list.length; i++) {
        if ((i % 3 == 0) && (i % 5 != 0)) {
          p_list[i - 1]="Fizz";
        }
      }

      return p_list;

    }
  }

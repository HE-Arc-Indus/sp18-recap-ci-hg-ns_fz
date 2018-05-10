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
}

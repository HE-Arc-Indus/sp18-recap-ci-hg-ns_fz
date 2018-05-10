package ch.hearc.ig.indus.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
  FizzBuzz fb;

  @Before
  public void init() {
    fb = new FizzBuzz();
  }

  @Test
  public void checkSizeList() {
    String [] myList = fb.generateList(100);
    for (Integer i = 1; i <= 100; i++) {
      assertEquals("nombre suit la séquence", i.toString(), myList[i - 1]);
    }

  }

  @Test
  public void checkFizz() {
    String [] myList = fb.generateList(100);

    myList = fb.generateFizzBuzz(myList);

    for (Integer i = 3; i <= 100; i=i+3) {
      if (i % 5 != 0){
        assertEquals("Le nombre divisible par trois = Fizz", "Fizz", myList[i - 1]);
      }
    }

  }

}
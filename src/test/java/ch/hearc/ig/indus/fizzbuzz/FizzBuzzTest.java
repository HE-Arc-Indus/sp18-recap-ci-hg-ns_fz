package ch.hearc.ig.indus.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
  FizzBuzz fb;
  String[] myList;

  @Before
  public void init() {
    fb = new FizzBuzz();
    myList = fb.generateList(100);
  }

  @Test
  public void checkSizeList() {
    for (Integer i = 1; i <= 100; i++) {
      assertEquals("nombre suit la séquence", i.toString(), myList[i - 1]);
    }

  }

  @Test
  public void checkFizz() {

    myList = fb.generateFizzBuzz(myList);

    for (Integer i = 3; i <= 100; i=i+3) {
      if (i % 5 != 0){
        assertEquals("Le nombre divisible par trois = Fizz", "Fizz", myList[i - 1]);
      }
    }

  }

  @Test
  public void checkBuzz() {
    myList = fb.generateFizzBuzz(myList);

    for (Integer i = 5; i <= 100; i += 5) {
      assertEquals("Le nombre est divisible par 5", "Buzz", myList[i - 1]);
    }

  }

  @Test
  public void checkFizzBuzz() {
    myList = fb.generateFizzBuzz(myList);

    for (Integer i = 1; i <= 100; i++) {
      if ((i % 5 == 0) && (i % 3 == 0)) {
        assertEquals("Le nombre est divisible par 3 et par 5", "FizzBuzz", myList[i - 1]);
      }
    }
  }

}
package ch.hearc.ig.indus.fizzbuzz;

import org.junit.Before;

public class FizzBuzzTest {
  FizzBuzz fb;
  String[] testFb;
  @Before
  public void setUp() throws Exception {
    fb = new FizzBuzz();

  }
  @Test
  public void checkOneToHundred() {

    for (Integer i=1;i<=100;i++){
      assertEquals("nombre suit la séquence", i.toString(), fb.getMaListe()[i-1]);
    }
  }

}
package edu.pdx.cs410J.dsong;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class kataIT extends InvokeMainTestCase {

  private MainMethodResult invokeMain(String... arg) {return invokeMain ( Kata.class);}

  @Test
  public void printsLeapYear() {
    MainMethodResult result = invokeMain("2020", "2023");
    assertThat(result.getTextWrittenToStandardOut(), containsString("2020"));
  }

}

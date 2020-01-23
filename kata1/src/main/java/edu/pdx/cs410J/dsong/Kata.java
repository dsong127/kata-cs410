
package edu.pdx.cs410J.dsong;

import edu.pdx.cs410J.lang.Human;

import java.util.ArrayList;

/**
 * This class is represents a <code>Student</code>.
 */
public class Kata {



  public static void main(String[] args) {



    LeapYear leapyear = new LeapYear();

    leapyear.printFrom(Integer.parseInt(args[0]), Integer.parseInt(args[1]));


    System.exit(1);
  }
}
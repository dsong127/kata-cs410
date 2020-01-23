package edu.pdx.cs410J.dsong;

public class LeapYear {

  public LeapYear() {

  }

  public void printFrom(int from, int to) {
    for (int i = from; i <= to; i++) {
      if(isLeapYear(i)) {
        System.out.println(i);
      }
    }
  }

  public boolean isLeapYear(int year) {
    if (year % 400 == 0) {
      return true;
    } else if (year % 4 == 0 && !(year % 100 == 0)) {
      return true;
    } else {
      return false;
    }
  }


}

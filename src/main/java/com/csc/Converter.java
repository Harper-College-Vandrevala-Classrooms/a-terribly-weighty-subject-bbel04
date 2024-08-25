package com.csc;

public class Converter {

  private final static int OUNCES_PER_POUND = 16; //constant 16 ounces in 1 pound

  public String toPounds(int ounces) {
    float numOfPounds; 

    numOfPounds = (float) ounces / OUNCES_PER_POUND; //cast ounces to float for decimal precision

    String pounds; 

    if (numOfPounds == 1) { //if numOfPounds is equal to 1, display "lb" abbreviation
      pounds = String.format("%.4f lb", numOfPounds);
    } else {  //if numOfPounds > 1, display lbs abbreviation
      pounds = String.format("%.4f lbs", numOfPounds);
    }

    return pounds;
  }

  public String toPoundsAndOunces(int ounces) {
    int numOfPounds;
    int numOfOunces;

    numOfPounds = ounces / OUNCES_PER_POUND;   //value is truncated to integer representing pounds
    numOfOunces = ounces % OUNCES_PER_POUND;   //remainder of ounces / OUNCES_PER_POUND is the remaining number of ounces to display

    String poundsAndOunces;

    if (numOfPounds == 1) { 
      poundsAndOunces = numOfPounds + " lb " + numOfOunces + " oz";
    } else { 
      poundsAndOunces = numOfPounds + " lbs " + numOfOunces + " oz";
    }
    
    return poundsAndOunces;
  }
}

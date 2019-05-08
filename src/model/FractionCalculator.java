package model;

import interfaces.ICalculator;

public class FractionCalculator implements ICalculator {
   
   private ICalculator calc;
   
   public FractionCalculator(ICalculator calc){
      this.calc = calc;
   }
   /**
     *converts fraction to decimal
     *@param fraction fraction to be converted
     *@return fraction converted to decimal
     **/
   public String fractionToDecimal(String fraction){
      String answer = null;
      String[] splitFraction = fraction.split("/"); //creates array by seperating at /
      answer = calc.division(splitFraction[0],splitFraction[1]);
      return answer;
   }
   
   /**
     *converts decimal to fraction
     *@param decimal decimal to be converted
     *@return decimal converted to string representation of a fraction
     **/
   public String decimalToFraction(String decimal){
      String fraction = "";
      double numerator = Double.parseDouble(decimal);
      int denominator = 1;
      for(int i = decimal.indexOf("."); i < decimal.length(); i++){
         numerator *= 10;
         denominator *= 10;
      }
      fraction += String.valueOf(numerator) + "/" + String.valueOf(denominator);
      return fraction;
   }
   
   /**
     *adds two fractions together
     *@param firstNum string representation of first fraction to be added
     *@param secondNum string representation of second fraction to be added
     *@return a string representation of a fraction
     **/
   public String addition(String firstNum,String secondNum){
      String answer = "";
      String firstNumDouble = fractionToDecimal(firstNum);
      String secondNumDouble = fractionToDecimal(secondNum);
      String decimalAnswer = calc.addition(firstNumDouble,secondNumDouble);
      answer = decimalToFraction(decimalAnswer);
      return answer;
   }
   
   /**
     *subtracts two fractions
     *@param firstNum string representation of fraction to be subtracted from
     *@param secondNum string representation of fraction being subtracted
     *@return string representation of a fraction
     **/
   public String subtraction(String firstNum,String secondNum){
      String answer = "";
      String firstNumDouble = fractionToDecimal(firstNum);
      String secondNumDouble = fractionToDecimal(secondNum);
      String decimalAnswer = calc.subtraction(firstNumDouble,secondNumDouble);
      answer = decimalToFraction(decimalAnswer);
      return answer;
   }
   
    /**
     *multiply two fractions
     *@param firstNum string representation of first fraction being multiplied
     *@param secondNum string representation of second fraction being multiplied
     *@return string representation of a fraction
     **/
   public String multiplication(String firstNum,String secondNum){
      String answer = "";
      String firstNumDouble = fractionToDecimal(firstNum);
      String secondNumDouble = fractionToDecimal(secondNum);
      String decimalAnswer = calc.multiplication(firstNumDouble,secondNumDouble);
      answer = decimalToFraction(decimalAnswer);
      return answer;
   }

   /**
     *divides two fractions
     *@param firstNum string representation of fraction to be divided 
     *@param secondNum string representation of fraction dividing
     *@return string representation of a fraction
     **/
   public String division(String firstNum,String secondNum){
      String answer = "";
      String firstNumDouble = fractionToDecimal(firstNum);
      String secondNumDouble = fractionToDecimal(secondNum);
      String decimalAnswer = calc.division(firstNumDouble,secondNumDouble);
      answer = decimalToFraction(decimalAnswer);
      return answer;
   }
}
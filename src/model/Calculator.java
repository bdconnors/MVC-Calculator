package model;

import interfaces.ICalculator;

//Calculator class
public class Calculator implements ICalculator {
   //default constructor
   public Calculator(){}
   
   /**
    *adds two numbers together
    *@param firstNum first number to be added
    *@param secondNum second number to be added
    *@return result of firstNum and secondNum being added together  
    **/
   public String addition(String firstNum,String secondNum){
      double answer = 0;
      double firstNumAsDouble = Double.parseDouble(firstNum);
      double secondNumAsDouble = Double.parseDouble(secondNum);
      answer = firstNumAsDouble + secondNumAsDouble;
      return String.valueOf(answer);
   }
    
   /**
    *subtracts a number from another
    *@param firstNum number to be subtracted from
    *@param secondNum number being subtracted
    *@return result of secondNum subtracted from firstNum  
    **/
   public String subtraction(String firstNum,String secondNum){
      double answer = 0;
      double firstNumAsDouble = Double.parseDouble(firstNum);
      double secondNumAsDouble = Double.parseDouble(secondNum);
      answer = firstNumAsDouble - secondNumAsDouble;
      return String.valueOf(answer);
   }
   
   /**
    *multiplies two numbers 
    *@param firstNum first number to be multiplied
    *@param secondNum second number to be multiplied
    *@return result of firstNum and secondNum being multiplied  
    **/
   public String multiplication(String firstNum,String secondNum){
      double answer = 0;
      double firstNumAsDouble = Double.parseDouble(firstNum);
      double secondNumAsDouble = Double.parseDouble(secondNum);
      answer = firstNumAsDouble * secondNumAsDouble;
      return String.valueOf(answer);
   }
   
   /**
    *divides a number by another number 
    *@param firstNum number to be divided
    *@param secondNum number dividing by
    *@return result of firstNum divided by the second number  
    **/
   public String division(String firstNum,String secondNum){
      double answer = 0;
      double firstNumAsDouble = Double.parseDouble(firstNum);
      double secondNumAsDouble = Double.parseDouble(secondNum);
      answer = firstNumAsDouble / secondNumAsDouble;
      return String.valueOf(answer);
   }
   
   /**
     *calculates exponential value
     *@param number number being multiplied exponentially 
     *@param exponent the exponent
     *@return exponential value 
     **/
   public String exponent(String number,String exponent){
      double answer = 0;
      double numberAsDouble = Double.parseDouble(number);
      double exponentAsDouble = Double.parseDouble(exponent);
      if(exponentAsDouble == 1){
         answer = numberAsDouble;
      }else if(exponentAsDouble == 0){
         answer = 1;
      }else if(exponentAsDouble < 0){
         answer = 1;
         double inverse = exponentAsDouble * -1;
         for(int i = 1; i < inverse; i++){
            answer /= numberAsDouble;
         }
      }else{
         for(int i = 1; i < exponentAsDouble; i++){
            numberAsDouble *= numberAsDouble;
         }
      }
      return String.valueOf(answer);
   }
}
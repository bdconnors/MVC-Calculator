package controller;

import interfaces.ICalculator;

public class Controller {

    private ICalculator calc;
    private ICalculator fractCalc;

    public Controller(ICalculator calc,ICalculator fractCalc){
        this.calc = calc;
        this.fractCalc = fractCalc;
    }

    public String add(String firstNum,String secondNum){
        String answer = null;
        if(firstNum.contains("/")){
            answer = fractCalc.addition(firstNum,secondNum);
        }else{
            answer = calc.addition(firstNum,secondNum);
        }
        return answer;
    }

    public String subtract(String firstNum,String secondNum){
        String answer = null;
        if(firstNum.contains("/")){
            answer = fractCalc.subtraction(firstNum,secondNum);
        }else{
            answer = calc.subtraction(firstNum,secondNum);
        }
        return answer;
    }

    public String multiply(String firstNum,String secondNum){
        String answer = null;
        if(firstNum.contains("/")){
            answer = fractCalc.multiplication(firstNum,secondNum);
        }else{
            answer = calc.multiplication(firstNum,secondNum);
        }
        return answer;
    }

    public String divide(String firstNum,String secondNum){
        String answer = null;
        if(firstNum.contains("/")){
            answer = fractCalc.division(firstNum,secondNum);
        }else{
            answer = calc.division(firstNum,secondNum);
        }
        return answer;
    }
}

import controller.Controller;
import model.Calculator;
import model.FractionCalculator;
import view.TextUI;

//main class
public class Main{
   //main method
   public static void main(String args[]){
      Calculator calc = new Calculator();
      FractionCalculator fractCalc = new FractionCalculator(calc);
      Controller control = new Controller(calc,fractCalc);
      TextUI ui = new TextUI(control);
      ui.run();
   }

}
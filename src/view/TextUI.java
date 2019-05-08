package view;

import controller.Controller;

import java.util.Scanner;

public class TextUI implements Runnable {
    
    private Scanner scan;
    private Controller control;

    public TextUI(Controller control){
        scan = new Scanner(System.in);
        this.control = control;
    }

    @Override
    public void run() {
        System.out.println("Welcome to Calculator App!");

        while(true){
            prompt();
            selection();
        }
    }
    public void prompt(){
        System.out.println("Please select an operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
    }
    public void selection(){
        int selection = scan.nextInt();
        if(selection == 1){
            String[] values = getValues();
            answer(control.add(values[0],values[1]));
        }else if(selection == 2){
            String[] values = getValues();
            answer(control.subtract(values[0],values[1]));
        }else if(selection == 3){
            String[] values = getValues();
            answer(control.multiply(values[0],values[1]));
        }else if(selection == 4){
            String[] values = getValues();
            answer(control.divide(values[0],values[1]));
        }else if(selection == 0){
            System.exit(0);
        }else{
            System.out.println("Invalid selection please try again!");
        }
    }

    public String[] getValues(){
        String[] values = new String[2];
        System.out.println("Please enter the first value:");
        values[0] = scan.next();
        System.out.println("Please enter the second value:");
        values[1] = scan.next();
        return values;
    }

    public void answer(String answer){
        System.out.println("Your answer is: " + answer);
    }
}

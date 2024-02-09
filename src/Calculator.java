//This is my calculator
import javax.swing.*;

public class Calculator {
    void Input(){
        String input = JOptionPane.showInputDialog("Enter in your numbers");
        String []parts = input.split("[+\\-*/]");
        for(String part:parts){
            JOptionPane.showMessageDialog(null,part.trim());
        }
    }
    void Calculation(){

    }


    public static void main(String[] args) {
        Calculator arr = new Calculator();
        arr.Input();
    }
}
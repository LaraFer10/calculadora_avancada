
package calculadora;

import javax.swing.JOptionPane;


public class Calculadora {

    
    public static void main(String[] args) {
        String operador, a, b;
        int num1, num2;
        
        a = JOptionPane.showInputDialog("Digite número");
        operador = JOptionPane.showInputDialog("Operação");
        b = JOptionPane.showInputDialog("Digite número");
        
        num1 = Integer.parseInt(a);
        num2 = Integer.parseInt(b);
        
        switch (operador){
            case "+": 
                int soma = num1+num2;
                JOptionPane.showMessageDialog(null, soma);
                break;
            case "-":
                int sub = num1-num2;
                JOptionPane.showMessageDialog(null, sub);
                break;
            case "/":
                int div = num1/num2;
                JOptionPane.showMessageDialog(null, div);
                break;
            case "*":
                int mult = num1*num2;
                JOptionPane.showMessageDialog(null, mult);
                break;
        }
    }
    
}

package Exception;

import javax.swing.*;

//Fazer a divisão de dois valores inteiros
public class UncheckedException {

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + resultado);
    }

    public static int dividir (int a, int b){
        return a / b;
    }
}

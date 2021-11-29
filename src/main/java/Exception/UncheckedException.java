package Exception;

import javax.swing.*;

//Fazer a divisão de dois valores inteiros
public class UncheckedException {

    public static void main(String[] args) {


        boolean continueLoop = true;

        do{

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLoop = false;


            } catch (NumberFormatException e) {

                e.printStackTrace();

                JOptionPane.showMessageDialog(null, "Entrada invalida. Informe um numero inteiro!"
                        + e.getMessage());

            } catch (ArithmeticException e){

                e.printStackTrace();

                JOptionPane.showMessageDialog(null, "Impossivel dividir numero por zero." +
                        " Informe um numero inteiro!");


            } finally {
                System.out.println("Chegou no finally!");
            }


        } while (continueLoop);


        System.out.println("O código continua...");
    }



    public static int dividir (int a, int b){
        return a / b;
    }
}

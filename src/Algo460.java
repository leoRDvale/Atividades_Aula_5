import javax.swing.*;

public class Algo460 {
    public static void main(String[] args) {
        //Fazer as atrividades 460, 470, 480, 490, 495, 497, 499 e 500

        //Crie um algoritmo que possa entrar com três números e,
        //para cada um imprimir o dobro

        Funcoes funcoes = new Funcoes();
        int a, i;
        String s;

        for (i = 1; i <= 3; i++) {
            s = JOptionPane.showInputDialog(null, "Digite um número:");
            a = Integer.parseInt(s);
            JOptionPane.showMessageDialog(null, "O dobro de " + a + " é: " + funcoes.dobro(a));

        }
    }
}

import javax.swing.*;

public class Algo495 {
    public static void main(String[] args) {
        //criar uma funçao que receba um vetor de caracteres e ordenar

        Funcoes funcoes = new Funcoes();
        int i, c, t, t1;
        String[] nome = new String[5];

        for (i = 0; i < 5; i++) {
            nome[i] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º nome: ");
        }
        funcoes.ordena(nome, 5);

        for (i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, (i + 1) + "º - " + nome[i]);
        }


    }
}


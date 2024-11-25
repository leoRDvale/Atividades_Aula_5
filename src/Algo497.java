import javax.swing.*;

public class Algo497 {
    public static void main(String[] args) {
        //Crie uma função que implemente uma busca binária
        //Ela recebe um vetor de inteiros, tamanho e uma chave
        //Retorna a posição da chave no vetor, de forma ordenada

        Funcoes funcoes = new Funcoes();
        int i, c, n, aux;
        int[] num = new int[10];

        for (i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "ª número: "));
        }

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de busca: "));
        funcoes.ordenaNumero(num, 10);
        c = funcoes.busca(num, 10, n);

        for (i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, (i + 1) + "ª - " + num[i]);
        }
        c++;
        if (c != 0) {
            JOptionPane.showMessageDialog(null, "Posição no vetor: " + c + "º");
        } else {
            JOptionPane.showMessageDialog(null, "Não encontrado.");
        }

    }
}

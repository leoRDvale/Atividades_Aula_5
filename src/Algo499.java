import javax.swing.*;

public class Algo499 {
    public static void main(String[] args) {
        //Criar um algoritmo que apresente um menu,
        //baseado em um vetor de 5 dimensões.
        /* MENU VETOR - FUNÇÃO
        1 - Dados do VETOR
        2 - Ordena VETOR
        3 - Impime VETOR
        4 - Sai do Programa */

        Funcoes funcoes = new Funcoes();
        int i, flag = 0, op;
        int[] num = new int[5];

        for (i = 0; i < 5; i++) {
            num[i] = 0;
        }
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("MENU VETOR - FUNÇÃO\n" + "1 - Dados do vetor\n" + "2 - Ordena o vetor\n" + "3 - Imprime o vetor\n" + "4- Sai do programa\n\n" + "DIGITE A OPÇÃO DESEJADA: "));
            switch (op) {
                case 1:
                    funcoes.entrada(num, 5);
                    flag = 1;
                    break;
                case 2:
                    if (flag == 1) {
                        funcoes.ordenaNumero(num, 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro a opção 1");
                    }
                    break;
                case 3:
                    if (flag == 1) {
                        funcoes.imprime(num, 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro a opção 1");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do algoritmo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (op != 4);


    }
}

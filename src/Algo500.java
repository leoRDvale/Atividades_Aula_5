import javax.swing.*;

public class Algo500 {
    public static void main(String[] args) {
        //Criar um algoritmo que apresente um menu,
        //baseado em um vetor de 5 dimensões.
        /* MENU VETOR - FUNÇÃO
        1 - Dados do VETOR A
        2 - Dados do VETOR B
        3 - Impime VETORES
        4 - Soma VETORES
        5 - Subtrai VETORES
        6 - Sai do Programa */

        Funcoes funcoes = new Funcoes();
        int[] num = new int[5], num1 = new int[5];
        int i, flag = 0, flag1 = 0, op;

        for (i = 0; i < 5; i++) {
            num[i] = 0;
            num1[i] = 0;
        }

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("VETORES\n" + "1 - Dados do vetor A\n" + "2 - Dados do vetor B\n" + "3 - Imprime vetores\n" + "4 - Soma dos vetores\n" + "5 - Subtrai os vetores\n" + "6 - Sai do programa\n\n" + "DIGITE A OPÇÃO DESEJADA: "
            ));

            switch (op) {
                case 1:
                    funcoes.entradaAB(num, 5, "A");
                    flag = 1;
                    break;
                case 2:
                    funcoes.entradaAB(num1, 5, "B");
                    flag1 = 1;
                    break;
                case 3:
                    if (flag != 0 && flag1 != 0) {
                        funcoes.imprimeAB(num, 5, "A");
                        funcoes.imprimeAB(num1, 5, "B");
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro as opções 1 e 2");
                    }
                    break;
                case 4:
                    if (flag != 0 && flag1 != 0) {
                        funcoes.soma(num, num1, 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro as opções 1 e 2");
                    }
                    break;
                case 5:
                    if (flag != 0 && flag1 != 0) {
                        funcoes.subtrai(num, num1, 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro as opções 1 e 2");
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (op != 6);
    }
}






import javax.swing.*;
import java.util.Scanner;

public class Algo490 {
    public static void main(String[] args) {
        //Criar uma função que recebe um vetor de caracteres
        //o tamanho e um determinado caractere.
        //retire todos esses caracteres corespondenres e coloque * no lugar
        //retornar o total de caracteres retirados do vetor

        Funcoes funcoes = new Funcoes();
        String[] nome = new String[10];
        int i;
        for (funcoes.i = 0; funcoes.i < 10; funcoes.i++) {
            funcoes.nome[funcoes.i] = JOptionPane.showInputDialog("Digite a " + (funcoes.i + 1) + "ª palavra usando somente letras minúsculas ");
        }
        for (funcoes.i = 0; funcoes.i < 10; funcoes.i++) {
            funcoes.restantes(funcoes.nome[funcoes.i], "c");
            JOptionPane.showMessageDialog(null, (funcoes.i + 1) + "ª - " + funcoes.nome[funcoes.i]);
        }


    }


}


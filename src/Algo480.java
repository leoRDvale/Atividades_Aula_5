import javax.swing.*;

public class Algo480 {
    public static void main(String[] args) {
        //um número é *capicua* quando lido da esquerda pra direita
        //ou vice versa. O ano 2002 é um ano *capicua*.
        //Escreva um função que verifique essa característica

        Funcoes funcoes = new Funcoes();
        int n, x;
        String s;
        s = JOptionPane.showInputDialog(null, "Digite um número para saber se ele é uma \"capicua\": " );
        n = Integer.parseInt(s);
        x = funcoes.reverso(n);
        JOptionPane.showMessageDialog(null, n+" - "+x);
        if(x == n){
            JOptionPane.showMessageDialog(null, "É um número capicua.");
        }else{
            JOptionPane.showMessageDialog(null, "Não é um número capicua.");
        }


    }
}

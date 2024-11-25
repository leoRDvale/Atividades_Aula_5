import javax.swing.*;

public class Algo470 {
    public static void main(String[] args) {
        //Criar uma função que verifique se o número é primo

        Funcoes funcoes = new Funcoes();
        int numero,pri,  primo;
        String s;
        s = JOptionPane.showInputDialog(null, "Digite um número maior que zero: ");
        numero = Integer.parseInt(s);
        pri = funcoes.primo(numero);
        if(pri == 0){
            JOptionPane.showMessageDialog(null, "O número "+numero+" é primo.");
        }else{
            JOptionPane.showMessageDialog(null, "O número "+numero+" não é primo.");
        }



    }
}

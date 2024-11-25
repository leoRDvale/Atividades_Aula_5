import javax.swing.*;

public class Funcoes {

    //Algo460

    int dobro(int x) {
        return (x * 2);
    }

    //Algo470

    int primo(int n) {
        int i = 0;
        int p = 2;
        while (i == 0 && p <= (n / 2)) {
            if (n % p == 0) {
                i = 1;
            }
            p++;
        }
        return (i);
    }

    //Algo480

    int reverso(int num) {
        int soma, r;
        soma = 0;
        while (num != 0) {
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return (soma);
    }

    //Algo490

    String[] nome = new String[10];
    int i;

    int restantes(String palavra, String x) {
        int cont = 0;
        char[] chars = palavra.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (String.valueOf(chars[i]).equals(x)) {
                chars[i] = '*';
                cont++;
            }
        }
        nome[i] = new String(chars);
        return (cont);

    }

    //Algo495

    //metodo ordena por letra
    void ordena(String vet[], int tam) {
        int L1, c1;
        String aux;

        for (L1 = 0; L1 < tam - 1; L1++) {
            for (c1 = L1 + 1; c1 < tam; c1++) {
                if (vet[L1].compareTo(vet[c1]) > 0) {
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;


                }
            }
        }
    }

    //Algo497

    int busca(int vet[], int tam, int chave) {
        int i, inicio = 0, meio, fim = tam - 1, n;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (chave == vet[meio]) {
                return (meio);
            } else {
                if (chave < vet[meio]) {
                    fim = meio - 1;
                } else {
                    inicio = meio + 1;
                }
            }
        }
        meio = (-1);
        return (meio);
    }

    //metodo ordena por número
    void ordenaNumero(int vet[], int tam) {
        int L1, c1, aux;

        for (L1 = 0; L1 < tam - 1; L1++) {
            for (c1 = L1 + 1; c1 < tam; c1++) {
                if (vet[L1] > vet[c1]) {
                    aux = vet[L1];
                    vet[L1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }

    //Algo499
    //reutilizei o metodo ordenaNumero

    void entrada(int vet[], int t) {
        int i;

        for (i = 0; i < t; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("ENTRADA DO VETOR\n" + "Digite o " + (i + 1) + "ª número: "));
        }
    }

    void imprime(int vet[], int t) {
        int i;

        for (i = 0; i < t; i++) {
            JOptionPane.showMessageDialog(null, "VETOR\n" + (i + 1) + " - " + vet[i]);
        }
    }

    //Algo500

    void entradaAB(int vet[], int t, String c) {
        int i;

        for (i = 0; i < t; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("ENTRADA DO VETOR\n" + "Digite o " + (i + 1) + "ª número: "));
        }
    }

    void imprimeAB(int vet[], int t, String c) {
        int i;

        for (i = 0; i < t; i++) {
            JOptionPane.showMessageDialog(null, "VETOR " + c + "\n" + (i + 1) + " - " + vet[i]);
        }
    }

    void soma(int vet[], int vet1[], int t) {
        int i, s;

        for (i = 0; i < t; i++) {
            s = vet[i] + vet1[i];
            JOptionPane.showMessageDialog(null, "SOMA:\n" + s);
        }
    }

    void subtrai(int vet[], int vet1[], int t) {
        int i, d;

        for (i = 0; i < t; i++) {
            d = vet[i] - vet1[i];
            JOptionPane.showMessageDialog(null, "SUBTRAÇÃO:\n" + d);
        }
    }


}
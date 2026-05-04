import java.util.Scanner;

public class Velha {
    public static void main(String[] args) {
        Scanner ls = new Scanner(System.in);
        char [][] tabuleiro = new char[3][3];
        char jogadorAtual = 'X';
        int linha, coluna, jogadas = 0;
        boolean vencedor = false;
        

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                
                tabuleiro[i][j] = '-';
            }
        }

        while (jogadas < 9 && !vencedor) {
        System.out.println("Tabuleiro atual:");
        for (int j = 0; j < tabuleiro.length; j++) {
            for (int j2 = 0; j2 < tabuleiro.length; j2++) {
                System.out.println(tabuleiro[j][j2] + " ");
            }
            System.out.println();
        }    

        System.out.println("\nVez do jogador " + jogadorAtual);
        System.out.println("Informe a linha (0,1,2): ");
        linha = ls.nextInt();

        System.out.println("Informe a coluna (0,1,2): ");
        coluna = ls.nextInt();

        if (linha<0 || linha > 2 || coluna <0 || coluna > 2) {
        System.out.println("Posição inválida!");            
        }else if (tabuleiro[linha][coluna]!= '-') {
        System.out.println("Essa posição já está preenchida!"); 
        } else {
        tabuleiro[linha][coluna] = jogadorAtual;
        jogadas++;

        for (int i = 0; i < tabuleiro.length; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                vencedor = true;                
            }
        }
        for (int j = 0; j < tabuleiro.length; j++) {
            if (tabuleiro[0][j] == jogadorAtual && tabuleiro[1][j] == jogadorAtual && tabuleiro[2][j] == jogadorAtual) {
                vencedor = true;                
            }

        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            vencedor = true;    
        }

        if (!vencedor) {
            if (jogadorAtual == 'X') {
                jogadorAtual = 'O';
                
            }else{
                jogadorAtual = 'X';

            }
        }
            
        }
        }

        System.out.println("Tabuleiro final:");
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                System.out.println(tabuleiro[i][j] + " ");
            }
        }
        if (vencedor) {
            
        }
        ls.close();
    }
}
}
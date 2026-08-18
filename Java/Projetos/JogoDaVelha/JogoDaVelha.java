import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // 1. Criamos a tabela 3x3 vazia (com traços)
        String[][] tabuleiro = {
            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"}
        };
        
        String jogadorAtual = "X";
        boolean jogoAtivo = true;
        int jogadas = 0;

        System.out.println("=== 🕹️ BEM-VINDO AO JOGO DA VELHA 🕹️ ===");

        // Loop principal do jogo
        while (jogoAtivo) {
            
            // 2. Desenha o tabuleiro na tela de forma bonita
            System.out.println("\n  0   1   2  (Colunas)");
            for (int i = 0; i < 3; i++) {
                System.out.print(i + " "); // Número da Linha
                for (int j = 0; j < 3; j++) {
                    System.out.print(tabuleiro[i][j]);
                    // if (j < 2) System.out.print(" | "); // Divisória de colunas
                }
                System.out.println();
                if (i < 2) System.out.println("  ---------"); // Divisória de linhas
            }
            System.out.println();

            // 3. Pede a jogada para o jogador da vez
            System.out.println("Vez do Jogador [" + jogadorAtual + "]");
            System.out.print("Digite a LINHA (0, 1 ou 2): ");
            int linha = leitor.nextInt();
            System.out.print("Digite a COLUNA (0, 1 ou 2): ");
            int coluna = leitor.nextInt();

            // 4. Validação: Verifica se a posição existe e se está vazia
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("❌ Posição inválida! Escolha números de 0 a 2.");
                continue; // Pula o resto e refaz a pergunta
            }
            
            if (!tabuleiro[linha][coluna].equals("-")) {
                System.out.println("❌ Essa casinha já está ocupada! Tente outra.");
                continue; 
            }

            // 5. Preenche a "caixinha" correta na tabela com o símbolo do jogador
            tabuleiro[linha][coluna] = jogadorAtual;
            jogadas++;

            // 6. Verifica se alguém ganhou (Linhas, Colunas ou Diagonais)
            boolean ganhou = false;
            
            for (int i = 0; i < 3; i++) {
                // Verifica Linhas
                if (tabuleiro[i][0].equals(jogadorAtual) && tabuleiro[i][1].equals(jogadorAtual) && tabuleiro[i][2].equals(jogadorAtual)) ganhou = true;
                // Verifica Colunas
                if (tabuleiro[0][i].equals(jogadorAtual) && tabuleiro[1][i].equals(jogadorAtual) && tabuleiro[2][i].equals(jogadorAtual)) ganhou = true;
            }
            // Verifica Diagonais
            if (tabuleiro[0][0].equals(jogadorAtual) && tabuleiro[1][1].equals(jogadorAtual) && tabuleiro[2][2].equals(jogadorAtual)) ganhou = true;
            if (tabuleiro[0][2].equals(jogadorAtual) && tabuleiro[1][1].equals(jogadorAtual) && tabuleiro[2][0].equals(jogadorAtual)) ganhou = true;

            if (ganhou) {
                System.out.println("\n🎉 PARABÉNS! O Jogador [" + jogadorAtual + "] venceu o jogo!");
                jogoAtivo = false;
            } else if (jogadas == 9) { // Se preencheu as 9 caixinhas e ninguém ganhou
                System.out.println("\n🤝 DEU VELHA! O jogo terminou em empate.");
                jogoAtivo = false;
            } else {
                // Alterna o jogador: Se era X vira O, se era O vira X
                jogadorAtual = jogadorAtual.equals("X") ? "O" : "X";
            }
        }
        
        leitor.close();
    }
}

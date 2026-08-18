

public class aula10 {
   public static void main(String[] args) {
       String[][] tabuleiro={
          {"-","-","-"},
          {"-","-","-"},
          {"-","-","-"}
      };
      for (int i = 0; i < tabuleiro.length; i++) {
         for (int j = 0; j < tabuleiro.length; j++) {
            System.out.print(tabuleiro[i][j]);
            if (j < 2) System.out.print(" | "); // Divisória de colunas
             
         }
          System.out.println();
                if (i < 2) System.out.println("  ---------"); // Divisória de linhas
      }
        System.out.println();
   }

   }


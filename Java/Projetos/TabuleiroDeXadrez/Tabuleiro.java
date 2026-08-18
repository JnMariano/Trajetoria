
public class Tabuleiro {
    public static void main(String[] args) {
        int[][] tabuleiro = new int[8][8] ;  
        for (int i = 0; i<tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if( (j) % 2 ==0){
                
                System.out.print(". ");
            }
            else{
                System.out.print("| ");
            }
            
        }
System.out.println();
    }
    System.out.println("--------------------------");
        for (int i = 0; i < tabuleiro.length; i++) {
    for (int j = 0; j < tabuleiro.length; j++) {
        // i+j = Linha 0 + Coluna 0 = 0 entao é par. | E assim por diante.
        if ((i + j) % 2 == 0) {
            System.out.print(". ");
        } else {
            System.out.print("| ");
        }
    }
    System.out.println();
}

     }   
}

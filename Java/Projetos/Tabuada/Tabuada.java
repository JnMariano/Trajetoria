
public class Tabuada {
    public static void main(String[] args) {
        // Here we will make some exercices about Matriz.
        int[][] matriz = new int[10][10];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (i+1) * (j+1);
                System.out.printf("%dx%d=%d | ", (i+1), (j+1), matriz[i][j]);
            }
             System.out.println();
        }
    }
}
 
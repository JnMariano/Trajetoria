public class Exercicio9 {
    public static void main(String[] args) {
        String [][] calendario = {
            {"1", "Janeiro"},
            {"2","Fevereiro"},
        };
        // System.out.println(calendario[0][1]);
        // for (String[][] i : calendario) {
        //     System.out.println(calendario[i]);
        // } 
        for (int i = 0; i < calendario.length; i++) {
            for (int j = 0; j <calendario.length; j++) {
               
                System.out.print(calendario[i][j]+" ");
                 
            }
             System.out.println();
        }
        // System.out.println("________________");
    }
}

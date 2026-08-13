public class aula7 {
    public static void main(String[] args) {
        //Here we are, to learn about ARRAYS. How Declare, How Works.
        int idades []= new int[3];
        idades[0]=15;idades[1]=2;
        System.out.println(idades[0] + " "+ idades[1]);

        String nomes []= new String[3];
        nomes[0]="Goku";
        nomes[1]="Naruto";
        nomes[2]="Ichigo";
        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
            }
        
        nomes=new String [4];
        nomes[0]="naruto";
        nomes[1]="sasuke";
        nomes[2]="Kakashi";
        for (int i = 0; i < 4; i++) {
            System.out.println(nomes[i]);
            }
        


    }
}

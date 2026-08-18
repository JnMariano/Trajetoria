public class aula9 {
    // Here we made a loop "for" to a simple Array.
    public static void main(String[] args) {
        int[] numeros={1,2,3};
        
        // System.out.print(numeros[0]);
        // for(int i = 0; i<3; i++){
            // System.out.println(numeros[i]);
        // }
        
        // above is foreach  
        for(int x:numeros){
            if(x>1){
                System.out.println(x);
                
            }
        } 

        
    }
}

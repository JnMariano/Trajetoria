import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        // Fazer um levantamento de quanto de taxa pagar de acordo com quant voce recebe
        Scanner input = new Scanner(System.in);
        int sair= 1 ;
        
     
        do {
            System.out.println("Ola Mundo, para iniciarmos o calculo da taxa do salario siga as instrucoes abaixo");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("1- Digite seu salario");
            System.out.println("2- Repetir");
            System.out.println("3- Sair");
            // sair = 0;
            sair = input.nextInt();
            

       }  while (sair!= 3 && sair !=1);
       switch (sair){
        case 1:
            System.out.println("Voce escolheu a opcao 1. Digite o seu salario.");
                int salario = input.nextInt();
                       System.out.println("Seu salario e R$" + salario + ",00");
                            if (salario<=1500){
                                int salario0 = salario;
                                System.out.println("Seu salario recebeu 0% de juros e ficou em: "+ salario0);
                                }
                            else if (salario<=3000){  
                                double salario30 = salario + (salario * 30/100);
                                System.out.println("Seu salario recebeu 30% de juros e ficou em: " +salario30);
                            }
                            else{
                                int salario50 = salario + (salario * 50 / 100);
                                System.out.println("Seu salario recebeu 50% de juros e ficou em: " +salario50);
                                 
                            }
                            break;
        case 3:
            System.out.println("Voce escolheu a opcao de sair!");
            
       }


       

    }
}
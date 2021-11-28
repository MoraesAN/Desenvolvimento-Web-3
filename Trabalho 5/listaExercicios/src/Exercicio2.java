import java.util.Scanner;

public class Exercicio2 {
    private double valor1;
    private double valor2;

    public void dois(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("2. Escreva um algoritmo que receba 2 valores. Verifique: qual o maior valor ou se são iguais");        
        
        System.out.println("Digite o primeiro numero: ");
        valor1 = scan.nextDouble();

        System.out.println("Digite o segundo numero: ");
        valor2 = scan.nextDouble();
        
        if(valor1 < valor2){
            System.out.println(valor2+" é maior");
        } else if(valor1 == valor2){
            System.out.println(valor1+" e "+ valor2+" são iguais");
        } else{ 
            System.out.println(valor1+" é maior");
        }
        scan.close();
    }
    
}

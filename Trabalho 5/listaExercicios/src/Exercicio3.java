import java.util.Scanner;

public class Exercicio3 {
    private double valor1;
    private double valor2;
    private double valor3;

    public void tres(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("3. Escreva um algoritmo que receba 3 valores. Verifique: qual o maior valor ou se são iguais");
        
        System.out.println("Digite o primeiro numero: ");
        valor1 = scan.nextDouble();

        System.out.println("Digite o segundo numero: ");
        valor2 = scan.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        valor3 = scan.nextDouble();
        
        if(valor1 > valor2 && valor1 > valor3){
            System.out.println(valor1+" é maior");
        } else if(valor2 > valor3 && valor2 > valor1){
            System.out.println(valor2+" é maior");
        } else if(valor3 > valor1 && valor3 > valor2){
            System.out.println(valor3+" é maior");
        } else{ 
            System.out.println("os valores são iguais");
        }
        scan.close();
    }    
}

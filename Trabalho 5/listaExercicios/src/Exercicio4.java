import java.util.Scanner;

public class Exercicio4 {
    private double valor1;
    private double valor2;
    private double valor3;

    private double menor;
    private double maior;

    public void quatro(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("4. Escreva um algoritmo que receba 3 valores. Verifique: qual o maior valor qual o menor valor ou se são iguais");
        
        System.out.println("Digite o primeiro numero: ");
        valor1 = scan.nextDouble();

        maior = valor1;
        menor = valor1;

        System.out.println("Digite o segundo numero: ");
        valor2 = scan.nextDouble();

        if(maior < valor2){
            maior = valor2;
        }
        if(menor > valor2){
            menor = valor2;
        }

        System.out.println("Digite o terceiro numero: ");
        valor3 = scan.nextDouble();
        
        if(maior < valor3){
            maior = valor3;
        }
        if(menor > valor3){
            menor = valor3;
        }

        System.out.println((maior == menor)?"os numeros são iguais" : maior+" maior\n"+ menor+" menor");
        
        scan.close();
    }    
}

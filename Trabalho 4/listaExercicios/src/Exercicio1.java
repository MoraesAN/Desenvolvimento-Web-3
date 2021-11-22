import java.util.Scanner;

public class Exercicio1 {
    private double valor1;
    private double valor2;
    private double valor3;
    private double resultado;

    public void media(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("1. Escreva um algoritmo que receba 3 notas. Calcule a média das notas e mostre na tela.");
        
        System.out.println("Digite a primeira nota: ");
        valor1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        valor2 = scan.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        valor3 = scan.nextDouble();
        
        resultado = (valor1+valor2+valor3)/3;
        scan.close();
        System.out.println("Média "+resultado);

    }
}

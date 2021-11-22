import java.util.Scanner;

public class Exercicio2 {
    private double valor1;
    private double valor2;
    private double valor3;
    private double valor4;
    private double resultado;

    public double produto(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("2. Escreva um algoritmo que receba 4 valores. Calcule o produto dos dois primeiros e some com o produto dos dois últimos. Mostre na tela.");
        
        System.out.println("Digite o primeiro numero: ");
        valor1 = scan.nextDouble();

        System.out.println("Digite o segundo numero: ");
        valor2 = scan.nextDouble();
        
        System.out.println("Digite o terceiro numero: ");
        valor3 = scan.nextDouble();

        System.out.println("Digite o quarto numero: ");
        valor4 = scan.nextDouble();
        
        resultado = (valor1*valor2)+(valor3*valor4);
        scan.close();
        return resultado;

    }
    
}

import java.util.Scanner;

public class Exercicio4 {
    private double preco;
    private double desconto = 0.90; //desconto de 10%
    private double resultado;

    public double produto(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("4. Escreva um algoritmo que calcule o desconto de 10% sobre o preço de um produto. Apresente o novo preço na tela.");
        
        System.out.println("Digite o valor do produto: ");
        preco = scan.nextDouble();
        
        resultado = preco*desconto;
        scan.close();
        return resultado;

    }
    
}

import java.util.Scanner;

public class Exercicio5 {
    private double preco;
    private double desconto;

    public void produto(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("5. Escreva um algoritmo que receba um percentual de desconto e calcule esse desconto sobre o preço do produto, apresentando o valor do desconto e o novo preço do produto.");
        
        System.out.println("Digite o valor do produto: ");
        preco = scan.nextDouble();

        System.out.println("Digite o valor do desconto: ");
        desconto = scan.nextDouble();
        
        scan.close();
        System.out.println("Apresentando o valor do desconto, "+ desconto +" e o novo preço do produto, "+preco*desconto+".");

    }
    
}

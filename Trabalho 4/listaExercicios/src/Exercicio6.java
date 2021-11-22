import java.util.Scanner;

public class Exercicio6 {
    private double valor1;
    private double valor2;

    public void produto(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("6. Escreva um algoritmo que receba 2 valores e inverta os valores informados valor1 passa a ter o conteúdo de valor2 e valor2 passa a ter o conteúdo de valor1.");
        
        System.out.println("Digite o valor1: ");
        valor1 = scan.nextDouble();

        System.out.println("Digite o valor2: ");
        valor2 = scan.nextDouble();


        System.out.println("Valor1 "+valor1+ " : Valor2 "+valor2);

        double temporario = valor1;
        valor1 = valor2;
        valor2 = temporario;
        
        scan.close();
        System.out.println("Valor1 "+valor1+ ": Valor2 "+valor2);

    }
    
}

import java.util.Scanner;

public class Exercicio3 {
    private double lado;
    private double area;

    public double produto(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("3. Escreva um algoritmo que calcule a área de um quadrado. Mostre na tela.");
        
        System.out.println("Digite o valor do lado do quadrado: ");
        lado = scan.nextDouble();
        
        area = Math.pow(lado, 2);
        scan.close();
        return area;

    }
    
}

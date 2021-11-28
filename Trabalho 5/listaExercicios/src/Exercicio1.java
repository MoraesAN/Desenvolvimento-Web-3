import java.util.Scanner;

public class Exercicio1 {
    private double valor;
    
    public void um(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("1. Escreva um algoritmo que receba um valor. Mostre se o valor informado é: Par, Ímpar ou Zero");
        
        System.out.println("Digite um valor: ");
        valor = scan.nextDouble();

        scan.close();
        System.out.println((valor == 0)? "Zero" : (valor%2 == 0) ? "Par" : "Ímpar");

    }
}

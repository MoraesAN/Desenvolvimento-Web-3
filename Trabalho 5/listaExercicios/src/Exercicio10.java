import java.util.Scanner;

public class Exercicio10 {
    private Double ingresso = 25.00;

    public void dez(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva um algoritmo que determine o preço com desconto para entradas de cinema. Mostre a categoria, o desconto e o valor final. Desconto não cumulativo.");
        
        System.out.println("Ingresso R$ 25,00.");
        System.out.println("Estudantes recebem 50% de desconto. (R$" +(ingresso*0.5)+")");
        System.out.println("Aposentados recebem 30% de desconto. (R$" +(ingresso*0.7)+")");
        System.out.println("Nas quartas, todos recebem 50% de desconto. (R$" +(ingresso*0.5)+")");
        
        scan.close();
    }
    
}


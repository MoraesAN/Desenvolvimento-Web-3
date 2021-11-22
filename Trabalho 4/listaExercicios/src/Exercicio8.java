import java.util.Scanner;

public class Exercicio8 {
    private int totalPrestacoes;
    private int prestacoesPagas;
    private double valorPrestacao;

    private double devedor;
    
    public void consorcio(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("8. Considerando que, para um consórcio, sabe-se o número total de prestações, a quantidade de prestações pagas e o valor da prestação (fixa), escreva um algoritmo que mostre o saldo devedor do cliente.");
        
        System.out.println("Digite o total de prestações: ");
        totalPrestacoes = scan.nextInt();

        System.out.println("Digite o total de prestações pagas: ");
        prestacoesPagas = scan.nextInt();

        System.out.println("Digite o valor das prestações: ");
        valorPrestacao = scan.nextDouble();
        
        devedor = (totalPrestacoes*valorPrestacao)-(prestacoesPagas*valorPrestacao);
        scan.close();
        System.out.println("Saldo devedor - "+devedor);
    }
    
}

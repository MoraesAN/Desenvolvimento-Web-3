import java.util.Scanner;

public class Exercicio7 {
    private int qdtFruta;
    private int qdtCremoso;
    private int qdtRecheado;
    
    private double valorFruta = 2.5;
    private double valorCremoso = 3.5;
    private double valorRecheado = 4.5;
    
    public void picole(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("7. Uma sorveteria vende três tipos de picolés: os de Frutas custam R$2,50, os Cremosos custam R$ 3,50 e os Recheados custam R$4,50. Escreva um algoritmo que receba a quantidade de picolés vendida de cada tipo e mostre quanto a sorveteria faturou por cada tipo de picolé e no total de vendas.");
        
        System.out.println("Digite a quantidade vendida dos picoles de Frutas: ");
        qdtFruta = scan.nextInt();

        System.out.println("Digite a quantidade vendida dos picoles de Cremosos: ");
        qdtCremoso = scan.nextInt();

        System.out.println("Digite a quantidade vendida dos picoles de Cremosos: ");
        qdtRecheado = scan.nextInt();
        
        scan.close();
        System.out.println("Frutas "+qdtFruta*valorFruta+ "/nCremosos "+qdtCremoso*valorCremoso+"/nRecheado "+qdtRecheado*qdtRecheado);
        System.out.println("Total "+((qdtFruta*valorFruta)+(qdtCremoso*valorCremoso)+(qdtRecheado*valorRecheado)));

    }
    
}

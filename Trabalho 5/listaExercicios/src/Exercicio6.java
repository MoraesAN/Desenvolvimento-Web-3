import java.util.Arrays;
import java.util.Scanner;

public class Exercicio6 {
    private double[] valor = new double[3];

    public void seis(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("6. Escreva um algoritmo que receba 3 valores. Mostre os valores em ordem crescente");

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o "+(i+1)+"º valor: ");
            valor[i] = scan.nextDouble();            
        }
        System.out.println("Saída Sem ordenação");
        for(double v : valor){
            System.out.println(v);
        }
        
        Arrays.sort(valor);

        System.out.println("Saída Com ordenação");
        for(double v : valor){
            System.out.println(v);
        }
        
        scan.close();
    }
    
}

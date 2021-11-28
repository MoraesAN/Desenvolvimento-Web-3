import java.util.Scanner;

public class Exercicio5 {
    private double[] valor = new double[3];
    private double maior = -999;
    private double menor = 9999;
    private double medio = 0;

    public void cinco(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("5. Escreva um algoritmo que receba 3 valores. Verifique: qual o maior valor qual o valor do meio qual o menor valor ou se são iguais");

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o "+(i+1)+"º valor: ");
            valor[i] = scan.nextDouble();
            
            if(i == 0) medio = valor[i];  
            
            if(valor[i] > maior){
                maior = valor[i];
            } else if(valor[i] < menor){
                menor = valor[i];
            }
            if(menor != valor[i] && maior != valor[i]){
                medio = valor[i];
            }
            
        }
        System.out.println("Valor maior: "+maior+"\nValor menor: "+menor+"\nValor do meio: "+medio);
        
        scan.close();
    }
    
}

import java.util.Scanner;

public class Exercicio7 {
    private String sexo;

    private Double altura;
    
    
    public void sete(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("7. Tendo como entrada a altura e o sexo (F: feminino ou M: masculino) de uma pessoa, escreva um algoritmo que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:");
        
        System.out.println("Digite o sexo: (F para feminino ou M para masculino)");
        sexo = scan.nextLine();
        
        System.out.println("Digite a altura: ");
        altura = scan.nextDouble();

        if(sexo == "F" || sexo == "f"){
            System.out.println((62.1 * altura) - 44.7+" Peso ideal");
        }else{
            System.out.println((72.7 * altura) - 58+" Peso ideal");
        }
        
        scan.close();
        
    }
    
}

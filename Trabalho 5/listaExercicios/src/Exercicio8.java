import java.util.Scanner;

public class Exercicio8 {
    private double valor1;
    private double valor2;
    private double valor3;

    public void oito(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("8. Escreva um algoritmo que leia 3 valores representando os 3 lados de um triângulo. Mostre o tipo do triângulo.");
        
        System.out.println("Digite o primeiro numero: ");
        valor1 = scan.nextDouble();

        System.out.println("Digite o segundo numero: ");
        valor2 = scan.nextDouble();

        System.out.println("Digite o terceiro numero: ");
        valor3 = scan.nextDouble();

        if(valor1 == valor2 && valor1 == valor3){
            System.out.println("Equilátero: 3 lados iguais");
        } else if (valor1 == valor2 || valor1 == valor3 || valor3 == valor2){
            System.out.println("Isósceles: 2 lados iguais");
        } else{
            System.out.println("Escaleno: 3 lados diferentes");;
        }
        scan.close();
    }
    
}

import java.util.Scanner;

public class Exercicio9 {
    private String opcao;

    public void nove(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva um algoritmo que construa um menu de cadastro com as opções abaixo.");
        
        //while(opcao != "0"){
            System.out.println("Escolha uma das opções ou 0 para sair:\nC) Cadastrar\nR) Buscar\nU) Alterar\nD) Excluir");
            opcao = scan.nextLine();
        
            switch(opcao){
                case "C":
                    System.out.println("Cadastrar...");
                    break;
                case "R":
                    System.out.println("Buscar...");
                    break;
                case "U":
                    System.out.println("Alterar...");
                    break;
                case "D":
                    System.out.println("Excluir...");
                    break;
                case "0":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("opção inválida");
            }
        //}
        scan.close();
    }
    
}

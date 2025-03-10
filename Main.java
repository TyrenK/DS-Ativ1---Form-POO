import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Bem-vindo ao Sistema de Cadastro de Pessoas! \nEscolha uma operação: \n");
        int op = 0;
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        do{
            System.out.println("1 - Cadastrar uma nova pessoa \n2 - Editar dados de uma pessoa cadastrada \n3 - Apresentar dados cadastrados \n4 - Excluir dados cadastrados \n5 - Sair\n");
            System.out.println("Digite a opção: ");
            op = scanner.nextInt();
            
            switch(op) {
                case 1:
                    System.out.println("Iniciando cadastro! \nInsira seu email: ");
                    
                break;

                case 2:

                break;

                case 3:

                break;

                case 4:

                break;

                case 5:

                break;

                default:

                break;
            }
        }while( op != 5 );
    }
}

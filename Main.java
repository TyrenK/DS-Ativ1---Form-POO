import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Bem-vindo ao Sistema de Cadastro de Pessoas! \nEscolha uma operação: \n");
        int op = 0;
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = null;
        do{
            System.out.println("1 - Cadastrar uma nova pessoa \n2 - Editar dados de uma pessoa cadastrada \n3 - Apresentar dados cadastrados \n4 - Excluir dados cadastrados \n5 - Sair\n");
            System.out.println("Digite a opção: ");
            op = scanner.nextInt();
            
            switch(op) {
                case 1:
                    if(pessoa = null){
                        System.out.println("Iniciando cadastro! \nInsira seu email: ");
                        String email = scanner.nextLine();
                        System.out.println("Insira seu nome: ");
                        String nome = scanner.nextLine();
                        System.out.println("Insira sua idade: ");
                        int idade = scanner.nextInt();
                        pessoa = new pessoa(email, nome, idade);
                        System.out.println("Cadastro realizado com sucesso!");
                    } else{
                        System.out.println("Já há um cadastro feito.");
                    }
                break;

                case 2:
                    if (pessoa != null) {
                        System.out.println("Insira os novos dados: ");
                        System.out.print("Novo email: ");
                        pessoa.setEmail(scanner.nextLine());
                        System.out.print("Nova nome: ");
                        pessoa.setNome(scanner.nextLine());
                        scanner.nextLine(); 
                        System.out.print("Novo idade: ");
                        pessoa.setIdade(scanner.nextInt());
                        System.out.println("Dados atualizados com sucesso!");
                    } else {
                        System.out.println("Não há pessoa cadastrada para editar.");
                    }
                break;

                case 3:
                    if (pessoa != null) {
                        System.out.println("\nDados da Pessoa Cadastrada:");
                        pessoa.apresentarDados();
                    } else {
                        System.out.println("Não há pessoa cadastrada.");
                    }
                break;

                case 4:
                    if (pessoa != null) {
                        pessoa.deletarDados();
                        pessoa = null;
                        System.out.println("Cadastro deletado.");
                    } else {
                        System.out.println("Não há pessoa cadastrada para deletar.");
                    }
                break;

                case 5:
                    System.out.println("Saindo... Até depois!");
                break;

                default:
                    System.out.println("Opção inválida. tente novamente.");
                break;
            }
        }while( op != 5 );
    }
}

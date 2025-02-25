import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nome = "João";
        String tipoConta = "Conta Corrente";
        double saldo = 15000.0;
        int opcao = 0;


        System.out.println("*****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*****************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Depositar valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser transferido: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("O saldo atualizado é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser depositado: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 4) {
                System.out.println("Saindo do sistema...");



                System.out.println("Obrigado por usar nosso sistema! Até a próxima.");

            }
        }
    }
}

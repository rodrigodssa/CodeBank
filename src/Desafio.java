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

        }
    }
}

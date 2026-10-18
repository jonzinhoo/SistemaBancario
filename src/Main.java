import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int x = 1;
        double saldo = 0;
        double valorDeposito;
        double valorSaque;

        while (x != 0){

            System.out.println("================================");
            System.out.println("        SISTEMA BANCÁRIO        ");
            System.out.println("================================");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            System.out.println("--------------------------------");
            System.out.println("Escolha uma opção:");
            System.out.println();


            x = sc.nextInt();

            System.out.println();


            switch (x) {
                case 1:
                    System.out.println("================================");
                    System.out.println("        CONSULTA DE SALDO       ");
                    System.out.println("================================");
                    System.out.printf("    Saldo dísponivel: R$ %.2f%n", saldo);
                    System.out.println("================================");
                    break;

                case 2:
                    System.out.println("================================");
                    System.out.println("    Quanto você deseja depositar:");
                    valorDeposito = sc.nextDouble();

                    if (valorDeposito > 0 ) {
                        saldo += valorDeposito;
                        System.out.println("================================");
                        System.out.println("    DEPÓSITO REALIZADO");
                        System.out.println("================================");
                        System.out.printf("    Valor depositado: R$ %.2f%n", valorDeposito);
                        System.out.printf("    Seu saldo atual é: R$ %.2f%n", saldo);
                        System.out.println("================================");
                    }
                    else {
                        System.out.println("================================");
                        System.out.println("    DEPÓSITO RECUSADO");
                        System.out.println("================================");
                        System.out.println("    Não é possível realizar o depósito");
                        System.out.println("================================");
                    }
                    break;

                case 3:
                    System.out.println("================================");
                    System.out.println("    Qual valor deseja sacar: ");
                    valorSaque = sc.nextDouble();

                    if (saldo >= valorSaque && valorSaque > 0){
                        saldo -= valorSaque;
                        System.out.println("================================");
                        System.out.printf("    Valor sacado: R$ %.2f%n", valorSaque);
                        System.out.printf("    Seu saldo atual é: R$ %.2f%n", saldo);
                        System.out.println("================================");
                    }
                    else {
                        System.out.println("================================");
                        System.out.println("Saque não realizado. Verifique o saldo e o valor informado.");
                        System.out.println("================================");
                    }
                    break;

                case 0:
                    System.out.println("================================");
                    System.out.println("    Sistema encerrando...");
                    System.out.println("================================");
                    break;

                default:
                    System.out.println("Valor Inválido.");
            }
            System.out.println();
        }


        sc.close();

    }
}
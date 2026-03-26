import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int menu;

        Conta conta1 = new Conta();
        Funcionario func1 = new Funcionario();
        do {

            System.out.println("----- SISTEMA BANCÁRIO ----- \n");

            System.out.println("Ola oque deseja fazer hoje:");

            System.out.println(
                    "1. |---Cadastrar conta---|\n2. |Ver dados cadastrados|\n3. |--------Saque--------|\n4. |-------Deposito------|\n5. |---------Sair--------|");

            menu = sc.nextInt();

            sc.nextLine();

            switch (menu) {

                case 1:

                    // Declarando e instanciando um obj da classe Conta

                    // Editando atributos do obj

                    System.out.println("Digite o nome do cliente");

                    conta1.nome = sc.nextLine();

                    System.out.println("Digite o numero da conta");

                    conta1.numero = sc.nextInt();

                    System.out.println("Digite o saldo da conta");

                    conta1.saldo = sc.nextDouble();

                    System.out.println("Digite o limite da conta");

                    conta1.limite = sc.nextDouble();

                    break;

                case 2:

                    System.out.println("----cadastro----");

                    System.out.println(conta1.toString());

                    break;

                case 3:

                    System.out.println("----SAQUE----");

                    System.out.println("Digite o valor do saque");

                    double valor = sc.nextDouble();

                    // conta1.saque(valor);

                    if (conta1.sacarVerifica(valor)) {

                        System.out.println("Saque realizado com sucesso!");

                        System.out.println("Seu Saldo atual é: " + conta1.saldo);

                    } else {

                        System.out.println("Saldo insuficiente!");

                    }

                    break;

                case 4:

                    System.out.println("Quanto você deseja depositar ?: ");

                    double deposito = sc.nextDouble();

                    if (conta1.depositarVerifica(deposito)) {

                        System.out.println("Deposito realizado com sucesso!");

                        System.out.println("Seu Saldo atual é: " + conta1.saldo);

                    } else {

                        System.out.println("Valor invalido!");

                    }

                    break;

                default:

                    System.out.println("digite um valor valido (1 a 5)!!!");

                    break;

            }

        } while (menu != 5);

        sc.close();

    }

}
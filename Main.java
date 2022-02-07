import java.util.Scanner;
import java.lang.Thread;

public class Main{
    public static void main(String[] args) {
        int controller_conta = 0;
        float Movimento = 0;
        Scanner scanner = new Scanner(System.in);
        // Conta _conta = new Conta("Josia", 1000);

        Conta _conta = new Conta();
        System.out.println("Digite o seu nome de utilizador: ");
        _conta.setName(scanner.nextLine());
        System.out.println("O senhor "+_conta.getName()+" tem 4 operacoes");
        while(controller_conta!=5){
            System.out.println("Para continuar selecione uma das opções do sistema\n");
            System.out.println("Para consultar seu saldo selecione 1\n");
            System.out.println("Para depositar o seu kumbo selecione 2\n");
            System.out.println("Para transferencias selecione 3\n");
            System.out.println("Para Sacagem de saldo selecione 4\n");
            System.out.println("Para Sair do sistema selecione 5\n");
            controller_conta = scanner.nextInt();switch (controller_conta) {
                case 1:
                    System.out.println("Saldo: "+_conta.consultar());
                    break;
                case 2:
                    System.out.println("Valor a depositar: ");
                    Movimento = scanner.nextFloat();
                    if(_conta.depositar(Movimento)){
                        System.out.println("Deposito feito com successo");
                    }
                    else System.out.println("Valor invalido");
                    break;
                case 3:
                    System.out.println("Quanto deseja transferir?");
                    Movimento = scanner.nextFloat();
                    if(_conta.transferir(Movimento)) System.out.println("Transferencia feita com successo");
                    else System.out.println("Saldo insuficiente, faça um deposito");
                    break;
                case 4:
                    System.out.println("Valor para sacar: ");
                    Movimento = scanner.nextFloat();
                    if (_conta.sacar(Movimento)) System.out.println("Sacagem realizada");
                    else System.out.println("Saldo insuficiente, faça um deposito");
                    break;
                case 5:
                    System.out.println("Obrigado por usar o nosso sistema bancario <3");
                    break;
                default:
                    System.out.println("Invalido");
                    break;
            }
            try {
                System.out.println("...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }
}
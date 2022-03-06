import repositories.Conta;
import repositories.ContaCorrente;
import repositories.ContaPopanca;

class Main {
     public static void main(String[] args) {
        Conta conta = new ContaCorrente();
        Conta poupanca = new ContaPopanca();

        System.out.println(conta.imprimirExtrato());


        System.out.println(poupanca.imprimirExtrato());
         
     }
 }
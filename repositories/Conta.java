package repositories;

public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIA = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIA++;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    @Override
    public void sacar(double valor) {
        saldo-=valor;
        
    }
    @Override
    public void depositar(double valor) {
        saldo+=valor;
    }
    @Override
    public void transferir(double valor, Conta conta) {
        this.saldo-=valor;
        conta.depositar(valor);
    }
    public String imprimirExtrato(){
        return "*******EXTRATO***********\nAgencia: "+this.agencia+"\nNumero: "+this.numero+"\nSaldo: "+this.saldo;
    }

}

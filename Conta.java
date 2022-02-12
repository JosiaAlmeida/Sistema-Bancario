public class Conta {
    private String nome;
    private float saldo;
    private static Conta instance;


    private Conta(String nome, float saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    String getName(){
        return this.nome;
    }
    float getSaldo(){
        return this.saldo;
    }

    public static Conta Instance(String nome, float saldo){
        if(Conta.instance == null){
            Conta.instance = new Conta(nome, saldo);
        }
        return Conta.instance;
    }

    public void setName(String n){
        this.nome = n;
    }
    public void setSaldo(float n){
        this.saldo = n;
    }

    public Boolean depositar(float saldo){
        if(saldo>0){
            setSaldo(saldo+getSaldo());
            return true;
        }
        return false;
    }

    public Boolean sacar(float valor){
        if(valor>0 && valor< getSaldo()){
            float saldoRestante =getSaldo()- valor;
            setSaldo(saldoRestante);
            return true;
        }
        return false;
    }

    public String consultar(){
        return getName()+"\n"+getSaldo();
    }

    public Boolean transferir(float saldo, Conta user){
       if(getSaldo()>=saldo && !user.getName().isEmpty()){
        setSaldo(getSaldo()-saldo);
        return true;
       }
       return false;
    }

}

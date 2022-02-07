public class Conta {
    private String nome;
    private float saldo;

    Conta(String nome, float saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    Conta(){}
    Conta(float saldo){
        this.saldo=saldo;
    }
    String getName(){
        return this.nome;
    }
    public void setName(String n){
        this.nome = n;
    }
    public float getSaldo(){
        return this.saldo;
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

    public Float consultar(){
        return getSaldo();
    }

    public Boolean transferir(float saldo){
       if(getSaldo()>=saldo){
        float saldoTotal = getSaldo()-saldo;
        setSaldo(saldoTotal);
        return true;
       }
       else return false;
    }

}

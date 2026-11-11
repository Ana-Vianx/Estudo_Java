public class Conta{
    protected double saldo;
    private String titular;

    public double getSaldo(){
        return saldo;
    }
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String novoTitular){
        titular = novoTitular;
    }
}
package model;

public class ContaPoupanca extends Conta {

    private final float RENDIMENTO = 0.01f;
    
    public void aplicarRendimento() {
        float saldo = super.getSaldo();
        saldo *= RENDIMENTO;
        super.setSaldo(saldo);
    }
    
    @Override
    public boolean equals(Object obj) {
        ContaCorrente c = (ContaCorrente) obj;
        return (this.getAgencia()==c.getAgencia() && this.getConta()==c.getConta());
    }

    @Override
    public String toString() {
        return "ContaPoupanca{"
                + "Agencia="+super.getAgencia()
                + ", Conta="+super.getConta()
                + "Saldo="+super.getSaldo()
                + "}";
    }
    
}

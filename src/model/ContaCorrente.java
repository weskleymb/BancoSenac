package model;

public class ContaCorrente extends Conta {

    @Override
    public boolean equals(Object obj) {
        ContaCorrente c = (ContaCorrente) obj;
        return (this.getAgencia()==c.getAgencia() && this.getConta()==c.getConta());
    }

    @Override
    public String toString() {
        return "ContaCorrente{"
                + "Agencia="+super.getAgencia()
                + ", Conta="+super.getConta()
                + "Saldo="+super.getSaldo()
                + "}";
    }
    
}

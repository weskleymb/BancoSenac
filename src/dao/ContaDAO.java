package dao;

import java.util.ArrayList;
import java.util.List;
import model.Conta;

public class ContaDAO {

    private List<Conta> contas;

    public ContaDAO() {
        this.contas = new ArrayList<>();
    }
    
    public String inserir(Conta conta) {
        if (!this.contas.contains(conta)) {
            this.contas.add(conta);
            return "CONTA CADASTRADA!";
        }
        return "CONTA NÃO CADASTRADA!";
    }
    
    public Conta buscarPorAgenciaConta(int agencia, int conta) {
        for (Conta c : this.contas) {
            if (c.getAgencia() == agencia && c.getConta() == conta) {
                return c;
            }
        }
        return null;
    }
    
}

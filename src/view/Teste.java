package view;

import dao.ClienteDAO;
import dao.ContaDAO;
import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Teste {

    public static void main(String[] args) {
        
        ContaDAO dao = new ContaDAO();
        
        ContaCorrente cc = new ContaCorrente();
        cc.setAgencia(1);
        cc.setConta(1);
        cc.setSaldo(500);
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.setAgencia(1);
        cp.setConta(2);
        cp.setSaldo(200);
        
        dao.inserir(cc);
        dao.inserir(cp);
        
        dao.buscarPorAgenciaConta(1, 1).sacar(100);
        
        System.out.println(dao.buscarPorAgenciaConta(1, 1).toString());
        
    }
    
}

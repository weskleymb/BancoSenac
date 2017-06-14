package view;

import dao.ClienteDAO;
import model.Cliente;

public class Teste {

    public static void main(String[] args) {
        
        ClienteDAO dao = new ClienteDAO();
        
        Cliente a = new Cliente("111.111.111-11", "JOSE DOS ANZOIS");
        Cliente b = new Cliente("222.222.222-22", "CHICO CAICO");
        Cliente c = new Cliente("333.333.333-33", "PEDO GOMES");
        
        dao.inserir(a);
        dao.inserir(b);
        dao.inserir(c);
        
        dao.editar(new Cliente("333.333.333-33", "MAURICIO SANTANA"));
        
        dao.remover("222.222.222-22");
        
        System.out.println(dao.buscarTodos().toString());
        
    }
    
}

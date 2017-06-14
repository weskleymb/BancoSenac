package dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClienteDAO {

    private List<Cliente> clientes;

    public ClienteDAO() {
        this.clientes = new ArrayList<>();
    }
    
    public String inserir(Cliente cliente) {
        if (!this.clientes.contains(cliente)) {
            this.clientes.add(cliente);
            return "CLIENTE CADASTRADO!";
        }
        return "CLIENTE NÃO CADASTRADO!";
    }
    
    public String remover(String cpf) {
        Cliente cliente = buscarPorCpf(cpf);
        if (cliente != null) {
            this.clientes.remove(cliente);
            return "CLIENTE REMOVIDO!";
        }
        return "CLIENTE NÃO REMOVIDO!";
    }
    
    public String  editar(Cliente cliente) {
        if (this.clientes.contains(cliente)) {
            int indice = this.clientes.indexOf(cliente);
            this.clientes.set(indice, cliente);
            return "CLIENTE ALTERADO!";
        }
        return "CLIENTE NÃO ALTERADO!";
    }
    
    public List<Cliente> buscarTodos() {
        return this.clientes;
    }
    
    public Cliente buscarPorCpf(String cpf) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
    
}

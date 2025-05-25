package com.clienteapp.bo;

import com.clienteapp.model.Cliente;
import com.clienteapp.dao.ClienteDAO;
import java.util.List;

public class ClienteBO {
    private ClienteDAO clienteDAO = new ClienteDAO();

    public void cadastrarCliente(Cliente cliente) {
        if (cliente.getNome().isEmpty() || cliente.getEmail().isEmpty()) {
            System.out.println("Erro: Nome e e-mail são obrigatórios.");
            return;
        }
        clienteDAO.salvar(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public List<Cliente> listarClientes() {
        return clienteDAO.listarTodos();
    }
}
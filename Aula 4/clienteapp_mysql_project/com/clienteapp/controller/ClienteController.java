package com.clienteapp.controller;

import com.clienteapp.bo.ClienteBO;
import com.clienteapp.model.Cliente;
import java.util.List;
import java.util.Scanner;

public class ClienteController {
    private ClienteBO clienteBO = new ClienteBO();

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Cliente ===");
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Cliente cliente = new Cliente(id, nome, email);
        clienteBO.cadastrarCliente(cliente);

        System.out.println("\n=== Lista de Clientes ===");
        List<Cliente> clientes = clienteBO.listarClientes();
        for (Cliente c : clientes) {
            System.out.println("ID: " + c.getId() + " | Nome: " + c.getNome() + " | Email: " + c.getEmail());
        }

        scanner.close();
    }
}
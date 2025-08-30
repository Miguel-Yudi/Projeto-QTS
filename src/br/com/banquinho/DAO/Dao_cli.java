package br.com.banquinho.DAO;

import java.util.ArrayList;
import br.com.banquinho.entity.Cliente;

public class Dao_cli {
	ArrayList<Cliente> clientes = new ArrayList<>();

	public void AddClient(Cliente cli) {
		clientes.add(cli);
	}

	public void removeClient(Cliente cli) {
		clientes.remove(cli);
	}

	public boolean getIdCli(int id) {
		for (Cliente cli : clientes) {
			if (id == cli.getId()) {
				return true;
			}
		}
		return false;
	}
	
	public void idInf (long id)
	{
	    boolean flag = false;
		for (Cliente cli: clientes)
		{
			if (id == cli.getId() || id == cli.getCpf())
			{
				System.out.println("Name: " + cli.getName() + "\n cpf: " + cli.getCpf() + "\n id: " + cli.getId());
				flag = true;
			}
			
		}
		if (flag == false)
		{
			System.out.println ("Id invalido ou cpf invalido");
		}
	}

	public void listCli() {
		for (Cliente cli : clientes) {
			System.out.println("Name: " + cli.getName() + "\n cpf: " + cli.getCpf() + "\n id: " + cli.getId());
		}
	}

	public int size() {
		System.out.println("Your id is " + clientes.size());
		return clientes.size();
	}
	public boolean flagById(int id) {
		boolean flag = false;
		for (Cliente cli :clientes) {
			if (id == cli.getId()) {
				flag = true;
			}
		}
		return flag;
	}

}

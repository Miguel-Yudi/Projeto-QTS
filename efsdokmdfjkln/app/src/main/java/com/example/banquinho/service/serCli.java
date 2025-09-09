package com.example.banquinho.service;

import com.example.banquinho.DAO.Dao_cli;
import com.example.banquinho.DAO.Dao_con;
import com.example.banquinho.entity.Cliente;

public class serCli {
	Dao_cli daoCli = new Dao_cli();
	Dao_con daoCon = new Dao_con();
	

	public boolean Addcliente(long cpf, String nome) {

		Cliente cliente = new Cliente();
		cliente.setName(nome);
		cliente.setCpf(cpf);
		cliente.setId(daoCli.size());

		daoCli.AddClient(cliente);
                return true;

	}

	public boolean getIdCli(int Id) {
		return daoCon.flagById(Id);
	}

	public void listCli() {
		daoCli.listCli();
	}

	public boolean checkName(String name) {
		boolean flag = true;
		for (char letra : name.toCharArray()) {
			if (Character.isLetter(letra) == false) {
				flag = false;
			}
			
		}
		if (name.equals(""))
		{
			flag = false;
		}

		return flag;

	}

	public long checkCpf(String cpf) {
		cpf = cpf.replace("-", "").replace(".", "");
		if (cpf.length() != 11) {
			return 0;
		}
		long cpf2 = 0;
		try {
			cpf2 = Long.parseLong(cpf);
		} catch (Exception e) {
			return 0;
		}
		return cpf2;
	}

	public boolean idInf(String id) {
		id = id.replace("-", "").replace(".", "");
		long id2 = 0;
		try
		{
		 id2 = Long.parseLong(id);
		}
		catch (Exception e)
		{
			return false;
		}
		
		daoCli.idInf(id2);
		return true;
	}
	public boolean flagById(int id) {
		return daoCli.flagById(id);
	}
}

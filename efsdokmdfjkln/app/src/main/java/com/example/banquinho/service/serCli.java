package com.example.banquinho.service;

import com.example.banquinho.DAO.Dao_cli;
import com.example.banquinho.DAO.Dao_con;
import com.example.banquinho.entity.Cliente;

public class serCli {
	Dao_cli daoCli = new Dao_cli();
	Dao_con daoCon = new Dao_con();
	

	public int Addcliente(long cpf, String nome) {
            
                if (nome == null || nome.isEmpty()) {
                System.out.println("Your name cannot be empty");
                return 1;
    }
                for (char letra : nome.toCharArray()) {
                if (!Character.isLetter(letra)) {
                System.out.println("Your name cannot have numbers or special characters");
                return 2;
        }
    }

             
              String cpfStr = String.valueOf(cpf);
              if (cpfStr.length() != 11) {
              System.out.println("Your cpf needs to have 11 numbers");
              return 3;
    }

		Cliente cliente = new Cliente();
                cliente.setName(nome);
                cliente.setCpf(cpf);
                cliente.setId(daoCli.size());

                daoCli.AddClient(cliente);

                System.out.println("Your id is " + cliente.getId());

                 return 0; 

	}

	public boolean getIdCli(int Id) {
		return daoCon.flagById(Id);
	}

	public void listCli() {
		daoCli.listCli();
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

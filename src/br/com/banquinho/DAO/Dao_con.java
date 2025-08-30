package br.com.banquinho.DAO;

import java.util.ArrayList;

import br.com.banquinho.entity.Conta;

public class Dao_con {
	ArrayList<Conta> contas = new ArrayList<>();

	public void AddAccount(Conta con) {
		contas.add(con);
	}

	public void RemoveAccount(Conta con) {
		contas.remove(con);
	}

	public void ListCon() {
		for (Conta con : contas) {
			System.out.println("Account id: " + con.getNumber() + "\n Owner id: " + con.getIdCliente() + "\n Balance: "
					+ con.getSaldo());
		}
	}

	public void Deposito(int id, double deposito) {
		for (Conta con : contas) {
			if (id == con.getNumber()) {
				con.setSaldo(con.getSaldo() + deposito);
			}
		}
	}

	public void Saque(int id, double saque) {
		for (Conta con : contas) {
			if (id == con.getNumber()) {
				con.setSaldo(con.getSaldo() - saque);
			}
		}
	}

	public void transfer(int idOrigin, int idDestiny, double valor) {
		for (Conta con : contas) {
			if (idOrigin == con.getNumber()) {
				con.setSaldo(con.getSaldo() - valor);
			}
		}
		for (Conta con : contas) {
			if (idDestiny == con.getNumber()) {
				con.setSaldo(con.getSaldo() + valor);
			}
		}	
	}

	public boolean flagById(int id) {
		for (Conta con : contas) {
			if (id == con.getNumber()) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		System.out.println("Your account id is " + contas.size());
		return contas.size();
	}

	public Conta getConById(int id) {
		for (Conta con : contas) {
			if (id == con.getNumber()) {
				return con;
			}
		}
		return null;
	}

	public void idInf(int id) {
		for (Conta con : contas) {
			if (id == con.getNumber())
			{
				System.out.println("Account id: " + con.getNumber() + "\n Owner id: " + con.getIdCliente() + "\n Balance: "
						+ con.getSaldo());
			}
		}
	}
	public void idInfCli(int id) {
		boolean flag = true;
		for (Conta con : contas) {
			if (id == con.getIdCliente())
			{
				System.out.println("Account id: " + con.getNumber() + "\n Owner id: " + con.getIdCliente() + "\n Balance: "
						+ con.getSaldo());
				flag = false;
			}
		}
		if (flag == true)
		{
			System.out.println ("Invalid id");
		}
	}

}

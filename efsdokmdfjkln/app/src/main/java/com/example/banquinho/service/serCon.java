package com.example.banquinho.service;

import com.example.banquinho.DAO.Dao_cli;
import com.example.banquinho.DAO.Dao_con;
import com.example.banquinho.entity.Conta;

public class serCon {

	Dao_con daoCon = new Dao_con();
	Dao_cli daoCli = new Dao_cli();
	

	public void Addconta(int idCliente) {

		Conta conta = new Conta();

		conta.setIdCliente(idCliente);
		conta.setSaldo(0);
		conta.setNumber(daoCon.size());
		daoCon.AddAccount(conta);


	}

	public void listCon() {
		daoCon.ListCon();
	}

	public Double Deposito(int id, double deposito) {
		int flag = 0;
                Conta conta;
		if (daoCon.flagById(id) == true) {
			flag = flag + 1;

		} else {
			System.out.println("Invalid id");
		}
		if (deposito > 0) {
			flag = flag + 1;
		} else {
			System.out.println("Invalid value");
                        return null;
		}
		if (flag == 2) {
			daoCon.Deposito(id, deposito);
		}
                conta=daoCon.getConById(id);
                        return conta.getSaldo();
	}

	public void saque(int id, double saque) {
		Conta con = daoCon.getConById(id);
		int flag = 0;
		if (daoCon.flagById(id) == true) {
			flag = flag + 1;
		} else {
			System.out.println("Invalid id");
		}
		if (con.getSaldo() > saque) {
			flag = flag + 1;
		} else {
			System.out.println("Your balance isn't suficient");
		}
		if (flag == 2) {
			daoCon.Saque(id, saque);
		}

	}

	public double[] transferencia(int idOrigin, int idDestiny, double valor) {
		Conta con = daoCon.getConById(idOrigin);
                Conta con2 = daoCon.getConById(idDestiny);
              
		if (con.getSaldo() > valor) {
			daoCon.transfer(idOrigin, idDestiny, valor);
                        
                        double[] valores = {con.getSaldo(),con2.getSaldo()};
                        return valores;
		} else {
			System.out.println("Your balance isn't suficient");
                        return null;
		}
	}

	public boolean flagById(int id) {
		return daoCon.flagById(id);
	}

	public Conta idInf(int id) {
		if (daoCon.flagById(id) == true) {
			Conta con = daoCon.idInf(id);
                        return con;
		} else {
			System.out.println("Invalid id");
                        return null;
		}

	}

	public void idInfCli(int id) {

		daoCon.idInfCli(id);
	}
}
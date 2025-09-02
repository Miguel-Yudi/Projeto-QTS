package br.com.banquinho.entity;

public class Conta {
	private double saldo;
	private int idCliente;
	private int idCon;

	public int getNumber() {
		return idCon;
	}

	public void setNumber(int number) {
		this.idCon = number;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idcliente) {
		this.idCliente = idcliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}

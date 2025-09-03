package com.example.efsdokmdfjkln;

import java.util.Scanner;

import com.example.banquinho.entity.Cliente;
import com.example.banquinho.entity.Conta;
import com.example.banquinho.service.serCli;
import com.example.banquinho.service.serCon;

public class main {

	public static void main(String[] args) {

		serCli serCli = new serCli();
		serCon serCon = new serCon();
		Scanner input = new Scanner(System.in);
		Conta con = new Conta();

		boolean rept = true;

		while (rept == true) {
			System.out.println(
					"Type 1 to create a client account or see your client account details \nType 2 to create an account or see informations related to your bank accounts if you're alredy registred client.");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println(
						"Type 1 to create a new account \nType 2 to see your account details\nType 3 to come back to the menu");
				int choice2 = input.nextInt();
				switch (choice2) {
				case 1:
					boolean rept3 = true;
					String nome = "";
					input = new Scanner(System.in);
					while (rept3 == true) {
						System.out.println("What's your name?");
						nome = input.nextLine();
						if (serCli.checkName(nome) == true) {
							rept3 = false;
						} else {
							System.out.println("Invalid name");
						}
					}
					boolean rept4 = true;
					String cpf = "";
					while (rept4 == true) {
						System.out.println("What's your cpf?");
						cpf = input.nextLine();
						if (serCli.checkCpf(cpf) == 0) {
							System.out.println("Invalid cpf");
						} else {
							rept4 = false;
						}
					}

					serCli.Addcliente(serCli.checkCpf(cpf), nome);
					break;

				case 2:
					input = new Scanner(System.in);
					System.out.println("Say your id or your cpf");
					String id4 = "";
					id4 = input.nextLine();
					if (serCli.idInf(id4) == true) {
						
					} else {
						System.out.println("Invalid id or cpf");
					}
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;
			case 2:
				System.out.println(
						"Type 1 to create a new account \nType 2 to do a deposit\nType 3 to do a withdraw\nType 4 to do a transference\nType 5 to see your account informations\nType 6 to see all your accounts\nType 7 to come back to the menu.");
				int choice3 = input.nextInt();
				switch (choice3) {
				case 1:

					boolean rept2 = true;
					System.out.println("What's your client id?");
					int id = input.nextInt();
					if (serCli.flagById(id) == true)
					{
					serCon.Addconta(id);
					}
					else
					{
						System.out.println("Invalid id");
					}
					
					break;

				case 2:
					boolean rept4 = true;
					
					System.out.println("Say the id of the account, that you want to do a deposit");
					int id2 = 0;
					id2 = input.nextInt();
					System.out.println("Say how much you want to deposit (in reais)");
					double valor = input.nextDouble();
					serCon.Deposito(id2, valor);
					
					break;
				case 3:
					System.out.println("Say the id of the account, that you want to do a withdraw");
					int id3 = input.nextInt();
					System.out.println("Say how much you want to withdraw (in reais)");
					double valor3 = input.nextDouble();
					serCon.saque(id3, valor3);
					break;
				case 4:
					input = new Scanner(System.in);
					System.out.println("What's your account's id?");
					int idOrigin = input.nextInt();
					System.out.println("What's the id of the account that will recive the money.");
					int idDestiny = input.nextInt();
					System.out.println("Say how much you want to transfer (in reais)");
					double value = input.nextDouble();

					serCon.transferencia(idOrigin, idDestiny, value);
					break;

				case 5:
					System.out.println("Say your account's id");
					int id5 = input.nextInt();
					serCon.idInf(id5);
					break;
				
				case 6:
					System.out.println("What's your client id?");
					int id6 = input.nextInt();
					serCon.idInfCli(id6);
					break;
				case 7:
					
				default:
					System.out.println ("Invalid choice");
				}
				break;
				default:
					System.out.println ("Invalid choice");
			}
		}

	}

}

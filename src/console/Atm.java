package console;

import java.util.Scanner;

import controller.GestaoConta;
import model.Conta;

public class Atm {
	
	Scanner read = new Scanner(System.in);
	Main m = new Main();
	
	public Atm(){
		// TODO Auto-generated method stub
		
		int op=0;
		
		do{
			
			System.out.println("\n\tMenu:");
			System.out.println(" 1- Inserir conta;\n"
								+ " 2- Listar Clientes;\n"
								+ " 3- Login;\n"
								+ " 0- Sair;\n");
			
			System.out.print("Insira o aopção que deseja: ");
			op = read.nextInt();
		
			System.out.println();
			
			switch(op){
			
			case 1: 
				
				read.nextLine();
				
				System.out.print("Nome: ");
				String nome = read.nextLine();
				
				System.out.print("Pass: ");
				String pass = read.nextLine();
				
				new GestaoConta().add(m.c, nome, pass);
				
				break;
				
			case 2:
				new GestaoConta().print(m.c,null ,true);
				break;
				
			case 3: 
				System.out.println("Login:\n");
				
				read.nextLine();
				
				System.out.print("Nome:");
				nome = read.nextLine();
				
				System.out.print("Pass: ");
				pass = read.nextLine();
				
				Conta ct = new GestaoConta().login(m.c,nome,pass);
				
				if(ct != null){
					menuLogin(ct);
				}
				else{
					System.out.println("\nCredenciais erradas!\n");
				}
				
				break;
				
			case 0: System.out.println("\nVai Sair!"); break;
			
			default: System.out.println("\nOpção Errada!");
			
			}
			
		}while(op != 0);
	}

	public void menuLogin(Conta ct){
		
		int op=0;
		
		do{
		
			System.out.println("\n\tMenu:");
			System.out.println(" 1- Transfência;\n"
								+ " 2- Deposito;\n"
								+ " 3- Levatamento;\n");
			
			System.out.print("Insira o aopção que deseja: ");
			op = read.nextInt();
		
			System.out.println();
			
			switch(op){
			
			case 1: 
				System.out.print("Clientes:\n");
				new GestaoConta().print(m.c,ct ,false);
				
				System.out.print("\nInsira a conta que deseja transferir: ");
				int id=0;
				Conta ct2 = m.c.get((id = read.nextInt())-1);
				
				System.out.print("\nInsira a quantidade que deseja transferir: ");
				float m = read.nextFloat();
				
				if(ct.getSaldo() >= m){
					new GestaoConta().levantar(ct, m);
					new GestaoConta().depositar(ct2, m);
				}
				else{
					System.out.println("\nSaldo Insuficiente!\n");
				}
				
				break;
				
			case 2:
				System.out.printf("Insira a quantidade que deseja depositar: ");
				m = read.nextFloat();
				
				new GestaoConta().depositar(ct, m);
				break;
				
			case 3:
				System.out.printf("Insira a quantidade que deseja levantar: ");
				m = read.nextFloat();
				
				if(ct.getSaldo() >= m){
					new GestaoConta().depositar(ct, m);
				}
				else{
					System.out.println("\nSaldo Insuficiente!\n");
				}
				break;
				
			case 0: System.out.println("\nVai Sair!"); break;
			
			default: System.out.println("\nOpção Errada!"); 
			
			}
			
		}while(op!= 0);
		
	}
}

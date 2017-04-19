package console;

import java.util.ArrayList;
import java.util.Scanner;

import model.Carro;
import model.Conta;

public class Main {

	static Scanner read = new Scanner(System.in);
	static ArrayList<Conta> c = new ArrayList<Conta>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op=0;
		
		do{
			
			System.out.println("\n\tMenu:");
			System.out.println(" 1- ATM;\n"
								+ " 2- Stand;\n"
								+ " 0- Sair\n");
			
			System.out.print("Insira o aopção que deseja: ");
			op = read.nextInt();
		
			System.out.println();
			
			switch(op){
			
			case 1: new Atm(); break;
			case 2: new Stand(); break;
			
			case 0: System.out.println("\nVai Sair!"); break;
			
			default: System.out.println("\nOpção Errada!");
			
			}
			
		}while(op != 0);
		
	}

}

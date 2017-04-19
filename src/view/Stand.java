package view;

import java.util.Scanner;

import model.Conta;

public class Stand {

	Scanner read = new Scanner(System.in);
	Main m = new Main();
	
	public boolean checkC(){
		for(Conta ct : m.c){
			if(ct.equals("Stand") || ct.equals("stand")){
				return true;
			}
		}
		
		return false;
		
	}
	
	public Stand(){
		
		if(checkC() == true){
			
			int op=0;
			
			do{
				
				System.out.println("\n\tMenu:");
				System.out.println(" 1- Comprar Carro;\n"
									+ " 2- Vender Carro;\n"
									+ " 0- Sair\n");
				
				System.out.print("Insira o aopção que deseja: ");
				op = read.nextInt();
			
				System.out.println();
				
			}while(op != 0);
			
			
		}else{
			System.out.println("\nInsira conta de Stand.");
		}
	
	}
}

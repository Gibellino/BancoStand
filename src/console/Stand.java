package console;

import java.util.Scanner;

import controller.GestaoCarro;
import controller.GestaoConta;
import model.Conta;

public class Stand {

	Scanner read = new Scanner(System.in);
	Main m = new Main();
	
	public Conta checkC(){
		for(Conta ct : m.c){
			if(ct.equals("Stand") || ct.equals("stand")){
				return ct;
			}
		}
		
		return null;
		
	}
	
	public Stand(){
		
		Conta stand = checkC();
		
		if(stand != null){
			
			int op=0;
			
			do{
				
				System.out.println("\n\tMenu:");
				System.out.println(" 1- Comprar Carro;\n"
									+ " 2- Vender Carro;\n"
									+ " 0- Sair\n");
				
				System.out.print("Insira o aopção que deseja: ");
				op = read.nextInt();
			
				System.out.println();
				
				switch(op){
					
				case 1: 
					System.out.print("Insira a marca do carro: ");
					String marca = read.nextLine();
					
					System.out.print("Insira o modelo do carro: ");
					String modelo = read.nextLine();
					
					System.out.print("Insira o preço de compra do carro: ");
					float precoC = read.nextFloat();
					
					System.out.println("Insira o preço de venda do carro: ");
					float precoV = read.nextFloat();
					
					if(stand.getSaldo() >= precoC){
						new GestaoConta().comprarCarro(stand,new GestaoCarro().add(marca, modelo, precoC, precoV));
					}
					else{
						System.out.println("\nSaldo Insuficiente!\n");
					}
				}
				
			}while(op != 0);
			
			
		}else{
			System.out.println("\nInsira conta de Stand.");
		}
	
	}
}

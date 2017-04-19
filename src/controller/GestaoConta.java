package controller;

import java.util.ArrayList;

import model.Carro;
import model.Conta;

public class GestaoConta {

	public void add(ArrayList<Conta> c, String n, String p){
		
		c.add(new Conta(n, p));
		
	}
	
	public Conta login(ArrayList<Conta> c, String n, String p){
		
		for(Conta conta : c){
			if(conta.getNome().equals(n) && conta.getPass().equals(p)){
				return conta;
			}
		}
		
		return null;
		
	}
	
	public void levantar(Conta c,float m){
		c.setSaldo(c.getSaldo()-m);
	}
	
	public void depositar(Conta c, float m){
		c.setSaldo(c.getSaldo()+m);
	}
	
	public void comprarCarro(Conta stand, Carro cr){
	
				stand.getCarros().add(cr);
	}
	
	
	public void print(ArrayList<Conta> conta, Conta ct ,boolean b){
		
		int i=1;
		
		for(Conta c : conta){
			if(b == true){
				System.out.printf(c.toString());
			}
			else{
				if(c != ct){
					System.out.println(i + " " + c.getNome());
				}
				i++;
			}
			
		}
	}
}

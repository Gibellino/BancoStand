package model;

import java.util.ArrayList;

public class Conta {

	private String nome, pass;
	private float saldo;
	private ArrayList<Carro> carros;
	
	public Conta(String nome, String pass) {
		this.nome = nome;
		this.pass = pass;
		this.saldo = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	public ArrayList<Carro> getCarros() {
		return carros;
	}

	public void setCarros(ArrayList<Carro> carros) {
		this.carros = carros;
	}

	public String toString(){
		return " Nome: " + getNome() + "\n"
			+ " Pass: " + getPass() + "\n"
			+ " Saldo: " + getSaldo() + "\n";
	}
	
}


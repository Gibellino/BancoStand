package controller;

import model.Carro;

public class GestaoCarro {

	public Carro add(String marca, String modelo, float precoC, float precoV){
		
		return new Carro(marca, modelo, precoC, precoV);
	}
	
	
}

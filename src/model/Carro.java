package model;

public class Carro {

	private String marca, modelo;
	private float preco;
	
	public Carro(String marca, String modelo, float preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}

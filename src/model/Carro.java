package model;

public class Carro {

	private String marca, modelo;
	private float precoC, precoV;
	
	public Carro(String marca, String modelo, float precoC, float precoV) {
		this.marca = marca;
		this.modelo = modelo;
		this.precoC = precoC;
		this.precoV = precoV;
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

	public float getPrecoC() {
		return precoC;
	}

	public void setPrecoC(float preco) {
		this.precoC = preco;
	}

	public float getPrecoV() {
		return precoV;
	}

	public void setPrecoV(float precoV) {
		this.precoV = precoV;
	}
	
	public String toString(){
		return "Marca: " + getMarca() + "\n"
				+ "Modelo: " + getModelo() + "\n"
				+ "Preço Compra: " + getPrecoC() + "\n"
				+ "Preço Venda: " + getPrecoV() + "\n";
	}
}

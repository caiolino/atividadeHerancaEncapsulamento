package model;

public class Eletrodomestico {
	
	private String modelo;
	
	private String marca;
	
	private int tensao;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	
	public void ligar() {
		System.out.println("O "+this.modelo+" esta ligado");
	}
	
	public void desligar() {
		System.out.println("O "+this.modelo+" esta desligado");
	}

}

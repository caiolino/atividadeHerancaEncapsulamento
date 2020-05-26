package model;

public class Veiculo {
	
	private String marca;
	
	private String modelo;
	
	private String cor;
	
	private float velocidade = 0;
	
	private float velocidadeMax;

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

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public float getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(float velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void acelerar() {
		
		if(this.velocidade<this.velocidadeMax) {
			this.velocidade = this.velocidade + 10;
			System.out.println("A velocaidade agora é de: "+this.velocidade+"km/h");
		}else {
			System.out.println("Voce esta na  velocaidade MAXIMA!");
		}
	}
	
	public void frear() {
		if (this.velocidade == 0) {
			System.out.println("O veiculo esta parado");
		}else{
			this.velocidade = this.velocidade -10;
			System.out.println("A velocaidade agora é de: "+this.velocidade+"km/h");

		}
	}

}

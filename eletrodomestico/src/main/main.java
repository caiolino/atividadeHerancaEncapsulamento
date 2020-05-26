package main;

import model.Eletrodomestico;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eletrodomestico eletro = new Eletrodomestico();
		
		eletro.setMarca("Eletrolux");
		eletro.setModelo("Microondas");
		eletro.setTensao(110);
		
		eletro.ligar();
		eletro.desligar();
		

	}

}

package entidades;

import java.util.Scanner;

public class Termostato {
	private double temperaturaAtual;

	public Termostato() {
	}
	
	public Termostato(double temperaturaAtual) {
		this.temperaturaAtual = temperaturaAtual;
	}
	
	public double getTemperaturaAtual() {
		return temperaturaAtual;
	}

	public void setTemperaturaAtual(double temperaturaAtual) {
		this.temperaturaAtual = temperaturaAtual;
	}

	public double informarTemperatura() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a temperatura ambiente atual: ");
		temperaturaAtual = scan.nextDouble();
		//scan.close(); //da erro
		return temperaturaAtual;
		
	}
}

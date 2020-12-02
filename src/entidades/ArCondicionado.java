package entidades;

import javax.swing.JOptionPane;

public class ArCondicionado {
	private boolean ligado;
	private double temperatura = 20;
	private int velocidade = 1;

	private Termostato termostado = new Termostato(); // precisei instanciar
	private Janela janela = new Janela();

	public ArCondicionado() {
	}

	public ArCondicionado(boolean ligado, double temperatura, int velocidade, Termostato termostado, Janela janela) {
		this.ligado = ligado = false;
		this.temperatura = temperatura;
		this.velocidade = velocidade;
		this.termostado = termostado;
		this.janela = janela;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Termostato getTermostado() {
		return termostado;
	}

	public void setTermostado(Termostato termostado) {
		this.termostado = termostado;
	}

	public Janela getJanela() {
		return janela;
	}

	public void setJanela(Janela janela) {
		this.janela = janela;
	}

	public void acionar() {
		termostado.informarTemperatura();
		if (ligado == false && janela.isAberto() == false && termostado.getTemperaturaAtual() > temperatura) {
			this.ligado = true;
			janela.setAberto(true); //abre a janela
			System.out.println("\nO ar esta ligado agora!");
			System.out.println( "Ligado: " + ligado);
			System.out.println("janela aberta: " + janela.isAberto());
			System.out.println("TemperaturaAtual: " + termostado.getTemperaturaAtual());
			System.out.println("Temperatura programada: " + temperatura);
			System.out.println("Velocidade programada: " + velocidade);
			System.out.println();
		} else {
			if(ligado == true) {
				System.out.println("O ar condicionado já esta ligado");
			}
			if(janela.isAberto() == true) {
				System.out.println("O ar não ligou porque a janela estava aberta!");
			}
			if(termostado.getTemperaturaAtual() < temperatura) {
				System.out.println("Temperatura ambiente é: ("+ termostado.getTemperaturaAtual()+") menor ou igual a temperatura do ar condicionado"
						+ " \nVocê não precisa desperdiçar energia!\n O ar não foi ligado!\n" );
			}

		}
	}

}

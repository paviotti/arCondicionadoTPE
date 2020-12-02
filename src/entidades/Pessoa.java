package entidades;

import java.util.Scanner;

public class Pessoa {

	private String nome;
	private ArCondicionado arCondicionado = new ArCondicionado(); // porque preciso instanciar?
	private Janela janela = new Janela();// porque preciso instanciar?
	//na linha acima, poderia usar um condtrutor completo?

	public Pessoa() {
	}

	public Pessoa(String nome, ArCondicionado arCondicionado, Janela janela) {
		super();
		this.nome = nome;
		this.arCondicionado = arCondicionado; 
		this.janela = janela;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArCondicionado getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(ArCondicionado arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public Janela getJanela() {
		return janela;
	}

	public void setJanela(Janela janela) {
		this.janela = janela;
	}

	public void configurar(double temperatura, int velocidade) { // o diagrama não tem parametro, posso incluir?
		arCondicionado.setTemperatura(temperatura);
		arCondicionado.setVelocidade(velocidade);
		System.out.println("Olá " + nome + " Seu ar está configurado! \nTemperatura: " + arCondicionado.getTemperatura());
		System.out.println("Velocidade: " + arCondicionado.getVelocidade());
	}

	public void ligar() {
		if (arCondicionado.getTemperatura() == 20 || arCondicionado.getTemperatura() == 1) {
			System.out.println("Dica, você pode alterar a temperatura e velocidade na opção 1 do menu");
		}
		arCondicionado.acionar();
	}

	public void desligar() {
		// reset nos valores
		arCondicionado.setLigado(false);
		arCondicionado.setTemperatura(20);
		arCondicionado.setVelocidade(1);
		janela.setAberto(false);

		System.out.println();
	}

	public void abrir() {
		if (janela.isAberto() == false) {
			janela.setAberto(true);
			System.out.println("A Janela foi aberta\n");
		} else {
			System.out.println("A janela já estava aberta\n");
		}

	}

	public void fechar() {
		Scanner sc = new Scanner(System.in);
		String confirma = "n";

		if (arCondicionado.isLigado()) {
			System.out.println("Para fechar a janela o ar será desligado, confirma (s/n): ");
			confirma = sc.next();

			if (confirma.equals("s")) {
				desligar();
			}
			System.out.println("A janela foi fechada\nO ar foi desligado\n ");
		} else {
			janela.setAberto(false);
			System.out.println("A janela foi fechada\n");
		}

	}

}

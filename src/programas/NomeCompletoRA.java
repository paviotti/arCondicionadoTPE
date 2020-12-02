package programas;

import java.util.Scanner;

import javax.swing.JOptionPane;

import entidades.ArCondicionado;
import entidades.Pessoa;

public class NomeCompletoRA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		//ArCondicionado arCondicionado = new ArCondicionado();
		String nome;
		
		
		System.out.print("Olá, digite seu nome por favor: ");
		nome = sc.nextLine();
		pessoa.setNome(nome);
		System.out.println("Seja bem vindo " + nome + "\n");
		
		int op = 0;
		double temperatura;
		int velocidade;
		do {
			System.out.println("MENU DO AR CONDICIONADO");
			System.out.println("0 -Sair");
			System.out.println("1 -Configurar ar condicionado");
			System.out.println("2 -Ligar ar condicionado");
			System.out.println("3 -Desligar ar condicionado");
			System.out.println("4 -Abrir Janela");
			System.out.println("5 -Fechar janela");
			System.out.println();
			System.out.print("DIGITE A OPÇÃO:");

			op = sc.nextInt();
			switch (op) {
			case 1:
				// Configurar ar condicionado
				do {
					System.out.print("Digite a temperatura entre 15 e 25 graus: ");
					temperatura = sc.nextDouble();
					if (temperatura < 15 || temperatura > 25) {
						JOptionPane.showMessageDialog(null, "A temperatura deve ser entre 15 e 25 graus");
						//System.out.println("A temperatura deve ser entre 15 e 25 graus");
					}
				} while (temperatura < 15 || temperatura > 25);

				do {
					System.out.print("Digite a velocidade entre 1 e 5: ");
					velocidade = sc.nextInt();
					if (velocidade < 1 || velocidade > 5) {
						JOptionPane.showMessageDialog(null, "A velocidade deve ser entre 1 e 5");
						//System.out.println("A velocidade deve ser entre 1 e 5");
					}
				} while (velocidade < 1 || velocidade > 5);
				pessoa.configurar(temperatura, velocidade);
				break;

			case 2:
				// ligar ar condicionado
				pessoa.ligar();
				break;
			case 3:
				// desligar ara condicioando
				pessoa.desligar();
				break;
			case 4:
				// abrir janela
				pessoa.abrir();
				break;
			case 5:
				// fechar janela
				pessoa.fechar();
				break;

			default:
				System.out.println("Opção invalida, digite valores de 0 a 5\n");
				break;
			}

		} while (op != 0);
		sc.close();
	}

}

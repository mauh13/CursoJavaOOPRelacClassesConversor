package senac.entra21.java.oop.lista04;

import java.util.Scanner;

public class ConversaoDeUnidadesDeTempoTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int opcao = 1;
		
		while (opcao != 0) {
			System.out.println("\n <<<< Use o menu para selecionar o que deseja fazer >>>>\n");
			System.out.println("1 para converter ANOS em meses, dias, semanas, horas, minutos e segundos");
			System.out.println("2 para converter MESES em dias, semanas, horas, minutos e segundos");
			System.out.println("3 para converter DIAS em horas, minutos e segundos");
			System.out.println("4 para converter HORAS em minutos e segundos");
			System.out.println("5 para converter MINUTOS em segundos");
			System.out.println("0 para sair");
			opcao = leia.nextInt();
		
			if (opcao == 1) {
				System.out.println("\nInforme quantos anos quer converter:");
				ConversaoDeUnidadesDeTempo.converterAnos(leia.nextInt());
			} else if (opcao == 2) {
				System.out.println("\nInforme quantos meses quer converter:");
				ConversaoDeUnidadesDeTempo.converterMeses(leia.nextInt());
			} else if (opcao == 3) {
				System.out.println("\nInforme quantos dias quer converter::");
				ConversaoDeUnidadesDeTempo.converterDias(leia.nextInt());
			} else if (opcao == 4) {
				System.out.println("\nInforme quantas horas quer converter::");
				ConversaoDeUnidadesDeTempo.converterHoras(leia.nextInt());
			} else if (opcao == 5) {
				System.out.println("\nInforme quantos minutos quer converter::");
				ConversaoDeUnidadesDeTempo.converterMinutos(leia.nextInt());
			} else {
				System.out.println("\n<<<< Obrigado >>>>");
			}
			
		}


		leia.close();
		
	}

}

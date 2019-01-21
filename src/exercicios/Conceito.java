package listaDeExercicios;

import java.util.InputMismatchException;

public class Conceito {

	// Fa�a um algoritmo que receba as tr�s notas, calcule e mostre a m�dia
	// ponderada e imprima o conceito que segue a tabela:
	double nota1;
	double nota2;
	double nota3;
	double mediaNota;
	double imprima;

	void calculaMedia() {
		
		this.mediaNota = (nota1 + nota2 + nota3)/3;
		System.out.printf("Sua m�dia � %.2f \n", mediaNota);
	}
	void mediaPonderada() {
		
		try {
		if (this.mediaNota >= 8) {
			System.out.println("Seu conceito � A!");
		} else if (this.mediaNota < 8 && mediaNota >= 7) {
			System.out.println("Seu conceito � B!");
		} else if (this.mediaNota < 7 && mediaNota >= 6) {
			System.out.println("Seu conceito � C");

		} else if (this.mediaNota < 6 && mediaNota >= 5) {
			System.out.println("Seu conceito � D");
		} else if (this.mediaNota < 5 && mediaNota > 0) {
			System.out.println("Seu conceito � E");
		}
		} catch (InputMismatchException erro){
			System.out.println("digite um valor v�lido!" + erro);
		}

	}

}

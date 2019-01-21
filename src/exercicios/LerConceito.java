package listaDeExercicios;

import java.util.Scanner;

public class LerConceito {

	public static void main(String[] args) {
		// Faça um algoritmo que receba as três notas, calcule e mostre a média
		// ponderada e imprima o conceito que segue a tabela:

		Conceito lerConceito = new Conceito();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite sua primeira nota: ");
		lerConceito.nota1 = scanner.nextDouble();
		System.out.print("Digite sua segunda nota: ");
		lerConceito.nota2 = scanner.nextDouble();
		System.out.print("Digite sua terceita nota: ");
		lerConceito.nota3 = scanner.nextDouble();
		
		lerConceito.calculaMedia();
		lerConceito.mediaPonderada();
		
		scanner.close();
	}
}

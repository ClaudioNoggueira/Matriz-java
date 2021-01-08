package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Digite o número de linhas da matriz: ");
			int linhas = input.nextInt();
			System.out.print("Agora digite o número de colunas da matriz: ");
			int colunas = input.nextInt();
			System.out.println();
			
			int[][] matriz = new int[linhas][colunas];
			
			for (int i = 0; i < matriz.length; i++) {
				System.out.println("Insira os valores da " + (i+1) + "ª linha separados para espaços");
				for (int j = 0; j < matriz[i].length; j++) {
					matriz[i][j] = input.nextInt();
				}
			}

			System.out.print("\nDigite o número a ser encontrado na matriz: ");
			int num = input.nextInt();

			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (matriz[i][j] == num) {
						System.out.println("Número '" + num + "' encontrado na posição: " + i + "," + j);
						if (j > 0) {
							System.out.println("Left: " + matriz[i][j - 1]);
						}
						if (i > 0) {
							System.out.println("Up: " + matriz[i - 1][j]);
						}
						if (j < colunas - 1) {
							System.out.println("Right: " + matriz[i][j + 1]);
						}
						if (i < linhas - 1) {
							System.out.println("Down: " + matriz[i + 1][j]);
						}
					}
				}
			}
		} catch (RuntimeException e) {
			System.out.println("Você inseriu um tipo de dado inapropriado para a operação!");
			System.out.println("Reinicie o programa para tentar novamente.");
		} finally {
			input.close();
		}
	}
}

package application;

import java.util.Scanner;


public class Program{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas da Matriz:"); 
		int l = sc.nextInt();
		System.out.print("Digite a quantidade de colunas da Matriz:"); 
		int c = sc.nextInt();
		
		
		int[][] mat = new int[l][c];
		
		System.out.print("Entre com os valores da Matriz:");
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Entre com o valor de Referência: ");
		int v = sc.nextInt();
		
		for (int i=0; i < l; i++ ) {
			for (int j=0; j < c; j++ ) {
				if (mat[i][j] == v) {					
					
					System.out.println("Position " +i + "," +j );
					
					if (j > 0 ) {
						System.out.println("Left " +mat[i][j-1] +",");
					}
					if (j < mat[i].length-1 ) {
						System.out.println("right "+mat[i][j+1] +",");
					}
					if (i > 0) {
						System.out.println("up "   +mat[i-1][j] +",");
					}
					if (i < mat.length-1) {
						System.out.println("down " +mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		sc.close();

	}
	
}
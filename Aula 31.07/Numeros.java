package Trabalho;
import java.util.ArrayList;
import java.util.Random;

public class Numeros {
	/**
	 * motodo static que recebe uma lista de inteiros e popula numeros aleatorios, com n numeros, em um range
	 * @param lista
	 * @param n
	 * @param range
	 */
	public static void popularAleatorio (ArrayList lista, int n, int range) {
		Random gerador = new Random();
		
		for (int i = 0 ; i < n ; i++) {
			lista.add(gerador.nextInt(range));
		}
	}
	
	/**
	 * metodo static que recebe uma lista e exibe seus elementos um a baixo do outro
	 * @param lista
	 */
	public static void exibir (ArrayList lista) {
		for (Object item : lista) {
			System.out.println (item);	
			
		}
	}
}

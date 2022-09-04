package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		
		
		int[] vetor = new int[1000];
		
		for(int i = 0; i < 1000; i++) {
			int num = (int)(Math.random() * 100) + 1;
			vetor[i] = num;
		}
		
		for (int i = 1; i <= 2; i++) {
			int num = i;
			Thread vetorThread = new ThreadVetor(vetor, num);
			vetorThread.start();
		}
		
	}
}

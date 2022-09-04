package controller;

public class ThreadVetor extends Thread {
	
	private int[] vetor;
	private int num;
	
	public ThreadVetor(int[] vetor, int num) {
		this.vetor = vetor;
		this.num = num;
	}

	@Override
	public void run() {
		defineVetor();
	}

	private void defineVetor() {
		if(num%2 == 0) {
			double tInicial = System.nanoTime();
			
			for (int i = 0; i < vetor.length ; i++) {
					
			}
			
			double tFinal = System.nanoTime();
			double tTotal = tFinal - tInicial;
			tTotal = tTotal / Math.pow(10, 9);
			System.out.println("#" + getId()+ " par com o tempo ==>" + tTotal + "s");
			
		} else if (num%2 == 1) {
			double tInicial = System.nanoTime();
			
			for (int j : vetor) {
				
			}
			
			double tFinal = System.nanoTime();
			double tTotal = tFinal - tInicial;
			tTotal = tTotal / Math.pow(10, 9);
			System.out.println("#" + getId()+ " impar com o tempo ==>" + tTotal + "s");
		}
	}
	
	
}

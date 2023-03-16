package view;

import java.util.concurrent.Semaphore;

import controller.car;

public class main {
	public static void main(String[] args) {
		String[] sentidos = { "Norte para o Sul", "Leste para o Oeste", "Oeste para o Leste", "Sul para o Norte" };
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		for (int i = 1; i <= 4; i++) {
		Thread c = new car(sentidos[i - 1], semaforo);
			c.start();
		}

}
}

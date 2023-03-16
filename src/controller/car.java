package controller;

import java.util.concurrent.Semaphore;

public class car extends Thread {
	private int Car;
	private String direcao;
	private Semaphore semaforo;

	public car (String direcao,Semaphore semaforo) {
		this.Car = (int) this.getId();
		this.direcao = direcao;
		this.semaforo = semaforo;
	
}

	public void run() {
		 
		 //inicio da seção critica
		 try {
			 semaforo.acquire();
			 carroparado();
		 }catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			 //obriga a rodar
			 semaforo.release();
			//fim da seção critica
		 }
		 carrocruzando();
	}
	

	
	private void carroparado() {
		
		System.out.println("O carro " +Car +" parou no cruzamento");
		
		
		}
	
	private void carrocruzando() {
	
		System.out.println("O Carro " + Car + " cruzou no sentido " + direcao);
	

	}
}

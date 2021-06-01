package com.jo.jeu;

public class Chrono implements Runnable {

	private final int PAUSE = 3; // Temps d'attente entre 2 tours de boucle
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			
			Main.scene.repaint();
			
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {}
		}
	}

}

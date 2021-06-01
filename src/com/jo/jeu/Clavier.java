package com.jo.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.jo.audio.Audio;

public class Clavier implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		if(Main.scene.mario.isVivant() == true) {
			// Déplacement de mario vers la droite
			if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				if(Main.scene.getxPos() == -1) {
					Main.scene.setxPos(0); // Reinitialision de setxPos
					Main.scene.setxFond1(-50); // Reinitialision de xFond1
					Main.scene.setxFond2(750); // Reinitialision de xFond2
				}
				Main.scene.mario.setMarche(true);
				Main.scene.mario.setVersDroite(true);
				Main.scene.setDx(1); // Deplacement de fond vers la gauche quand on clique sur "droite"
			}
			// Déplacement de mario vers la gauche
			else if(e.getKeyCode() == KeyEvent.VK_LEFT){
				if(Main.scene.getxPos() == 4431){ 
	        		Main.scene.setxPos(4430);
	        		Main.scene.setxFond1(-50);
	        		Main.scene.setxFond2(750);
				}
				Main.scene.mario.setMarche(true);
				Main.scene.mario.setVersDroite(false);
				Main.scene.setDx(-1); // Deplacement de fond vers la droite quand on clique sur "gauche"
			}	
			
			// Saut de Mario			
			if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				Main.scene.mario.setSaut(true);
				Audio.playSound("/audio/saut.wav");
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.mario.setMarche(false);
		Main.scene.setDx(0); // Remise à 0 de dx de scene quand on relache une touche
	}

}

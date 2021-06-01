package com.jo.objets;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.jo.jeu.Main;

public class Objet {

	// ***** Variables ***** //
	private int largeur, hauteur; //  dimensions de l'objet
	private int x, y; // position de l'objet
	
	protected Image imgObjet; // On cr�� ces variables pour instancier les objet de fa�ons plus dinamique qu'en les mettans dans tuyau et bloc
	protected ImageIcon icoObjet;
	
	// ***** Constructeur ***** //
	public Objet(int x, int y, int largeur, int hauteur) {
		this.x = x;
		this.y = y;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	
	// ***** Getters ***** // 
	public int getLargeur() {return largeur;}
	public int getHauteur() {return hauteur;}
	public int getX() {return x;}
	public int getY() {return y;}	
	public Image getImgObjet() {return imgObjet;}

	// ***** Setters ***** //
	public void setLargeur(int largeur) {this.largeur = largeur;}
	public void setHauteur(int hauteur) {this.hauteur = hauteur;}
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	
	// ***** M�thodes ***** // 
	public void deplacement(){		
		if(Main.scene.getxPos() >= 0){ // M�thode qui sera appel� dans scene.PaintComponent pour que le x des objets se mette bien a jour
			this.x = this.x - Main.scene.getDx(); // quand mario (l'image de fond en fait) se d�place, sinon on ne pourra pas cr�er de colision
		}
	}
}

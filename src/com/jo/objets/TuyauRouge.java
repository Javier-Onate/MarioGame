package com.jo.objets;

import javax.swing.ImageIcon;

public class TuyauRouge extends Objet {
	
	// ***** Variables ***** //
	
	// ***** Constructeur ***** //
	public TuyauRouge(int x, int y) {
		super(x, y, 43, 65);
		this.icoObjet = new ImageIcon(getClass().getResource("/images/tuyauRouge.png")); 
		this.imgObjet = this.icoObjet.getImage();		
	}
	
	// ***** Getters ***** //
	
	// ***** Setters ***** //
	
	// ***** Méthodes ***** //
}

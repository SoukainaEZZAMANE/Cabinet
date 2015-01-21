/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Soukaina
 */
@Entity
@Table(name = "clients")
public class Client extends Personne {

	private static final long serialVersionUID = 1L;

	// constructeur par défaut
	public Client() {
	}

	// constructeur avec paramètres
	public Client(String titre, String nom, String prenom) {
		super(titre, nom, prenom);
	}

	// identité
	public String toString() {
		return String.format("Client[%s]", super.toString());
	}

}

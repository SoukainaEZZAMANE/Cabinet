/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

import entities.Creneau;
import entities.Rv;

/**
 *
 * @author Soukaina
 */
public class CreneauMedecinJour implements Serializable {

	private static final long serialVersionUID = 1L;
	// champs
	private Creneau creneau;
	private Rv rv;

	// constructeurs
	public CreneauMedecinJour() {

	}

	public CreneauMedecinJour(Creneau creneau, Rv rv) {
		this.creneau = creneau;
		this.rv = rv;
	}

	// toString
	@Override
	public String toString() {
		return String.format("[%s %s]", creneau, rv);
	}

	// getters et setters

	public Creneau getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}

	public Rv getRv() {
		return rv;
	}

	public void setRv(Rv rv) {
		this.rv = rv;
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Medecin;

/**
 *
 * @author Soukaina
 */
public class AgendaMedecinJour implements Serializable {

	private static final long serialVersionUID = 1L;
	// champs
	private Medecin medecin;
	private Date jour;
	private CreneauMedecinJour[] creneauxMedecinJour;

	// constructeurs
	public AgendaMedecinJour() {

	}

	public AgendaMedecinJour(Medecin medecin, Date jour, CreneauMedecinJour[] creneauxMedecinJour) {
		this.medecin = medecin;
		this.jour = jour;
		this.creneauxMedecinJour = creneauxMedecinJour;
	}

	public String toString() {
		StringBuffer str = new StringBuffer("");
		for (CreneauMedecinJour cr : creneauxMedecinJour) {
			str.append(" ");
			str.append(cr.toString());
		}
		return String.format("Agenda[%s,%s,%s]", medecin, new SimpleDateFormat("dd/MM/yyyy").format(jour), str.toString());
	}

	// getters et setters

  public CreneauMedecinJour[] getCreneauxMedecinJour() {
    return creneauxMedecinJour;
  }

  public void setCreneauxMedecinJour(CreneauMedecinJour[] creneauxMedecinJour) {
    this.creneauxMedecinJour = creneauxMedecinJour;
  }

  public Date getJour() {
    return jour;
  }

  public void setJour(Date jour) {
    this.jour = jour;
  }

  public Medecin getMedecin() {
    return medecin;
  }

  public void setMedecin(Medecin medecin) {
    this.medecin = medecin;
  }
  
}

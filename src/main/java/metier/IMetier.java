/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Date;
import java.util.List;

import domain.AgendaMedecinJour;
import entities.Client;
import entities.Creneau;
import entities.Medecin;
import entities.Rv;

/**
 *
 * @author Soukaina
 */
public interface IMetier {

	// liste des clients
	public List<Client> getAllClients();

	// liste des Médecins
	public List<Medecin> getAllMedecins();

	// liste des créneaux horaires d'un médecin
	public List<Creneau> getAllCreneaux(long idMedecin);

	// liste des Rv d'un médecin, un jour donné
	public List<Rv> getRvMedecinJour(long idMedecin, Date jour);

	// trouver un client identifié par son id
	public Client getClientById(long id);

	// trouver un client identifié par son id
	public Medecin getMedecinById(long id);

	// trouver un Rv identifié par son id
	public Rv getRvById(long id);

	// trouver un créneau horaire identifié par son id
	public Creneau getCreneauById(long id);

	// ajouter un RV
	public Rv ajouterRv(Date jour, Creneau créneau, Client client);

	// supprimer un RV
	public void supprimerRv(long idRv);

	// metier
	public AgendaMedecinJour getAgendaMedecinJour(long idMedecin, Date jour);

}
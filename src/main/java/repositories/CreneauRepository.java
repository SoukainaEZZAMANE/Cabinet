/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import entities.Creneau;
/**
 *
 * @author Soukaina
 */

public interface CreneauRepository extends CrudRepository<Creneau, Long> {
	// liste des créneaux horaires d'un médecin
	@Query("select c from Creneau c where c.medecin.id=?1")
	Iterable<Creneau> getAllCreneaux(long idMedecin);
}

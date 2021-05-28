package fr.formation.ponionz.services;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.ponionz.entities.Mortage;

public interface MortageRepository extends JpaRepository<Mortage, Long> {

}

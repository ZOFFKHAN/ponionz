package fr.formation.ponionz.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coverages")
public class Coverage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "coverage_rate")
    private String coverage;

    public Coverage() {

    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getCoverage() {
	return coverage;
    }

    public void setCoverage(String coverage) {
	this.coverage = coverage;
    }

    @Override
    public String toString() {
	return "Coverage [id=" + id + ", coverage=" + coverage + "]";
    }

}

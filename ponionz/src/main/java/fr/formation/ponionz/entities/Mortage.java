package fr.formation.ponionz.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mortages")

public class Mortage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private Integer amount;// montant
    private Integer contribution;// apport
    private Integer term;// durée
    @Column(name = "interest_Rate") // tx_d'interêt
    private Float interestRate;
    @Column(name = "insurance_Rate")
    private Float insuranceRate; // tx_d'assurance
    @Column(name = "job_loss_insurance")
    private boolean jobLossInsurance; // assurance perte emplois
    @Column(name = "coverage_rate")
    private Integer coverageRate; // tx_de couverture

    public Mortage() {

    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public Integer getAmount() {
	return amount;
    }

    public void setAmount(Integer amount) {
	this.amount = amount;
    }

    public Integer getContribution() {
	return contribution;
    }

    public void setContribution(Integer contribution) {
	this.contribution = contribution;
    }

    public Integer getTerm() {
	return term;
    }

    public void setTerm(Integer term) {
	this.term = term;
    }

    public Float getInterestRate() {
	return interestRate;
    }

    public void setInterestRate(Float interestRate) {
	this.interestRate = interestRate;
    }

    public Float getInsuranceRate() {
	return insuranceRate;
    }

    public void setInsuranceRate(Float insuranceRate) {
	this.insuranceRate = insuranceRate;
    }

    public boolean isJobLossInsurance() {
	return jobLossInsurance;
    }

    public void setJobLossInsurance(boolean jobLossInsurance) {
	this.jobLossInsurance = jobLossInsurance;
    }

    public Integer getCoverageRate() {
	return coverageRate;
    }

    public void setCoverageRate(Integer coverageRate) {
	this.coverageRate = coverageRate;
    }

    @Override
    public String toString() {
	return "Mortage [id=" + id + ", amount=" + amount + ", contribution=" + contribution + ", term=" + term
		+ ", interestRate=" + interestRate + ", insuranceRate=" + insuranceRate + ", jobLossInsurance="
		+ jobLossInsurance + ", coverageRate=" + coverageRate + "]";
    }

}

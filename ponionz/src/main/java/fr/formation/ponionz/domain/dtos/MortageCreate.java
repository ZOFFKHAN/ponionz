package fr.formation.ponionz.domain.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import fr.formation.ponionz.validation.ValidateMortage;

@ValidateMortage
public class MortageCreate {
    @NotNull
    @Min(100000)
    @Max(600000)

    private Integer amount;// montant
    @Positive
    private Integer contribution;// apport

    @NotNull
    @Min(2)
    @Max(30)
    private Integer term;// durée
    @NotNull
    @Positive
    private Float interestRate;
    @NotNull
    @Positive
    private Float insuranceRate; // tx_d'assurance
    private boolean jobLossInsurance; // assurance perte emplois
    private Integer coverageRate; // tx_de couverture

    public MortageCreate() {
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
	return "MortageView [amount=" + amount + ", contribution=" + contribution + ", term=" + term + ", interestRate="
		+ interestRate + ", insuranceRate=" + insuranceRate + ", jobLossInsurance=" + jobLossInsurance
		+ ", coverageRate=" + coverageRate + "]";
    }

}

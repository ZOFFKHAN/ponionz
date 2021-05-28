package fr.formation.ponionz.domain.dtos;

public class MortageView {
    private Integer amount;// montant
    private Integer contribution;// apport
    private Integer term;// durée
    private Float interestRate;
    private Float insuranceRate; // tx_d'assurance
    private boolean jobLossInsurance; // assurance perte emplois
    private Integer coverageRate; // tx_de couverture

    public MortageView() {
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

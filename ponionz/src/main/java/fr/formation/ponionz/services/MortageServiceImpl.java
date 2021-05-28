package fr.formation.ponionz.services;

import org.springframework.stereotype.Service;

import fr.formation.ponionz.domain.dtos.MortageCreate;
import fr.formation.ponionz.domain.dtos.MortageView;
import fr.formation.ponionz.entities.Mortage;

@Service
public class MortageServiceImpl implements MortageService {

    private final MortageRepository repo;

    public MortageServiceImpl(MortageRepository repo) {
	this.repo = repo;
    }

    @Override
    public MortageView getById(Long id) {

	System.out.println("call in service");

	Mortage mortage = repo.getById(id);
	MortageView view = new MortageView();
	view.setAmount(mortage.getAmount());
	view.setContribution(mortage.getContribution());
	view.setCoverageRate(mortage.getCoverageRate());
	view.setInsuranceRate(mortage.getInsuranceRate());
	view.setJobLossInsurance(mortage.isJobLossInsurance());
	view.setInterestRate(mortage.getInterestRate());

	view.setTerm(mortage.getTerm());
	return view;

    }

    @Override
    public void create(MortageCreate dto) {
	System.out.println("call in service");
	Mortage mortage = new Mortage();
	mortage.setAmount(dto.getAmount());
	mortage.setContribution(dto.getContribution());
	mortage.setCoverageRate(dto.getCoverageRate());
	mortage.setInsuranceRate(dto.getInsuranceRate());
	mortage.setInterestRate(dto.getInterestRate());
	mortage.setJobLossInsurance(dto.isJobLossInsurance());
	mortage.setTerm(dto.getTerm());

	repo.save(mortage);

    }

}

package fr.formation.ponionz.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.ponionz.domain.dtos.MortageCreate;

public class ValidateJobLossValidator implements ConstraintValidator<ValidateJobLoss, MortageCreate> {

    @Override
    public boolean isValid(MortageCreate value, ConstraintValidatorContext context) {

	// return value.getDateBegin().minusDays(0).isBefore(value.getDateEnd());

	// boolean my_value = value.isJobLossInsurance();
	// Integer my_value2 = value.getCoverageRate();

	return value.getAmount() >= (value.getContribution() * 2);

    }

}

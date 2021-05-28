package fr.formation.ponionz.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.ponionz.domain.dtos.MortageCreate;

public class ValidateMortageValidator implements ConstraintValidator<ValidateMortage, MortageCreate> {

    @Override
    public boolean isValid(MortageCreate value, ConstraintValidatorContext context) {

	// return value.getDateBegin().minusDays(0).isBefore(value.getDateEnd());

	return value.getAmount() >= (value.getContribution() * 2);

    }

}

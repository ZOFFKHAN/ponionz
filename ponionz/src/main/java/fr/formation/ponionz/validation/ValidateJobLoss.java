package fr.formation.ponionz.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ TYPE, FIELD })
@Constraint(validatedBy = { ValidateMortageValidator.class })
public @interface ValidateJobLoss { // récupéré de @NotNull (ligne 39-42)
    String message() default "validate mortage 50%}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
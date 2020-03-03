package edu.wctc.mvcforms.customer;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

// <Class of annotation to validate, Data type of fields it can validate>
public class EventCodeConstraintValidator implements ConstraintValidator<EventCode, String> {

    // A field to capture the valid value, as specified when the annotation is
    // used. For example, if a field were annotated with
    // @EventCode(value="GCN", message="must start with GCN")
    // then we want to capture that "GCN" as the value to validate
    // against.
    private String eventPrefix;

    @Override
    public void initialize(EventCode theAnnotation) {
        // Get the annotation's value=XX attribute
        eventPrefix = theAnnotation.value();
    }

    /**
     * Will be called by Spring during validation. Returns true if the value entered by the user is valid, false if not.
     *
     * @param theCode The data entered in the form
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        // Add our business logic here to determine if the field theCode
        // contains a value that meets our validation rules or not
        return theCode != null && theCode.startsWith(eventPrefix);
    }
}

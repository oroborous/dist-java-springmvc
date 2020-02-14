package edu.wctc.mvcforms.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Helper class that contains validation rules
@Constraint(validatedBy=EventCodeConstraintValidator.class)
// Where can we apply this annotation? Methods and fields.
@Target({ElementType.METHOD, ElementType.FIELD})
// Is this annotation processed at compile or run time?
@Retention(RetentionPolicy.RUNTIME)
public @interface EventCode {
    // This annotation will have two parameters: value and message
    // Usage example: @EventCode(value="GCN", message="must start with GCN")

    // If no value provided, use default below
    public String value() default "EVT";

    // If no message provided, use default below
    public String message() default "must start with EVT";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default{};
}

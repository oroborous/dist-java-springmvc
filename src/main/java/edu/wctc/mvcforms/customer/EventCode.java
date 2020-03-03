package edu.wctc.mvcforms.customer;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// Helper class that contains validation rules
@Constraint(validatedBy=EventCodeConstraintValidator.class)
// Where can we apply this annotation? Just to fields.
@Target({ElementType.FIELD})
// Is this annotation processed at compile or run time?
@Retention(RetentionPolicy.RUNTIME)
public @interface EventCode {
    // This annotation will have two parameters: value and message
    // Usage example: @EventCode(value="GCN", message="must start with GCN")

    // If no value provided, use default below
    String value() default "EVT";

    // If no message provided, use default below
    String message() default "must start with EVT";

    // Groups of annotations can be applied in a particular order
    Class<?>[] groups() default {};

    // Payload can include extra information such as severity level
    Class<? extends Payload>[] payload() default{};
}

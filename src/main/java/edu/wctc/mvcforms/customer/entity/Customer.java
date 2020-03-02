package edu.wctc.mvcforms.customer.entity;

import edu.wctc.mvcforms.customer.EventCode;

import javax.validation.constraints.*;

public class Customer {
    @NotNull(message = "can''t be null")
    @Size(min = 1, message = "min length 1")
    private String firstName;

    // Must escape single quotes in error message
    @NotNull(message = "can''t be null")
    @Size(min = 1, message = "min length 1")
    private String lastName;

    @NotNull(message = "can''t be null")
    @Min(value = 0, message = "minimum 0")
    @Max(value = 10, message = "maximum 10")
    // was originally an int field but changed to Integer so it's nullable
    private Integer freePasses;

    @Pattern(regexp = "[A-Z][0-9][A-Z] [0-9][A-Z][0-9]", message = "invalid postal code")
    private String postalCode;

    @EventCode(value = "PAX", message = "must start with PAX")
    private String eventCode;

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

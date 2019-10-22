package edu.wctc.mvcforms.validation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
    @NotNull(message="can't be null")
    @Size(min=1, message="min length 1")
    private String firstName;

    @NotNull(message="can't be null")
    @Size(min=1, message="min length 1")
    private String lastName;

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
}

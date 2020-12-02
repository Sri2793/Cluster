package com.kayra.market.kmorms.cms.model.validation;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a list of validation error messages
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidationErrorMessages {

    /** List of field errors */
    @JsonProperty(value = "fieldErrors")
    private List<FieldError> fieldErrors = new ArrayList<>();

    /**
     * Adds the error created using the supplied parameters to the list of
     * validation errors.
     *
     * @param field the field in error
     * @param code the error code
     * @param message the error message
     */
    public void addError(String field, String code, String message) {
        FieldError fieldError = new FieldError(field, code, message);
        fieldErrors.add(fieldError);
    }

    /**
     * Returns true if there are errors, false otherwise
     * 
     * @return true if there are errors, false otherwise
     */
    public boolean containsErrors() {
        return !fieldErrors.isEmpty();
    }
}

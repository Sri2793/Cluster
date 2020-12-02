package com.kayra.market.kmorms.cms.model.validation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Encapsulates a validation error for a single field
 */
@RequiredArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldError {

    /** The field which is in error */
    @JsonProperty(value = "field")
    private final String field;

    /** The error code for the validation error */
    @JsonProperty(value = "code")
    private final String code;

    /** The validation message */
    @JsonProperty(value = "message")
    private final String message;
}

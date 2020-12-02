package com.kayra.market.kmorms.cms.model.validation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Simple POJO used to send an error response to the FE. Mostly used by {@link com.kayra.market.kmorms.web.RestApiExceptionHandler}.
 */
@Getter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestErrorResponse {
    private final String code;

    private final String errorMessage;
}

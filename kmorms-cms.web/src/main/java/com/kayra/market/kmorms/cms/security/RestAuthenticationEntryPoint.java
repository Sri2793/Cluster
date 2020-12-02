package com.kayra.market.kmorms.cms.security;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kayra.market.kmorms.cms.model.validation.ValidationErrorMessages;

/**
 * Rest Authentication Entry Point to send back authorisation errors as JSON.
 * This will need to be configured in the security context for REST calls.
 */
public class RestAuthenticationEntryPoint extends BasicAuthenticationEntryPoint {
	public static final String INVALID_EMAIL_PASSWORD = "E-mail Address, and/or password incorrect";

    /**
     * {@inheritDoc}
     *
     * @see org.springframework.security.web.AuthenticationEntryPoint#commence(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
     *      org.springframework.security.core.AuthenticationException)
     */
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {

        // response.addHeader("WWW-Authenticate", "Basic realm=\"" + getRealmName() + "\"");
        StringWriter errorJson = new StringWriter();
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

        ValidationErrorMessages errors = new ValidationErrorMessages();
        errors.addError(null, "failed", INVALID_EMAIL_PASSWORD);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(errorJson, errors);
        response.getOutputStream().println(errorJson.toString());
    }

}

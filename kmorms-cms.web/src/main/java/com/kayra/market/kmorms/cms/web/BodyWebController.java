package com.kayra.market.kmorms.cms.web;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kayra.market.kmorms.cms.documentmodel.Body;
import com.kayra.market.kmorms.cms.model.validation.ValidationErrorMessages;
import com.kayra.market.kmorms.cms.service.BodyService;

@RequestMapping("/cms")
@RestController
public class BodyWebController {

     
	public static final String PUB_OUTPUT = MediaType.APPLICATION_JSON_VALUE;
	public static final String PUB_INPUT = MediaType.APPLICATION_JSON_VALUE;
	
	
	@Autowired
	private BodyService bodyService;
	
	/**
	 * 
	 * @param bodyModel
	 * @return
	 */
	@RequestMapping(value = "/request", method = RequestMethod.POST, produces = PUB_OUTPUT, consumes = PUB_INPUT)
	public ResponseEntity<Object> body(@RequestBody Body body) {

		try {
            return new ResponseEntity<Object>(bodyService.save(body), new HttpHeaders(), HttpStatus.OK);
        } catch (Exception nfe) {
            return responseEntityShow(null, "Not a vaild request", BAD_REQUEST);
        }

	}
	
	/**
	 * 
	 * @param bodyModel
	 * @return
	 */
	@RequestMapping(value = "/callback/{id}", method = RequestMethod.POST, produces = PUB_OUTPUT, consumes = PUB_INPUT)
	public ResponseEntity<Object> saveCallback(@PathVariable("id") String id) {

		try {
            return new ResponseEntity<Object>(bodyService.save(id), new HttpHeaders(), HttpStatus.NO_CONTENT);
        } catch (Exception nfe) {
            return responseEntityShow(null, "Not aavailable", HttpStatus.NOT_FOUND);
        }

	}
	
	/**
	 * 
	 * @param bodyModel
	 * @return
	 */
	@RequestMapping(value = "/callback/{id}", method = RequestMethod.PUT, produces = PUB_OUTPUT, consumes = PUB_INPUT)
	public ResponseEntity<Object> updateCallback(@PathVariable("id") String id) {

		try {
            return new ResponseEntity<Object>(bodyService.update(id), new HttpHeaders(), HttpStatus.NO_CONTENT);
        } catch (Exception nfe) {
            return responseEntityShow(null, "Not aavailable", HttpStatus.NOT_FOUND);
        }

	}
	
	/**
	 * 
	 * @param bodyModel
	 * @return
	 */
	@RequestMapping(value = "/status/{id}", method = RequestMethod.GET, produces = PUB_OUTPUT)
	public ResponseEntity<Object> getBody(@PathVariable("id") String id) {

		try {
            return new ResponseEntity<Object>(bodyService.update(id), new HttpHeaders(), HttpStatus.NO_CONTENT);
        } catch (Exception nfe) {
            return responseEntityShow(null, "Not aavailable", HttpStatus.NOT_FOUND);
        }

	}
	
	private ResponseEntity<Object> responseEntityShow(String field, String response, HttpStatus status) {
        ValidationErrorMessages errors = new ValidationErrorMessages();
        errors.addError(field, response, response);
        return new ResponseEntity<Object>(errors, new HttpHeaders(), status);
    }



}

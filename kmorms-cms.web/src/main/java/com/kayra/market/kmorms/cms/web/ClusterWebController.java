package com.kayra.market.kmorms.cms.web;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kayra.market.kmorms.cms.documentmodel.Cluster;
import com.kayra.market.kmorms.cms.model.validation.ValidationErrorMessages;
import com.kayra.market.kmorms.cms.service.ClusterService;

@RequestMapping("/cms/cluster")
@RestController
public class ClusterWebController {

	public static final String PUB_OUTPUT = "application/json";
	public static final String PUB_INPUT = "application/json";
	
	
	@Autowired
	private ClusterService clusterService;
	
	/**
	 * 
	 * @param cluster
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = PUB_OUTPUT, consumes = PUB_INPUT)
	public ResponseEntity<Object> save(@RequestBody Cluster cluster) {

		try {
            return new ResponseEntity<Object>(clusterService.save(cluster), new HttpHeaders(), HttpStatus.CREATED);
        } catch (Exception nfe) {
            return responseEntityShow(null, "Not a vaild request", BAD_REQUEST);
        }

	}
	
	@ResponseBody
	@RequestMapping(value = "/find/{name}", method = RequestMethod.POST, produces = PUB_OUTPUT, consumes = PUB_INPUT)
	public ResponseEntity<Object> getAll(@PathVariable("name") String name) {

		try {
            return new ResponseEntity<Object>(clusterService.findAll(name), new HttpHeaders(), HttpStatus.CREATED);
        } catch (Exception nfe) {
            return responseEntityShow(null, "Not found", NOT_FOUND);
        }

	}
	
	private ResponseEntity<Object> responseEntityShow(String field, String response, HttpStatus status) {
        ValidationErrorMessages errors = new ValidationErrorMessages();
        errors.addError(field, response, response);
        return new ResponseEntity<Object>(errors, new HttpHeaders(), status);
    }

}

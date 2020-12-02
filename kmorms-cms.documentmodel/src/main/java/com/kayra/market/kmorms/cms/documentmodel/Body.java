package com.kayra.market.kmorms.cms.documentmodel;


import javax.persistence.Transient;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Document(collection = "callback")
public class Body {

	@Id
    private String id;
	
	@Field
    private String body;
	
	@Field
    private String detail;
	
	@Field
    private String status;
	
	@Transient
	private String callback;
	
	public String getCallback() {
		return "/callback/" + id;
	}
	
}

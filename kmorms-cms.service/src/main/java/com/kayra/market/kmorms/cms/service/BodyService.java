package com.kayra.market.kmorms.cms.service;

import com.kayra.market.kmorms.cms.documentmodel.Body;

public interface BodyService {

	Body save(Body body);
	
	Body save(String id);
	
	Body update(String id);
	
	Body find(String id);
}

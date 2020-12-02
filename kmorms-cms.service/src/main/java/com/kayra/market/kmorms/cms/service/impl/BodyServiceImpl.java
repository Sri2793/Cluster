package com.kayra.market.kmorms.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayra.market.kmorms.cms.documentmodel.Body;
import com.kayra.market.kmorms.cms.repository.BodyRepository;
import com.kayra.market.kmorms.cms.service.BodyService;

@Service
public class BodyServiceImpl implements BodyService {

	@Autowired
	private BodyRepository bodyRepository;
	
	@Override
	public Body save(Body body) {
		Body newbody = new Body();
		newbody.setBody(body.getBody());
		return bodyRepository.save(newbody);
	}

	@Override
	public Body save(String id) {
		Body existing = bodyRepository.findOneById(id);
		existing.setStatus("Started");
		return bodyRepository.save(existing);
	}

	@Override
	public Body update(String id) {
		Body existing = bodyRepository.findOneById(id);
		existing.setStatus("Processed");
		return bodyRepository.save(existing);
	}

	@Override
	public Body find(String id) {
		return bodyRepository.findOneById(id);
	}

}

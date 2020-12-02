package com.kayra.market.kmorms.cms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kayra.market.kmorms.cms.documentmodel.Body;

public interface BodyRepository extends MongoRepository<Body, String> {

	Body findOneById(String id);
}

package com.kayra.market.kmorms.cms.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kayra.market.kmorms.cms.documentmodel.Cluster;

public interface ClusterRepository extends MongoRepository<Cluster, String> {
	
	List<Cluster> findByName(String name);

}

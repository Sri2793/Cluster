package com.kayra.market.kmorms.cms.service;

import java.util.List;

import com.kayra.market.kmorms.cms.documentmodel.Cluster;

public interface ClusterService {
	
	Cluster save(Cluster cluster);
	
	List<Cluster> findAll(String name);

}

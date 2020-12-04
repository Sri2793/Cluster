package com.kayra.market.kmorms.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayra.market.kmorms.cms.documentmodel.Cluster;
import com.kayra.market.kmorms.cms.repository.ClusterRepository;
import com.kayra.market.kmorms.cms.service.ClusterService;

@Service
public class ClusterServiceImpl implements ClusterService {
	
	@Autowired
	private ClusterRepository clusterRepository;

	@Override
	public Cluster save(Cluster cluster) {
		return clusterRepository.save(cluster);
	}

	@Override
	public List<Cluster> findAll(String name) {
		return clusterRepository.findByName(name);
	}
	

}

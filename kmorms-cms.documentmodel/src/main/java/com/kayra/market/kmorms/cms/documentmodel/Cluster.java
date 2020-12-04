package com.kayra.market.kmorms.cms.documentmodel;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "cluster")
public class Cluster {
	
	@Id
	private String id;
	
	@Field
	private String name;
	
	private Set<ClusterSystem> systems;
	
	private Set<ClusterUser> users;

}

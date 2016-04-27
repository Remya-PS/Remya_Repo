package org.capgemini.demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionDemo {
	
	private Set<Address> names;
	
	private Map<Integer, String> maps;
	
	
	private Properties properties;
	
	
	public CollectionDemo(){}

	public CollectionDemo(Set<Address> names) {
		super();
		this.names = names;
	}

	
	
	
	
	
	
	
	
	
	
	
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<Integer, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<Integer, String> maps) {
		this.maps = maps;
	}

	public Set<Address> getNames() {
		return names;
	}

	public void setNames(Set<Address> names) {
		this.names = names;
	}
	
	

}

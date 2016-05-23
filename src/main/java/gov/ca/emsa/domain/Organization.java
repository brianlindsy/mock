package gov.ca.emsa.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Organization {
	
	private String name;
	private Long id;
	private boolean isActive;
	private String adapter;
	private String ipAddress;
	private String username;
	private String password;
	private String certificationKey;
	
	public Organization(){}
	
	public Organization(String name){
		this.name = name;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	@XmlElement
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getAdapter() {
		return adapter;
	}
	
	@XmlElement
	public void setAdapter(String adapter) {
		this.adapter = adapter;
	}

	public String getIpAddress() {
		return ipAddress;
	}
	
	@XmlElement
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getUsername() {
		return username;
	}
	
	@XmlElement
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	
	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}

	public String getCertificationKey() {
		return certificationKey;
	}
	
	@XmlElement
	public void setCertificationKey(String certificationKey) {
		this.certificationKey = certificationKey;
	}

	public Long getId() {
		return id;
	}
	
	@XmlElement
	public void setId(Long id) {
		this.id = id;
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getName(){
		return name;
	}

}
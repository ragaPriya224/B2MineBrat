package com.minebratPractice.barebone_jpa_starter;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//1 employee - > 1 access card

@Entity
public class AccessCard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Date issuedDate;
	private boolean isActive;
	private String firmwareVersion;
	
	@OneToOne(mappedBy = "card") //way to specify
	private Employee owner;
	
	public Employee getOwner() {
		return owner;
	}
	public void setOwner(Employee owner) {
		this.owner = owner;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(Date issuedDate) {
		this.issuedDate = issuedDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getFirmwareVersion() {
		return firmwareVersion;
	}
	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}
	
	
	@Override
	public String toString() {
		return "AccessCard [id=" + id + ", issuedDate=" + issuedDate + ", isActive=" + isActive + ", firmwareVersion="
				+ firmwareVersion + "]";
	}
	
	
}

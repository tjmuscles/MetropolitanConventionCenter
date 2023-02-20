package com.bah.metro.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REGISTRATIONS")
public class Registration {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="EVENT_ID")
	private Integer eventId;
	
	@Column(name="CUSTOMER_ID")
	private Integer customerId;
	
	@Column(name="REGISTRATION_DATE")
	private String timestamp;
	
	private String notes;

	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Integer getEventId() {
		return eventId;
	}


	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}
	

	public Integer getCustomerId() {
		return customerId;
	}



	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public String getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}


	public String getNotes() {
		return notes;
	}


	public void setNotes(String notes) {
		this.notes = notes;
	}


	@Override
	public String toString() {
		return "Registration [id=" + id + ", eventId=" + eventId + ", customerId=" + customerId + ", timestamp="
				+ timestamp + ", notes=" + notes + "]";
	}

	
	
}

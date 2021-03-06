package com.store.storeapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class CardCustomer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cardId;
	
	@ManyToOne
	@JoinColumn(name="CUSTOMER_FK")
	private Customer customer;
	
	@NotNull
	private String nameCardHolder;

	@NotNull
	private long cardNumber;
	
	private String expirationDate;
	
	@NotNull
	private String typeCard;
	
	@NotNull
	private int cardSecurityCode;
	
	//construct
	public CardCustomer() {}

	//getters and setters
	public long getCardId() {
		return cardId;
	}

	public void setCardId(long cardId) {
		this.cardId = cardId;
	}

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY) 
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomerId(Customer customer) {
		this.customer = customer;
	}

	public String getNameCardHolder() {
		return nameCardHolder;
	}

	public void setNameCardHolder(String nameCardHolder) {
		this.nameCardHolder = nameCardHolder;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getTypeCard() {
		return typeCard;
	}

	public void setTypeCard(String typeCard) {
		this.typeCard = typeCard;
	}

	public int getCardSecurityCode() {
		return cardSecurityCode;
	}

	public void setCardSecurityCode(int cardSecurityCode) {
		this.cardSecurityCode = cardSecurityCode;
	}	
}

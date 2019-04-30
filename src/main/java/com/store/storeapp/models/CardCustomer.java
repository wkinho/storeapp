package com.store.storeapp.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.lang.NonNull;

@Entity
public class CardCustomer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cardId;
	
	@ManyToOne
	private Customer customerId;
	
	@NonNull
	private String nameCardHolder;

	@NonNull
	private long cardNumber;
	
	@NonNull
	private Date expirationDate;
	
	@NonNull
	private String typeCard;
	
	@NonNull
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

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
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

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
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
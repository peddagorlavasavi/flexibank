package com.scrotify.flexibank.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@SequenceGenerator(name = "creditCardNumber", initialValue = 98834573, allocationSize = 1)
public class CreditCard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "creditCardNumber")
	private Long creditCardNumber;
	private Integer cvv;
	private Integer pin;
	private LocalDate expiryDate;
	private Double cardLimit;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_number")
	private Account account;
	

}

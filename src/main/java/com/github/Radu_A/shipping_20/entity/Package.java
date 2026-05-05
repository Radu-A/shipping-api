package com.github.Radu_A.shipping_20.entity;

import java.util.UUID;

import com.github.Radu_A.shipping_20.PackageStatusEnum;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Package {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String trackingCode;
	private double weight;
	@Enumerated(EnumType.STRING)
	private PackageStatusEnum status;
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	 
	// Constructors
 	public Package() {
	}
	
	public Package(double weight, PackageStatusEnum status) {
		this.trackingCode = UUID.randomUUID().toString();
		this.weight = weight;
		this.status = status;
	}
	
	// Getters and setters
	public Long getId() {
		return id;
	}

	public String getTrackingCode() {
		return trackingCode;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public PackageStatusEnum getStatus() {
		return status;
	}

	public void setStatus(PackageStatusEnum status) {
		this.status = status;
	}
	

}

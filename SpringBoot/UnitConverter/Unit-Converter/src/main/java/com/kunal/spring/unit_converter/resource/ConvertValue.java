package com.kunal.spring.unit_converter.resource;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConvertValue {

	@Id
	private Long id;
	@Column(name="unit_from")
	private String from;
	@Column(name="unit_to")
	private String to;
	private BigDecimal conversionMultiple;
	private String conversionEnvironmentInfo;
	
	public ConvertValue() {
		
	}

	public ConvertValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public String getConversionEnvironmentInfo() {
		return conversionEnvironmentInfo;
	}

	public void setConversionEnvironmentInfo(String conversionEnvironmentInfo) {
		this.conversionEnvironmentInfo = conversionEnvironmentInfo;
	}

	@Override
	public String toString() {
		return "ConvertValue [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiple=" + conversionMultiple
				+ ", conversionEnvironmentInfo=" + conversionEnvironmentInfo + "]";
	}
	
	
	
}

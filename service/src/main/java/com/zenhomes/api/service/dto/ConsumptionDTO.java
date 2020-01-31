package com.zenhomes.api.service.dto;

public class ConsumptionDTO {

	private String name;
	
	private double consumption;

	public ConsumptionDTO(String name, double consumption) {
		super();
		this.name = name;
		this.consumption = consumption;
	}

	public String getName() {
		return name;
	}

	public double getConsumption() {
		return consumption;
	}

	@Override
	public String toString() {
		return "ConsumptionDTO [name=" + name + ", consumption=" + consumption + "]";
	}
	
}

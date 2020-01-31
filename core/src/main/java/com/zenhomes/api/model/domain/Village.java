package com.zenhomes.api.model.domain;

import java.util.ArrayList;
import java.util.List;

public final class Village {

	private int id;

	private String name;

	private List<Consumption> consumptions = new ArrayList<Consumption>();

	public Village(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void addConsumption(final Consumption consumption) {
		this.consumptions.add(consumption);
	}
	
	public double consumptionReport(final int duration) {
		double amount = 0;
		for (int i = 0; i < duration; i++) {
			amount += this.consumptions.get(i).getAmount();
		}
		return amount;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Consumption> getConsumptions() {
		return consumptions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consumptions == null) ? 0 : consumptions.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Village other = (Village) obj;
		if (consumptions == null) {
			if (other.consumptions != null)
				return false;
		} else if (!consumptions.equals(other.consumptions))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Village [id=" + id + ", name=" + name + ", consumptions=" + consumptions + "]";
	}

}
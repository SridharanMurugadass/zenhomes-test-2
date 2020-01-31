package com.zenhomes.api.model.domain;

import java.util.Date;

public final class Consumption {

	private int id;

	private int counter;

	private double amount;

	private Date timestamp;

	private Village village;

	public Consumption(int id, int counter, double amount, Village village) {
		super();
		this.id = id;
		this.counter = counter;
		this.amount = amount;
		this.timestamp = new Date();
		this.village = village;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Village getVillage() {
		return village;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + counter;
		result = prime * result + id;
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((village == null) ? 0 : village.hashCode());
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
		Consumption other = (Consumption) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (counter != other.counter)
			return false;
		if (id != other.id)
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (village == null) {
			if (other.village != null)
				return false;
		} else if (!village.equals(other.village))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Consumption [id=" + id + ", counter=" + counter + ", amount=" + amount + ", timestamp=" + timestamp
				+ "]";
	}

}

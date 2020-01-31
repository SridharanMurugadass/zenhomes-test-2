package com.zenhomes.api.service;

import java.util.List;

import com.zenhomes.api.model.domain.Village;
import com.zenhomes.api.service.dto.ConsumptionDTO;

public interface Service {

	public void addConsumption(final Village village, final double amount);
	
	public Village getInformation(final int counter);

	public List<ConsumptionDTO> getConsumption(final int duration);
	
}

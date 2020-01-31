package com.zenhomes.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.zenhomes.api.model.domain.Consumption;
import com.zenhomes.api.model.domain.Village;
import com.zenhomes.api.model.entity.VillageEntity;
import com.zenhomes.api.service.Service;
import com.zenhomes.api.service.dto.ConsumptionDTO;

public class ReportService implements Service {

	@Override
	public void addConsumption(Village village, double amount) {
		final Consumption consumption = new Consumption(1, 1, amount, village);
		village.addConsumption(consumption);
	}

	@Override
	public Village getInformation(int counter) {
		return new VillageEntity().getByCounterId(counter);
	}

	@Override
	public List<ConsumptionDTO> getConsumption(int duration) {
		final List<Village> villages = new VillageEntity().getVillages();
		final List<ConsumptionDTO> dtos = new ArrayList<ConsumptionDTO>();
		
		for (Village village : villages) {
			final double consumption = village.consumptionReport(duration);
			final ConsumptionDTO consumptionDTO = new ConsumptionDTO(village.getName(), consumption);
			dtos.add(consumptionDTO);
		}
		
		return dtos;
	}
	
}
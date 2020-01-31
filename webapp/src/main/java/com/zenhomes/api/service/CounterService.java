package com.zenhomes.api.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zenhomes.api.dto.Counter;
import com.zenhomes.api.model.domain.Village;
import com.zenhomes.api.service.impl.ReportService;

@Path("/counter")
public class CounterService {
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Counter getCounter(@PathParam("id") int id) {

		final ReportService service = new ReportService();
		final Village village = service.getInformation(id);
		final Counter counter = new Counter();

		counter.setId(village.getId());
		counter.setVillage_name(village.getName());

		return counter;
	}
}
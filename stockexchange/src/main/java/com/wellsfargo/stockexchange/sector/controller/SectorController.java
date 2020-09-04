package com.wellsfargo.stockexchange.sector.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wellsfargo.stockexchange.sector.entity.Sector;
import com.wellsfargo.stockexchange.sector.model.Company;
import com.wellsfargo.stockexchange.sector.model.CompanyList;
import com.wellsfargo.stockexchange.sector.service.SectorService;

@RestController
@RequestMapping("/sectors")
public class SectorController {
	
	@Autowired
	private SectorService sectorService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/all")
	public List<Sector> getAllSectors()
	{
		return sectorService.getAllSectors();
	}
	
	@GetMapping("/{id}")
	public Optional<Sector> getSector(@PathVariable String id)
	{
		return sectorService.getSector(id);
	}
	
	@PostMapping
	public Sector addSector(@RequestBody Sector sector)
	{
		Sector s = sectorService.addSector(sector);
		return s;
	}
	
	@PutMapping
	public Sector updateSector(@RequestBody Sector sector)
	{
		Sector s = sectorService.updateSector(sector);
		return s;
	}
	
	
	//Consuming the API from company 
	//Retrieve the list of companies belonging to a sector
	
	@GetMapping("/list-companies/{sectorId}")
	public List<Company> getListCompany(@PathVariable String sectorId)
	{
		CompanyList companies = restTemplate.getForObject("http://company-microservice/company/sector/"+ sectorId, CompanyList.class);
		
		List<Company> list = companies.getCompanyList();
		return list;
		
		//return companies;
	}

}

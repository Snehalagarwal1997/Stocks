package com.wellsfargo.stockexchange.sector.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.stockexchange.sector.entity.Sector;
import com.wellsfargo.stockexchange.sector.repository.SectorRepository;


@Service
public class SectorService {
	
	@Autowired
	private SectorRepository sectorRepository;
		
	public List<Sector> getAllSectors()
	{
		List<Sector> sectors=new ArrayList<Sector>();
		for(Sector s:sectorRepository.findAll())
			sectors.add(s);
		return sectors;
		
	}
	
	public Optional<Sector> getSector(String id)
	{
		return sectorRepository.findById(id);
	}
	
	public Sector addSector(Sector sector) {
		
		Sector s = sectorRepository.save(sector);
		return s;
	}
	
	public Sector  updateSector(Sector sector) {
		Sector s = sectorRepository.save(sector);
		return s;
	}

}

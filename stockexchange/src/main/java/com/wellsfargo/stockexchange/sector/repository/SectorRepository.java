package com.wellsfargo.stockexchange.sector.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.stockexchange.sector.entity.Sector;

public interface SectorRepository extends JpaRepository<Sector, String> {

}

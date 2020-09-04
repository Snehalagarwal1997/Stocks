package com.wellsfargo.stockexchange.sector.model;

public class SectorModel {
	
	private String id;
	private String sector;
	private String description;
	
	public SectorModel() {
	}
	
	public SectorModel(String id,String sector, String description) {
		super();
		this.id=id;
		this.sector = sector;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Sector [id=" + id + ", sector=" + sector + ", description=" + description + "]";
	}

}

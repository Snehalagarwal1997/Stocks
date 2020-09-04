package com.wellsfargo.stockexchange.sector.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sector")
public class Sector {
	
		@Id
		@Column(length=50)
		private String id;
		
		@Column(name ="sector")
		private String sector;
		
		@Column(name="description")
		private String description;
		
		public Sector() {
		}
		
		public Sector(String id,String sector, String description) {
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


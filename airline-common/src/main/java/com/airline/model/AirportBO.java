package com.airline.model;

public class AirportBO {
	
	int airportCd;
	String airportName;
	
	public int getAirportCd() {
		return airportCd;
	}
	public void setAirportCd(int airportCd) {
		this.airportCd = airportCd;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + airportCd;
		result = prime * result + ((airportName == null) ? 0 : airportName.hashCode());
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
		AirportBO other = (AirportBO) obj;
		if (airportCd != other.airportCd)
			return false;
		if (airportName == null) {
			if (other.airportName != null)
				return false;
		} else if (!airportName.equals(other.airportName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AirportBO [airportCd=" + airportCd + ", airportName=" + airportName + "]";
	}
	
		
}

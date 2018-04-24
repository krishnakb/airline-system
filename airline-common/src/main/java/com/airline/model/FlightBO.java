package com.airline.model;

public class FlightBO {

	String flightNo;
	int source;
	int destination;
	String sourceAirportName;
	String destinationAirportName;
	
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public int getDestination() {
		return destination;
	}
	public void setDestination(int destination) {
		this.destination = destination;
	}
	public String getSourceAirportName() {
		return sourceAirportName;
	}
	public void setSourceAirportName(String sourceAirportName) {
		this.sourceAirportName = sourceAirportName;
	}
	public String getDestinationAirportName() {
		return destinationAirportName;
	}
	public void setDestinationAirportName(String destinationAirportName) {
		this.destinationAirportName = destinationAirportName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + destination;
		result = prime * result + ((destinationAirportName == null) ? 0 : destinationAirportName.hashCode());
		result = prime * result + ((flightNo == null) ? 0 : flightNo.hashCode());
		result = prime * result + source;
		result = prime * result + ((sourceAirportName == null) ? 0 : sourceAirportName.hashCode());
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
		FlightBO other = (FlightBO) obj;
		if (destination != other.destination)
			return false;
		if (destinationAirportName == null) {
			if (other.destinationAirportName != null)
				return false;
		} else if (!destinationAirportName.equals(other.destinationAirportName))
			return false;
		if (flightNo == null) {
			if (other.flightNo != null)
				return false;
		} else if (!flightNo.equals(other.flightNo))
			return false;
		if (source != other.source)
			return false;
		if (sourceAirportName == null) {
			if (other.sourceAirportName != null)
				return false;
		} else if (!sourceAirportName.equals(other.sourceAirportName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "FlightBO [flightNo=" + flightNo + ", source=" + source + ", destination=" + destination
				+ ", sourceAirportName=" + sourceAirportName + ", destinationAirportName=" + destinationAirportName
				+ "]";
	}
	
	
	
}

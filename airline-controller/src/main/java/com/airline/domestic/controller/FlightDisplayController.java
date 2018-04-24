package com.airline.domestic.controller;

import java.util.List;

import com.airline.model.FlightBO;
import com.airline.utils.FileInfoUtils;


public class FlightDisplayController {
	
	public void displayAllFlights(){
		FileInfoUtils fileInfoUtils = new FileInfoUtils();
		List<FlightBO> flights = fileInfoUtils.generateFlightBO();
		for(FlightBO flight:flights){
			System.out.println(flight);
		}
	}
	
	public void displayFlightBasedOnSourceDestinationCd(int source, int destination){
		FileInfoUtils fileInfoUtils = new FileInfoUtils();
		List<FlightBO> flights = fileInfoUtils.generateFlightBO();
		for(FlightBO flight:flights){
			if(flight.getSource() == source && flight.getDestination() == destination){
				System.out.println(flight);
			}
		}
	}
	
	public void displayFlightBetweenSourceDestinationCd(int source, int destination){
		FileInfoUtils fileInfoUtils = new FileInfoUtils();
		List<FlightBO> flights = fileInfoUtils.generateFlightBO();
		for(FlightBO flight:flights){
			if(flight.getSource() == source || flight.getDestination() == destination){
				System.out.println(flight);
			}
		}
	}

	public static void main(String[] args) {
		FlightDisplayController flightDisplayController = new FlightDisplayController();
		System.out.println("--Filtered Flights--");
//		flightDisplayController.displayFlightBasedOnSourceDestinationCd(7,10);
		flightDisplayController.displayFlightBetweenSourceDestinationCd(1,5);
//		System.out.println("--All Flights--");
//		flightDisplayController.displayAllFlights();
	}

}

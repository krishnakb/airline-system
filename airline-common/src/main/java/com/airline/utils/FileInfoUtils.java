package com.airline.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.airline.model.AirportBO;
import com.airline.model.FlightBO;

public class FileInfoUtils {

	public List<FlightBO> generateFlightBO(){
		FileUtils fu = new FileUtils();
		Stream<String> inputStream = fu.getFlightStream("C://Users//bhattk4//Documents//Java_projects_workspace//DataFiles//Flights_DB.txt");
		String[] str= {};
		List<String> list = inputStream.collect(Collectors.toList());
		List<FlightBO> flights = new ArrayList<>();
		for(String s:list){
			str = s.split("\\|");
			FlightBO fbo = new FlightBO();
			fbo.setFlightNo(str[0]);
			fbo.setSource(Integer.parseInt(str[1]));
			fbo.setDestination(Integer.parseInt(str[2]));
			flights.add(fbo);
		} 
		return flights;
	}
	
	public List<AirportBO> generateAirportBO(){
		FileUtils fu = new FileUtils();
		Stream<String> inputStream = fu.getFlightStream("C://Users//bhattk4//Documents//Java_projects_workspace//DataFiles//Airports_DB.txt");
		String[] str= {};
		List<String> list = inputStream.collect(Collectors.toList());
		List<AirportBO> airports = new ArrayList<>();
		for(String s:list){
			str = s.split("\\|");
			AirportBO fbo = new AirportBO();
			fbo.setAirportCd(Integer.parseInt(str[0]));
			fbo.setAirportName(str[1]);
			airports.add(fbo);
		} 
		return airports;
	}
}

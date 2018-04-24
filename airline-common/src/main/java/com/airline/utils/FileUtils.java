package com.airline.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUtils {

	public Stream<String> getFlightStream(String file){
		Stream<String> stream = null;
		try {
			stream = Files.lines(Paths.get(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stream;
	}
}

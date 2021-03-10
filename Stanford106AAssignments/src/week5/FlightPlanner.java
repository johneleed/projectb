/*This program reads in a file of cities and their corresponding flights,
 * and allows the user to plan a flight route.
 */

package week5;

import acm.program.ConsoleProgram;
import acm.util.*;
import java.io.*;
import java.util.*;

public class FlightPlanner extends ConsoleProgram {

	/** Runs the program. */
	public void run() {
		println("Welcome to Flight Planner!");
		readFlightData("flights.txt");
		println("Here's a list of all the cities in our database:");
		printCityList(cities);
		println("Let's plan a round-trip route!");
		String startCity = readLine("Enter the starting city: ");
		ArrayList<String> route = new ArrayList<String>();
		route.add(startCity);
		String currentCity = startCity;
		
		while (true) {
			String nextCity = getNextCity(currentCity);
			route.add(nextCity);
			if (nextCity.equals(startCity)) break;
			currentCity = nextCity;
		}
		printRoute(route);
	}
	
	/** Ask user for the name of the next city in the route */
	private String getNextCity(String city) {
		ArrayList<String> destinations = getDestinations(city);
		String nextCity = null;
		while (true) {
			println("From " + city + " you can fly directly to:");
			printCityList(destinations);
			String prompt = "Where do you want to go from " + city + "? ";
			nextCity = readLine(prompt);
			if (destinations.contains(nextCity)) break;
			println("You can't get to that city by a direct flight.");
		}
		return nextCity;
	}

	/**
	 * Given a starting city, looks up the destinations from that
	 * city in the HashMap of flights, and return an array list of
	 * the destinations that are available.
	 */
	private ArrayList<String> getDestinations(String fromCity) {
		return flights.get(fromCity);
	}
	/**
	 * Prints a list of cities from the array list. Each city name is
	 * indented by a space.
	 */
	private void printCityList(ArrayList<String> cityList) {
		for(int i = 0; i < cityList.size(); i++) {
			String city = cityList.get(i);
			println(" " + city);
		}
	}
	/**
	 * Given a list of city names, prints out the flight
	 * route, with a " -> " between each pair of cities
	 */
	private void printRoute(ArrayList<String> route) {
		println("The route you've chosen is: ");
		for (int i = 0; i < route.size(); i++) {
			if (i > 0) print(" -> ");
			print(route.get(i));
		}
		println();
	}
	/**
	 * Reads in the city information from the given file storing the
	 * information in both the ArrayList of cities and the HashMap of
	 * flights.
	 */
	private void readFlightData(String filename) {
		flights = new HashMap<String,ArrayList<String>>();
		cities = new ArrayList<String>();
		try {
			BufferedReader
			rd = new BufferedReader(new FileReader(filename));
			while (true) {
				String line = rd.readLine();
				if (line == null) break;
				if (line.length() != 0) {
					readFlightEntry(line);
				}
			}
			rd.close();
		} catch (IOException ex) {
			throw new ErrorException(ex);x
		}

	}

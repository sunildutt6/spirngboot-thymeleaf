package com.sunil.mvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favouriteLanguageInput;
	private String[] operatingSystem;

	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IN", "India");
		countryOptions.put("DK", "Denmark");
		countryOptions.put("PT", "Portugal");
		countryOptions.put("US", "America");

		favouriteLanguageInput = new LinkedHashMap<>();
		favouriteLanguageInput.put("J", "Java");
		favouriteLanguageInput.put("C", "C");
		favouriteLanguageInput.put("JS", "Javascript");
		favouriteLanguageInput.put("A", "Angular");
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public LinkedHashMap<String, String> getFavouriteLanguageInput() {
		return favouriteLanguageInput;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

}

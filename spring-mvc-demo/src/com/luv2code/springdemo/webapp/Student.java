/**
 * 
 */
package com.luv2code.springdemo.webapp;

import java.util.LinkedHashMap;

/**
 * @author mutsubra0
 *
 */
public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String countryOptionVal;
	private String favLang;
	private String[] operatingSystems;
	
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States");
		countryOptions.put("UK", "United Kingdom");
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the countryOptions
	 */
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	/**
	 * @param countryOptions the countryOptions to set
	 */
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	/**
	 * @return the countryOptionVal
	 */
	public String getCountryOptionVal() {
		return countryOptionVal;
	}

	/**
	 * @param countryOptionVal the countryOptionVal to set
	 */
	public void setCountryOptionVal(String countryOptionVal) {
		this.countryOptionVal = countryOptionVal;
	}

	/**
	 * @return the favLang
	 */
	public String getFavLang() {
		return favLang;
	}

	/**
	 * @param favLang the favLang to set
	 */
	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}

	/**
	 * @return the operatingSystems
	 */
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	/**
	 * @param operatingSystems the operatingSystems to set
	 */
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
}
/**
 * 
 */
package com.luv2code.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author mutsubra0
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			//create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			//read JSON file and map/convert to Java POJO
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//print name
			System.out.println("First Name : " + theStudent.getFirstName());
			
			//print address
			System.out.println(theStudent.getAddress().getCity());
			
			//print language
			for (String lang : theStudent.getLanguages()) {
				System.out.println(lang);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

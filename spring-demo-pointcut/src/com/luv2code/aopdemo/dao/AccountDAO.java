/**
 * 
 */
package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

/**
 * @author mutsubra0
 *
 */
@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + "DOING MY DB WORK: ADDING AN ACCOUNT");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		System.out.println(getClass() + ": in getName()");
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		System.out.println(getClass() + ": in setName()");
		this.name = name;
	}

	/**
	 * @return the serviceCode
	 */
	public String getServiceCode() {
		System.out.println(getClass() + ": in getServiceCode()");
		return serviceCode;
	}

	/**
	 * @param serviceCode the serviceCode to set
	 */
	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + ": in setServiceCode()");
		this.serviceCode = serviceCode;
	}
	
	public List<Account> findAccounts(boolean tripWire) {
	
		if (tripWire) {
			throw new RuntimeException("run time exception");
		}
		List<Account> myAccounts = new ArrayList<Account>();
		
		Account temp1 = new Account("Muthukumar", "Gold");
		Account temp2 = new Account("Nadi", "Silver");
		Account temp3 = new Account("Mahesh", "Platinum");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		return myAccounts;
	}
}

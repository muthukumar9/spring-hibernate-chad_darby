/**
 * 
 */
package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

/**
 * @author mutsubra0
 *
 */
@Component
public class MembershipDAO {

	public void addAccount() {
		System.out.println(getClass() + "DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
	}
}

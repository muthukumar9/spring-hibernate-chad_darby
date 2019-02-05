/**
 * 
 */
package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

/**
 * @author mutsubra0
 *
 */
@Component
public class AccountDAO {

	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + "DOING MY DB WORK: ADDING AN ACCOUNT");
	}
}

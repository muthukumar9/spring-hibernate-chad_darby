/**
 * 
 */
package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

/**
 * @author mutsubra0
 *
 */
public interface CustomerDAO {

	public List<Customer> getCustomers();

	public Object saveCustomer(Customer theCustomer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int theId);

	public List<Customer> searchCustomers(String searchName);
}

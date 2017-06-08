package service;

import domain.Customer;


public interface CustomerService {

	Customer findOne(Integer custId);

	void regist(Customer customer);

	Customer login(Customer customer);

	Customer findByName(String username);

	Customer findByEmail(String email);

}

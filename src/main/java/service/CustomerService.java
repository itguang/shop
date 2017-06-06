package service;

import domain.Customer;


public interface CustomerService {

	Customer findOne(String custId);

}

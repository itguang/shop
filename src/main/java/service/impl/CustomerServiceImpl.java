package service.impl;

import org.springframework.transaction.annotation.Transactional;

import service.CustomerService;
import dao.CustomerDao;
import domain.Customer;


@Transactional
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	public Customer findOne(String custId) {
		return customerDao.findOne(custId);
	}
}

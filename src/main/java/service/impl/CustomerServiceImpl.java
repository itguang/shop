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
	public Customer findOne(Integer custId) {
		return customerDao.findOne(custId);
	}
	@Override
	public void regist(Customer customer) {
		customerDao.regist(customer);
		
	}
	@Override
	public Customer login(Customer customer) {
		return customerDao.login(customer);
		
	}
	@Override
	public Customer findByName(String username) {
		return customerDao.findByName(username);
	}
	@Override
	public Customer findByEmail(String email) {
		// TODO Auto-generated method stub
		return customerDao.findByEmail(email);
	}
}

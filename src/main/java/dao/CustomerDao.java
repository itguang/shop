package dao;

import domain.Customer;

public interface CustomerDao {

	Customer findOne(Integer custId);
	/**
	 * 注册
	 * @param customer
	 */
	void regist(Customer customer);
	/**
	 * 登陆
	 * @param customer
	 * @return
	 */
	Customer login(Customer customer);
	Customer findByName(String username);
	Customer findByEmail(String email);

}

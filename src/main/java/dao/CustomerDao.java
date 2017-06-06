package dao;

import domain.Customer;

public interface CustomerDao {

	Customer findOne(String custId);

}

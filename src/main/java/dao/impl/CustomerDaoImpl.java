package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import dao.CustomerDao;
import domain.Customer;


public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	public Customer findOne(Integer custId) {
		return this.getHibernateTemplate().get(Customer.class, custId);
	}

	@Override
	public void regist(Customer customer) {
		this.getHibernateTemplate().save(customer);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Customer login(Customer customer) {
		
		String hql = "from Customer where username = ? and password=?";
		List<Customer> list = (List<Customer>) this.getHibernateTemplate().find(hql, customer.getUsername(),customer.getPassword());
		if(list!=null&&list.size()>0){
			return list.get(0);
			
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Customer findByName(String username) {
		String hql = "from Customer where username = ?";
		List<Customer> list = (List<Customer>) this.getHibernateTemplate().find(hql, username);
		if(list!=null&&list.size()>0){
			return list.get(0);
			
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Customer findByEmail(String email) {
		String hql = "from Customer where email = ?";
		List<Customer> list = (List<Customer>) this.getHibernateTemplate().find(hql, email);
		if(list!=null&&list.size()>0){
			return list.get(0);
			
		}
		
		return null;
	}

	
}

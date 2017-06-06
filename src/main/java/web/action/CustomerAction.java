package web.action;


import service.CustomerService;

import com.opensymphony.xwork2.ActionSupport;

import domain.Customer;

public class CustomerAction extends ActionSupport {
	
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	
	public String save(){
		Customer customer = customerService.findOne("1");
		System.out.println("++++++++++"+customer.toString());
		
		return "success";
	}

}

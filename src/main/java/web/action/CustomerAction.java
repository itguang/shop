package web.action;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import service.CustomerService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Customer;

public class CustomerAction extends ActionSupport implements
		ModelDriven<Customer> ,Serializable{

	// 模型驱动
	private Customer customer = new Customer();

	@Override
	public Customer getModel() {
		return customer;
	}

	// 注入service
	private CustomerService customerService;

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public String save() {
		Customer customer = customerService.findOne(1);
		System.out.println("++++++++++" + customer.toString());

		return "success";
	}
	
	//注销功能
	public String logout(){
		HttpServletRequest  request = ServletActionContext.getRequest();
		request.getSession().removeAttribute("currentCustomer");
		
		return "logout";
	}
	

	// 注册功能
	public String regist() {
		//客户端校验:略
		 customerService.regist(customer);
		return "regist";
	}

	@SuppressWarnings("unchecked")
	public String login() {
//		System.out.println(customer.getUsername()+customer.getPassword());
	
		HttpServletRequest  request = ServletActionContext.getRequest();
		Customer cus = customerService.login(customer);
		if(cus==null){
			Map msg = new HashMap<String,String>();
			msg.put("info", "用户名或密码错误");
			
			request.setAttribute("map", msg);
			return "loginError";
			
		}else{
			request.getSession().setAttribute("currentCustomer", customer);
			return "loginSuccess";
		}
		
	}

	// ajx获取数据验证用户名是否存在

	public String findByName() throws IOException {
		Customer exitCustomer = customerService.findByName(customer
				.getUsername());
		// 获得response对象,项页面输出:
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");

		//判断
		if(exitCustomer!=null){
			//用户名已存在
			response.getWriter().println("用户名已被占用,傻吊");
		}
		return NONE;
	}
	// ajx获取数据验证邮箱是否存在
	public String findByEmail() throws IOException {
		Customer exitCustomer = customerService.findByEmail(customer.getEmail());
		// 获得response对象,项页面输出:
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");

		//判断
		if(exitCustomer!=null){
			//邮箱已被注册
			response.getWriter().println("该邮箱已被注册,傻吊");
		}
		
		return NONE;
	}
}

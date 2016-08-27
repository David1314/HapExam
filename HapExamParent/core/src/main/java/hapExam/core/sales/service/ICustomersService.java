package hapExam.core.sales.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;

import hapExam.core.sales.dto.Customers;

public interface ICustomersService extends IBaseService<Customers>, ProxySelf<ICustomersService>{
	
	List<Customers> selectByCustomers(IRequest requestContext, Customers customers, int page, int pagesize);
}

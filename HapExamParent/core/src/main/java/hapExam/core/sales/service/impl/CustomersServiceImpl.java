package hapExam.core.sales.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;

import hapExam.core.sales.dto.Customers;
import hapExam.core.sales.mapper.CustomersMapper;
import hapExam.core.sales.service.ICustomersService;

@Service
public class CustomersServiceImpl extends BaseServiceImpl<Customers> implements ICustomersService{

	@Autowired
	private CustomersMapper customersMapper;

	@Override
	public List<Customers> selectByCustomers(IRequest requestContext, Customers customers, int page, int pagesize) {
		PageHelper.startPage(page, pagesize);
		return customersMapper.selectByCustomers(customers);
	}
	
	

}

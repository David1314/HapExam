package hapExam.core.sales.mapper;

import java.util.List;

import com.hand.hap.mybatis.common.Mapper;

import hapExam.core.sales.dto.Customers;

public interface CustomersMapper extends Mapper<Customers>{
	List<Customers> selectByCustomers(Customers customers);
    
   /* int insertCustomers(Customers customers);
    
    int updateCustomers(Customers customers);
    
    int deleteCustomers(Customers customers);*/
}

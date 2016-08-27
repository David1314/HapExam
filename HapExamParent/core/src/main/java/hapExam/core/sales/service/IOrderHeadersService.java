package hapExam.core.sales.service;

import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;

import hapExam.core.sales.dto.OrderHeaders;

public interface IOrderHeadersService extends IBaseService<OrderHeaders>, ProxySelf<IOrderHeadersService>{
	
	List<OrderHeaders> selectByOrderHeaders(IRequest requestContext, OrderHeaders orderHeaders, int page, int pagesize);
	
	List<OrderHeaders> selectOrderStatus(IRequest requestContext, OrderHeaders orderHeaders, int page, int pagesize);
	
	List<OrderHeaders> batchUpdate(IRequest requestContext, @StdWho List<OrderHeaders> OrderHeadersList);
}
